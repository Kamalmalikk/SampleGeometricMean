import java.util.Scanner;
import java.lang.Math;

public class SampleAverage 
{
	public static void main (String args[])
	{
		Scanner inputLine = new Scanner (System.in);
		
		double NumberEntered = 0; 
		double NumbersMultiplied = 1;
		double result; //use count; for Arithmetic Mean
		
		System.out.println("Enter the digits to calculate the Geometric Mean.");
		System.out.println("Enter -1 to terminate the program");
		
		do 
		{
			System.out.print("Enter a number:");
			NumberEntered = inputLine.nextDouble();
			
			if (NumberEntered > 0) //values of 0 will be ignored
			{
				//use count ++; for Arithmetic Mean
				NumbersMultiplied *= NumberEntered;
			}
		}
		while (NumberEntered != -1); //use -1 to end the list of numbers
		{
			result = Math.sqrt(NumbersMultiplied); 
			System.out.println("The Geometric Mean of these numbers is = " + result);	
		}
	}
}
