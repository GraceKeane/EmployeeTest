public class Employee {

	private int employeeNumber;
	private float hourlyRate;
	private int hoursPerWeek;
	
	public Employee(int employeeNumberInit, float hourlyRateInit, int hoursPerWeekInit)
	{
		employeeNumber = employeeNumberInit;
		hourlyRate =  hourlyRateInit;
		hoursPerWeek = hoursPerWeekInit;
		
	}
	
	
	public float calculateWeeklyPay()
	{
		float weeklyPay;
		
		if(hoursPerWeek<=40)
			weeklyPay = hourlyRate * hoursPerWeek;
		
		else
			weeklyPay = hourlyRate * 40 + hourlyRate*(hoursPerWeek-40)*(float)1.5;
		
		return weeklyPay;
		
	}
	
	public void updateHourlyRate(float newRate)
	{
		hourlyRate = newRate;
	}
	
	public float getHourlyRate()
	{
		return hourlyRate;
	}
	
	public void updateHoursWorked(int newHoursWorked)
	{
		hoursPerWeek = newHoursWorked;
	}
	
}
