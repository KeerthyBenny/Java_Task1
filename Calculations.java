package calculator;

import java.util.Scanner;

public class Calculations {

	private static String findString;

	public static void main(String[] args) 
	{

		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		String str = s.nextLine();
		String array[]= str.split(" ");
		int[] numberCount = new int [2];
		int count=0;

		for (int i=0; i<array.length; i++)
		{
			try {
				numberCount[count] = Integer.parseInt(array[i]);
				System.out.println("the number- " + numberCount[count]);
				count++;
			}
			catch(Exception ex)
			{
				if (findStringValue(array[i]) != null)
				{
					findString = findStringValue(array[i]);
				}

			}

		}
		try {
			if (findString.equals("add"))
			{
				System.out.println(numberCount[0] + numberCount[1]);
			}
			else if (findString.equals("sub"))
			{
				System.out.println(numberCount[0] - numberCount[1]);
			}
			else if (findString.equals("mult"))
			{
				System.out.println(numberCount[0] * numberCount[1]);
			}
			else if (findString.equals("divide"))
			{
				System.out.println(numberCount[0] / numberCount[1]);
			}
		}
		catch(Exception ex) {
			System.out.println("Invalid Input, try again -");
		}


	}

	private static String findStringValue(String string) {

		if(string.equals("add")|| string.equals("addition")||string.equals("sum") ||string.equals("+")|| string.equals("plus"))
		{
			return "add";
		}

		else if(string.equals("sub")|| string.equals("subtract")|| string.equals("minus")|| string.equals("difference")|| string.equals("-"))
		{
			return "sub";
		}
		else if(string.equals("multiply")|| string.equals("product")|| string.equals("times")|| string.equals("*"))
		{
			return "mult";
		}
		else if(string.equals("divide")|| string.equals("by")|| string.equals("/")|| string.equals("quotient"))
		{
			return "div";
		}

		return null;
	}
}