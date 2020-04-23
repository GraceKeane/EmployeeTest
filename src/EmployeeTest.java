import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// Ordinary test case
public class EmployeeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateWeeklyPay() {
		Employee emp = new Employee(123, 30, 20);
		
		float actual = emp.calculateWeeklyPay();
		
		assertEquals((float)600, actual, 0.0);
	}

	@Test
	public void testUpdateHourlyRate() {
		
		Employee emp = new Employee(123, 30, 20);
		
		emp.updateHourlyRate(40);
		
		float actualRate = emp.getHourlyRate();
		
		assertEquals((float)40, actualRate, 0.0);	
	}

	@Test
	public void testGetHourlyRate() {
		
		Employee emp = new Employee(123, 30, 20);
		
		float actualRate = emp.getHourlyRate();
		
		assertEquals((float)30, actualRate, 0.0);	
	}

}
