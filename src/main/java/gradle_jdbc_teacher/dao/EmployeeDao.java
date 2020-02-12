package gradle_jdbc_teacher.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import gradle_jdbc_teacher.dto.Department;
import gradle_jdbc_teacher.dto.Employee;

public interface EmployeeDao {
	Employee selectEmployeeByNo(Employee emp);
	List<Employee> selectEmployeeByAll();
	
	int insertEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int deleteEmployee(Employee emp);
	
	Employee loginEmployee(Employee emp);
	
	List<Employee> selectEmployeeGroupByDno(Department dept);
}
