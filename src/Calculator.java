import java.util.Arrays;
import java.util.Scanner;

public class Calculator
{
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		method();
	}	
	
	//this method removes the nulls from word_array[] array
	static String[] removeNullsFromArray(String[] word_array)
	{
		String[] refinedArray = new String[word_array.length]; 
		int count = -1;
		for(String s : word_array) 
		{
			if(s != null) 
			{ 
				refinedArray[++count] = s; 
			}
		}
		return word_array = Arrays.copyOf(refinedArray, count + 1);
	}	
	
	static void method()
	{
		try
		{			
			int number_count = 0, word_count = 0;
			System.out.println("enter input");
//			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			String input_split_array[] = input.split(" ");
			int number_array[] = new int[2];
			String word_array[] = new String[10];
			
			if(input_split_array[0].equalsIgnoreCase("exit"))
			{
				System.exit(0);
			}
			
			//spliting the input array into  number_array[] and word_array[]
			for (int i = 0; i < input_split_array.length; i++) 
			{
				String compare_str = input_split_array[i];
				if(IsInteger.checkInteger(compare_str) == true)
				{
					number_array[number_count] = Integer.parseInt(compare_str);
					number_count++;
				}
				else
				{
					word_array[word_count] = compare_str;
					word_count++;
				}
			}
			
			word_array = removeNullsFromArray(word_array);
			
			Operations op = new Operations();
			int value = op.performingOperation(number_array, word_array);
			if(value == 0)
			{
				System.out.println("Invalid input. Try again!");
			}
			else
			{				
				System.out.println("The total is " + value);
			}
			method();
		}
		catch(Exception e)
		{
			System.out.println("invalid input. Try again");
			method();
		}
	}
}