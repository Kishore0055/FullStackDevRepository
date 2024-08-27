package string;

class palindromecheck 
{
	public static void main(String[] args) 
	{
		String str = "Gadag";
		boolean isPalindrome = isPalindrome(str);
		System.out.println("Is '" + str + "' a palindrome? " + isPalindrome);
	}
	public static boolean isPalindrome(String str) 
	{
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equalsIgnoreCase(reversed);
	}
}