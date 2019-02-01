package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Calculations {



	public static void main(String[] args) 

	{

		System.out.println("Welcome to Satapata Calculator");
		List<String> hist = new ArrayList<String>();
		loop(hist);

	}
	static boolean isInteger(String n)
	{
		try
		{

			Integer.parseInt(n);
		}

		catch(Exception ex)
		{
			return false;
		}
		return true;
	}

	private static void loop(List<String> hist)

	{

		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		String str = s.nextLine();
		//		String array[]= str.split(" ");
		List<String> str1 = new ArrayList<String>( Arrays.asList(str.split(" ")));
		List<Integer> num= new ArrayList<Integer>();
		if(str1.contains("exit"))
		{
			System.out.println("Thank you for using Satapata Calculator");
			System.exit(0);
		}
		else if(str1.contains("history"))
		{
			getHist(hist);
		}
		else 
		{
			Iterator<String> it= str1.iterator();
			{
				while (it.hasNext())
				{
					String str11 = it.next();
					boolean temp= isInteger(str11);
					if(temp)
					{
						int temp1 = Integer.parseInt(str11);
						num.add(temp1);
					}
				}
			}


			int a=performCalculation(str1, num);
			System.out.println("the ans is " +a);
			String output = "the ans is "+a;
			hist.add(str + " \n" + output);



		}

		loop(hist);
	}

	private static void getHist(List<String> hist)
	{
		Iterator<String> c = hist.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}
	}
	private static int performCalculation(List<String> str1, List<Integer> num )
	{
		if(str1.contains("add")||str1.contains("plus")||str1.contains("addition")||str1.contains("+") )
		{
			return num.get(0)+num.get(1);
		}
		else if(str1.contains("subtract")||str1.contains("-")||str1.contains("difference")||str1.contains("sub"))
		{
			return num.get(0)- num.get(1);
		}
		else if(str1.contains("multiply")||str1.contains("*")||str1.contains("product"))
		{
			return num.get(0)*num.get(1);
		}
		else if(str1.contains("divide")||str1.contains("quotient of")||str1.contains("division of")||str1.contains("/"))
		{
			return num.get(0)+num.get(1);
		}
		return 0;
	}
}



