package kr.or.ddit.payment.service;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.or.ddit.payment.dao.EmployeeDAO;
import kr.or.ddit.payment.dao.EmployeeDAOFactory;
import kr.or.ddit.payment.dao.EmployeeDAOImpl_Maria;
import kr.or.ddit.payment.dao.EmployeeDAOImpl_Oracle;
import kr.or.ddit.payment.dao.SalaryDAO;
import kr.or.ddit.payment.dao.SalaryDAOImpl;

@Service
public class PaymentServiceImpl implements PaymentService {
//	1. new로 인스턴스를 직접 생성(결합력 최상)
//	private EmployeeDAO empDAO = new EmployeeDAOImpl_Maria();
	
//	2. Factory Object Pattern
//	private EmployeeDAO empDAO = EmployeeDAOFactory.getEmployeeDAO();
	
//	3. Strategy Pattern (전략 패턴) (DI구조) : 전략의 주입자가 모든 결합력을 떠안게됨.
	
	private EmployeeDAO empDAO;
	private SalaryDAO salDAO;
	
	@Resource(name = "oracle")
	public void setEmpDAO(EmployeeDAO empDAO) {
		this.empDAO = empDAO;
	}
	@Inject
	public void setSalDAO(SalaryDAO salDAO) {
		this.salDAO = salDAO;
	}
	
	@Override
	public StringBuffer payMonthly(String empCode) {
		StringBuffer model = empDAO.selectEmployee(empCode);
		long salary = salDAO.selectSalary(empCode);
		long monthly = salary / 12 ;
		model.append("이번달 급여 : " + monthly);
		return model;
	}
}
