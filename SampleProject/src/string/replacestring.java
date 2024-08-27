package string;

class replacestring 
{
	public static void main(String[] args) 
	{
		String str = "Hello World!";
		String oldStr = "World";
		String newStr = "Universe";
		String result = " ";
		int index = 0;
		while (index < str.length()) 
		{
			if (str.startsWith(oldStr, index)) 
			{
				result += newStr;
				index += oldStr.length();
			} 
			else 
			{
				result += str.charAt(index);
				index++;
			}
		}
		System.out.println("Original string: " + str);
		System.out.println("Result string: " + result);
	}
}
