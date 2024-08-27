package string;

class pattern 
{
	public static void main(String[] args) 
	{
		String str = "PROGRAM";
		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j) + " ");
			}
			System.out.println();
		}
	}
}
