package calculator;

import java.util.*;

public class Operator {
		
	public String findOperator(String str1) {

		LinkedList <String> operatorListAdd = new LinkedList();
		HashSet <String> operatorListSub = new HashSet();
		LinkedHashSet <String> operatorListMult = new LinkedHashSet();
		ArrayList <String> operatorListDiv = new ArrayList();

		operatorListAdd.add("add");
		operatorListAdd.add("sum");
		operatorListAdd.add("addition");
		operatorListAdd.add("+");
		
		operatorListSub.add("sub");
		operatorListSub.add("minus");
		operatorListSub.add("subtract");
		operatorListSub.add("-");
		
		operatorListMult.add("multiply");
		operatorListMult.add("times");
		operatorListMult.add("multiplication");
		operatorListMult.add("*");
		
		operatorListDiv.add("divide");
		operatorListDiv.add("divide by");
		operatorListDiv.add("division");
		operatorListDiv.add("/");
		
		
		boolean ifContains1 = operatorListAdd.contains(str1);
		if (ifContains1 == true)
		{	
			return "add";
		}
		
		boolean ifContains2 = operatorListSub.contains(str1);		
		if ((ifContains2 == true) )
		{
			return "sub";
		}
		
		boolean ifContains3 = operatorListMult.contains(str1);		
		if ((ifContains3 == true) )
		{
			return "multiply";
		}
		
		boolean ifContains4 = operatorListDiv.contains(str1);		
		if ((ifContains4 == true) )
		{
			return "divide";
		}
		
		return null;
	}
		
}
