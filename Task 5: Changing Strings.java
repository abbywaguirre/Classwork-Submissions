import java.util.Scanner;

public class Task5ChangingStrings 
{

	public static void main(String[] args) 
	{
		Scanner stringTaker = new Scanner(System.in);
		
		//tell user what to do 
		System.out.println("input any string or phrase and I will remove the spaces");
		
		//scan in string
		String str = stringTaker.nextLine();
		
		//call method to return the string without the spaces
		//print result
		System.out.println(removeSpaces(str));
		
		//close the scanner
		stringTaker.close();

	}

	private static String removeSpaces(String str) 
	{
		
		char[] c = str.toCharArray();
		  String result = "";
		  int len = str.length() - 1;

		  for (int i = 0; i <= len; i++)
		  {
		    char letter = c[i];
		    if (!(letter == ' ' && ((i != 0) && (i != len))))
		    {
		      result += letter;
		    } 
		  }

		  return result; 
	}

}
