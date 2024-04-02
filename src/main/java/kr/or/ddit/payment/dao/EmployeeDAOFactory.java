package kr.or.ddit.payment.dao;

public class EmployeeDAOFactory {
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl_Maria();
	}
}
