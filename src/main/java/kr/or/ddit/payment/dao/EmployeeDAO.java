package kr.or.ddit.payment.dao;

import org.springframework.stereotype.Repository;

public interface EmployeeDAO {
	public StringBuffer selectEmployee(String empCode);
}
