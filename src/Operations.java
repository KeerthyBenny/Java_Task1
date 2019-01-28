public class Operations 
{
	int performingOperation(int[] number_array, String[] word_array)
	{
		for (int i = 0; i < word_array.length; i++) 
		{
			if(word_array[i].equalsIgnoreCase("add") 
					|| word_array[i].equalsIgnoreCase("sum")
					|| word_array[i].equalsIgnoreCase("plus") 
					|| word_array[i].equalsIgnoreCase("+"))
			{
				return number_array[0] + number_array[1];
			}
			else if(word_array[i].equalsIgnoreCase("subtraction") 
					|| word_array[i].equalsIgnoreCase("minus")
					|| word_array[i].equalsIgnoreCase("-") 
					|| word_array[i].equalsIgnoreCase("difference"))
			{
				return number_array[0] - number_array[1];
			}
			else if(word_array[i].equalsIgnoreCase("divide") 
					|| word_array[i].equalsIgnoreCase("/"))
			{
				return number_array[0] / number_array[1];
			}
			else if(word_array[i].equalsIgnoreCase("multiply") 
					|| word_array[i].equalsIgnoreCase("*")
					|| word_array[i].equalsIgnoreCase("times"))
			{
				return number_array[0] * number_array[1];
			}
		}
		return 0;
	}
}