package com.tvsmotor.day6.exception;

class InvalidateNameException extends RuntimeException
{
	String msg;
	public InvalidateNameException(String msg)
	{
		super(msg);
		this.msg = msg;
	}
}

//class NullPointerException extends RuntimeException
//{
//	String msg;
//	public NullPointerException(String msg)
//	{
//		super(msg);
//		this.msg = msg;
//	}
//}

class Name 
{
	public void validate(String firstname, String lastname)
	{
		
//		if(firstname.length() <= 3 || lastname.length() <= 3)
//		{
//			System.out.println("HELLO FROM VALIDATE");
//			throw new InvalidateNameException("The length of your first or last name cannot be less than/ = 3 characters.");
//		}
//		
//		
//		else if(firstname == null || lastname == null)
//		{
//			System.out.println("HELLO FROM NPE");
//			throw new NullPointerException("The first name or last name can never be null.");
//		}

		
		
		if(firstname == null || lastname == null)
		{
			System.out.println("HELLO FROM NPE");
			throw new NullPointerException("The first name or last name can never be null.");
		}

		else if(firstname.length() <= 3 || lastname.length() <= 3)
		{
			System.out.println("HELLO FROM VALIDATE");
			throw new InvalidateNameException("The length of your first or last name cannot be less than/ = 3 characters.");
		}
		
		else 
		{
			System.out.println("The given name "+ firstname +" "+ lastname+" are eligible and will be proceeded further with.");
		}
			
	}
}

public class Task2 {
	public static void main(String[] args) {
		Name name = new Name();
		try
		{
//			name.validate("Hel", null);	
//			name.validate(null, "Hel");
//			name.validate("Hel", "Wel");	
			name.validate(null, null);
//			name.validate("Sutharsan", "Raj");
//			name.validate("Sutharsan", null);
//			name.validate(null, "Raja");
//			name.validate("Sutharsan", "Raja");
			
		}
		catch (InvalidateNameException i)
		{
			System.out.println(i.getMessage());
		}
		catch (NullPointerException n)
		{
			System.out.println(n.getMessage());
		}
	}

}
