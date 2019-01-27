package calculator;

import java.util.Scanner;

public class Main extends Operands
{	
	public static void main(String[]args)
	{
		takeInputAndCalculateTotal();
	}

	private static void takeInputAndCalculateTotal() 
	{
		try
		{
			Scanner takeInput = new Scanner(System.in);
			System.out.println("Enter the calculation in a line");

			String rePrint = takeInput.nextLine().toLowerCase();

			Operands op1 = new Operands();
			System.out.println("Total " + op1.calculateTotalBasedOnString(rePrint));
		}
		catch (Exception exMain)
		{
			System.out.println("please give proper input to perfom the action");
			takeInputAndCalculateTotal();
		}
	}
}
