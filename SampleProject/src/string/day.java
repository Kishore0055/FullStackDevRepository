package string;

public class day 
{
	public static void main(String[] args) 
	{
		String str = "sundaymondaytuesdaywednesdaythursdayfridaysaturday";
		String newStr = str.replace("day", "day,");
		System.out.println(newStr);
	}
}