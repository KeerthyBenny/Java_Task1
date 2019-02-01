import java.util.List;

public class Operations 
{
	static int operations(List<Integer> list_int, List<String> list_string)
	{
		if(list_string.contains("add") || list_string.contains("+"))
		{
			return list_int.get(0) + list_int.get(1);
		}
		else if(list_string.contains("minus") || list_string.contains("-"))
		{
			return list_int.get(0) - list_int.get(1);
		}
		else if(list_string.contains("multiply") || list_string.contains("*"))
		{
			return list_int.get(0) * list_int.get(1);
		}
		else if(list_string.contains("divide") || list_string.contains("/"))
		{
			return list_int.get(0) / list_int.get(1);
		}
		return 0;
	}
}
