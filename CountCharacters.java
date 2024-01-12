
public class DiceRoller 
{

	public static void main(String[] args) 
	{
		//for loop that prints random number 1-17 and repeats 200 times
		for (int i = 0; i < 201; i++) 
		{
			System.out.println((int)(Math.random() * 17 + 1));
			i++;
		}
		
		char myChar = 'K';
		String newString = "hjsbchjKjhackjKKKKKy";
		/**
		 * method to count how many times 
		 * the char shows up in the String and return that number
		 */
		System.out.println(countChars(newString, myChar));

	}

	private static int countChars(String str, char myChar) 
	{
		int count = 0;
	    //for loop to check amount of character occur.
	    for(int i=0; i < str.length(); i++)
	    {    if(str.charAt(i) == myChar)
	            count++;
	    }
	   
	    return count;		
	}

}
