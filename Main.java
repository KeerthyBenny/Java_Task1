package calculator;

import java.util.*;

public class Main extends Operands
{	
	public static String rePrint;
	public static int uniqueID = 1;

	public static void main(String[]args)
	{
		HashMap<Integer , String> completeStringInArrayList = new HashMap<Integer , String>();
		takeInputAndCalculateTotal(completeStringInArrayList);
	}

	private static void takeInputAndCalculateTotal(HashMap<Integer , String> completeStringInArrayList) 
	{
		try
		{
			Scanner takeInput = new Scanner(System.in);
			System.out.println("Enter the calculation in a line");
			rePrint = takeInput.nextLine().toLowerCase();

			if (rePrint.equals("end"))
			{
				System.out.println("Thank you for Using AI calculator, Good Bye !");
			}

			else if (rePrint.equals("history"))
			{
				
				// INCASE USING ARRAY LIST USE FOLLOWING CODE TO PRINT -
				//Iterator itr1 = completeStringInArrayList.iterator();
				//while(itr1.hasNext())
				//{
				//	System.out.println(itr1.next());
				//}
				
				for(Map.Entry m:completeStringInArrayList.entrySet())
				{
					System.out.println(m.getKey()+": "+m.getValue());  
				}
				
				takeInputAndCalculateTotal(completeStringInArrayList);
			}
			else
			{
				Operands op1 = new Operands();
				String outPutMain = "" + op1.calculateTotalBasedOnString(rePrint);
				
				String completeString = "Question: " + rePrint + " | " + "Answer: " + outPutMain;
				completeStringInArrayList.put(uniqueID, completeString);		
				uniqueID++;
				System.out.println(completeString);
				takeInputAndCalculateTotal(completeStringInArrayList);
			}

		}
		catch (Exception exMain)
		{
			{
				System.out.println("Please give proper input to perfom the action");
				System.out.println("Error- " + exMain);
				takeInputAndCalculateTotal(completeStringInArrayList);
			}

		}
	}

}
