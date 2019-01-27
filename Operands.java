package calculator;

public class Operands extends Operator{

	protected static int valuesInInt[] = new int[2];
	protected static String operator;

	public int calculateTotalBasedOnString(String rePrint)
	{
			String spitInput[] = rePrint.toLowerCase().split(" ");
			int count = 0;
			Operator op2 = new Operator();

			count = findOperatorAndValues(spitInput, count, op2);

			return finalOutput();
	}

	private int findOperatorAndValues(String[] spitInput, int count, Operator op2) 
	{
		for (int i = 0; i < spitInput.length; i++)
		{
			try
			{
				valuesInInt[count] = Integer.parseInt(spitInput[i]);
				count++;
			}
			catch (Exception e)
			{
				String str1 = spitInput[i];

				if (op2.findOperator(str1) != null)
				{
					operator = op2.findOperator(str1);
				}
			}
		}
		return count;
	}

	private int finalOutput() 
	{
		if (operator.equals("add"))
		{
			return(valuesInInt[0] + valuesInInt[1]);
		}
		else if (operator.equals("sub"))
		{
			return(valuesInInt[0] - valuesInInt[1]);
		}
		else if (operator.equals("multiply"))
		{
			return(valuesInInt[0] * valuesInInt[1]);
		}
		else if (operator.equals("divide"))
		{
			return(valuesInInt[0] / valuesInInt[1]);
		}
		
		return 0;
	}
}