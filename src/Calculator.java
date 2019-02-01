import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Calculator extends Exception
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Satapata calculator\n");
		List<String> list_history = new ArrayList<String>();
		method(list_history);
	}
	
	static void method(List<String> list_history)
	{
		try
		{
			Scanner scan = new Scanner(System.in);
//			int number_array[] = new int[2];
			List<Integer> list_int = new ArrayList<Integer>();
			System.out.println("Enter input to calculate");
			String input = scan.nextLine();
			String[] input_array = input.split(" ");
			if(input_array[0].equalsIgnoreCase("history"))
			{
				Iterator<String> it = list_history.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
			}
			else if(input_array[0].equalsIgnoreCase("exit"))
			{
				System.exit(0);
			}
			else
			{
				List<String> list_string = new ArrayList<String>(Arrays.asList(input_array));
				Iterator<String> it = list_string.iterator();
				while(it.hasNext()) 
				{
					String str_list = it.next();
					if(ExtractInteger.isInteger(str_list))
					{
						int temp = Integer.parseInt(str_list);
						list_int.add(temp);
					}
				}
				int result_value = Operations.operations(list_int, list_string);
				if(result_value == 0)
				{ 
					throw new Calculator();
				}
				String result_string = "Total is " + result_value;
				System.out.println(result_string);
				
				String history_variable = input + "\n" + result_string;
				list_history.add(history_variable);
			}
			method(list_history);
		}
		catch(Exception e)
		{
			System.out.println("Invalid input. Try again.");
			method(list_history);
		}
	}
}
