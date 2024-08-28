package com.tvsmotor.day6.exception;

// // ---------------------------RUNTIME EXCEPTION -------------------------------------------

//class InValidAgeException extends RuntimeException
//{
//	String msg;
//
//	public InValidAgeException(String msg) {
//		// super(); // Without passing msg it will return 'null' if not using getMsg() method.
//		super(msg); // Passing msg in this will help in NOT requiring getMsg() method itself.
//		this.msg = msg;
//	}
//
//	public String getMsg() {
//		return msg;
//	}
//	
//}

//class EmployeeService
//{
//	public void validateAge(int age)
//	{
//		if(age >= 22)
//			System.out.println("Eligible to Work in Office");
//		else
//			throw new InValidAgeException("Your age is not eligible, minimum age is 22.");
//	}
//}
// // -------------------------------------------------------------------------------------------------


//-------------------------------------COMPILE TIME EXCEPTION -------------------------------------------

class InValidAgeException extends Exception
{
	String msg;

	public InValidAgeException(String msg) {
		// super(); // Without passing msg it will return 'null' if not using getMsg() method.
		super(msg); // Passing msg in this will help in NOT requiring getMsg() method itself.
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
}

class EmployeeService
{
	public void validateAge(int age) throws InValidAgeException // Note the change here.
	{
		if(age >= 22)
			System.out.println("Eligible to Work in Office");
		else
			throw new InValidAgeException("Your age is not eligible, minimum age is 22.");
	}
}
//-------------------------------------------------------------------------------------------------

public class CustomExceptionDemo {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		// employeeService.validateAge(23);
		try
		{
			employeeService.validateAge(12);
			// employeeService.validateAge(18);
		}
		catch(InValidAgeException e)
		{
			System.out.println(e.getMsg());
			System.out.println(e.getMessage());
			
		}
		
	}

}
