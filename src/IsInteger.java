public class IsInteger 
{
	public static boolean checkInteger(String s) 
	{
		try 
		{ 
			Integer.parseInt(s); 
		}
		catch(NumberFormatException e) 
		{ 
			return false; 
		}
		return true;
	}
}