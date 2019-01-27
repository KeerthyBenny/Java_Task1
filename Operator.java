package calculator;

public class Operator {
		
	public String findOperator(String str1) {
		
		if (str1.equals("add") || str1.equals("sum") || str1.equals("addition") || str1.equals("+"))
		{	
			return "add";
		}
		else if (str1.equals("sub") || str1.equals("minus") || str1.equals("subtract") || str1.equals("-") || str1.equals("subtraction") )
		{
			return "sub";
		}
		else if (str1.equals("multiply") || str1.equals("times") || str1.equals("multiplication") || str1.equals("*"))
		{
			return "multiply";
		}
		else if (str1.equals("divide") || str1.equals("by") || str1.equals("/"))
		{
			return "divide";
		}
		
		return null;
	}
		
}
