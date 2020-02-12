package gradle_jdbc_teacher.ui.service;

import java.util.List;

import gradle_jdbc_teacher.dao.DepartmentDao;
import gradle_jdbc_teacher.dao.EmployeeDao;
import gradle_jdbc_teacher.dao.TitleDao;
import gradle_jdbc_teacher.dao.impl.DepartmentDaoImpl;
import gradle_jdbc_teacher.dao.impl.EmployeeDaoImpl;
import gradle_jdbc_teacher.dao.impl.TitleDaoImpl;
import gradle_jdbc_teacher.dto.Department;
import gradle_jdbc_teacher.dto.Employee;
import gradle_jdbc_teacher.dto.Title;

public class EmployeeUIService {
	private EmployeeDao empDao;
	private DepartmentDao deptDao;
	private TitleDao titleDao;
	
	public EmployeeUIService() {
		empDao = EmployeeDaoImpl.getInstance();
		deptDao = DepartmentDaoImpl.getInstance();
		titleDao = TitleDaoImpl.getInstance();
	}

	public List<Department> showDeptList() {
		return deptDao.selectDepartmentByAll();
	}

	public List<Employee> showManagerList(Department dept) {
		return empDao.selectEmployeeGroupByDno(dept);
	}

	public List<Title> showTitleList() {
		return titleDao.selectTitleByAll();
	}

	public List<Employee> showEmployeeList() {
		return empDao.selectEmployeeByAll();
	}

	public void removeEmployee(Employee emp) {
		empDao.deleteEmployee(emp);
	}

	public void modifyEmployee(Employee emp) {
		empDao.updateEmployee(emp);
	}

	public void addEmployee(Employee emp) {
		empDao.insertEmployee(emp);
	}
	
	
}
