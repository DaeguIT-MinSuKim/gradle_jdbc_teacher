package gradle_jdbc_teacher.dao;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import gradle_jdbc_teacher.dao.impl.EmployeeDaoImpl;
import gradle_jdbc_teacher.util.LogUtil;

public class EmployeeDaoTest {
	static EmployeeDao dao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		dao = EmployeeDaoImpl.getInstance();
	}

	@Test
	public void testSelectEmployeeByNo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectEmployeeByAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testLoginEmployee() {
		fail("Not yet implemented");
	}

}
