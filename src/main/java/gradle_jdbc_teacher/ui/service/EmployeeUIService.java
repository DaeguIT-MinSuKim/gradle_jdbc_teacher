package gradle_jdbc_teacher.ui.service;

import java.util.List;

import gradle_jdbc_teacher.dao.DepartmentDao;
import gradle_jdbc_teacher.dao.EmployeeDao;
import gradle_jdbc_teacher.dao.impl.DepartmentDaoImpl;
import gradle_jdbc_teacher.dao.impl.EmployeeDaoImpl;
import gradle_jdbc_teacher.dto.Department;

public class EmployeeUIService {
	private EmployeeDao empDao;
	private DepartmentDao deptDao;
	
	public EmployeeUIService() {
		empDao = EmployeeDaoImpl.getInstance();
		deptDao = DepartmentDaoImpl.getInstance();
	}

	public List<Department> showDeptList() {
		return deptDao.selectDepartmentByAll();
	}
	
	
}
