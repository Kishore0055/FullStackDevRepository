package string;

class reversestring3 
{
	public static void main(String[] args) 
	{
		String str = "Hello World!";
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) 
		{
			reversed += str.substring(i, i + 1);
		}
		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + reversed);
	}
}