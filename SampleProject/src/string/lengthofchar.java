package string;

class lengthofchar 
{
	public static void main(String[] args) 
	{
		String str = "Hello World!";
		int count = countCharacters(str);
		System.out.println("Number of characters in the string: " + count);
	}

	public static int countCharacters(String str) 
	{
		int count = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			count++;
		}
		return count;
	}
}