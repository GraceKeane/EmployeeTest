import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// Step 1 - import
// Parameterized test case
@RunWith(Parameterized.class)
public class EmployeeParam {
	
	// Step 2 - variables
	private int employeeID;
	private int hoursWorked;
	private float hourlyRate;
	private float expectedPay;
	
	private float newRate;
	
	// Step 3 - constructor
	public EmployeeParam(int employeeID, int hoursWorked, float hourlyRate, float expectedPay, float newRate) {
		super();
		this.employeeID = employeeID;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		this.expectedPay = expectedPay;
		this.newRate = newRate;
	}
	
	// Step 4 - adding data
	@Parameters
	public static Collection<Object[]> getData()
	{
		Object[][] data = new Object[2][5];
		
		// Data set 1
		data[0][0] = 1234;
		data[0][1] = 40;
		data[0][2] = 50;
		data[0][3] = (float)2000;
		data[0][4] = (float)30.00;
		
		// Data set 2
		data[1][0] = 12345;
		data[1][1] = 30;
		data[1][2] = 40;
		data[1][3] = (float)1200;
		data[1][4] = (float)40.33;
		
		return Arrays.asList(data);
	}
	
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

	// Step 5 - write methods using <this> keyword
	@Test
	public void testCalculateWeeklyPay() {
		Employee emp = new Employee(this.employeeID, this.hourlyRate, this.hoursWorked);
		
		float actual = emp.calculateWeeklyPay();
		
		assertEquals((float)this.expectedPay, actual, 0.0);
	}

	@Test
	public void testUpdateHourlyRate() {
		Employee emp = new Employee(this.employeeID, this.hourlyRate, this.hoursWorked);
		
		emp.updateHourlyRate(this.newRate);
		
		float actualRate = emp.getHourlyRate();
		
		assertEquals((float)this.newRate, actualRate, 0.0);	
	}

	@Test
	public void testGetHourlyRate() {
		Employee emp = new Employee(this.employeeID, this.hourlyRate, this.hoursWorked);
		
		float actualRate = emp.getHourlyRate();
		
		assertEquals((float)this.hourlyRate, actualRate, 0.0);	

	}
}
