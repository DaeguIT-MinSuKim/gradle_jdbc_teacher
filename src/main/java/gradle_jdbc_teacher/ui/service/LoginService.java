package gradle_jdbc_teacher.ui.service;

import gradle_jdbc_teacher.dao.EmployeeDao;
import gradle_jdbc_teacher.dao.impl.EmployeeDaoImpl;
import gradle_jdbc_teacher.dto.Employee;

public class LoginService {
	private EmployeeDao dao = EmployeeDaoImpl.getInstance();
	
	public Employee login(Employee emp) {
		return dao.loginEmployee(emp);
	}
}
