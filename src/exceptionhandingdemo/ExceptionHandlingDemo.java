package exceptionhandingdemo;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Numerator");
			int numerator=sc.nextInt();
			
			System.out.println("Enter Denominator");
			int denominator=sc.nextInt();
			//structure of Exception Handling
			try //write the code which can throw exception
			{
			double result=numerator/denominator;  //ArthmeticException crash
		
			System.out.println("Result is "+result);
			}
			catch(ArithmeticException ex1) //write the code which can handle exception
			{
				System.out.println("Please enter a non zero denominator");
			}
			finally	//exceptio aao ya toh mat aoo finally block will always 100% be executed
			{		//exception aaya toh  try->catch->finally
					//exception nahi aaya toh  try->finally
			System.out.println("Thank You, Visit again");
			}
	}

}
//Defination Exception
//it is an unwantes/unexpected event
//occuring at runtime
//disturbing the normal flow of programm execution
//when exception occurs and if it is not handled program will crash