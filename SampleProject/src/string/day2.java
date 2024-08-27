package string;

public class day2 
{
	public static void main(String[] args) 
	{
		String str = "sundaymondaytuesdaywednesdaythursdayfridaysaturday";
		String newStr = str.replace("day", "");
		System.out.println(newStr);
	}
}
