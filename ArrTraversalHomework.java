
public class ArrTraversalHomework {

	public static void main(String[] args) 
	{
		double[] taskOne = {3.1, 2.1, 8.4};

		//task 1 - Create a method sumArrElements that is passed an array
		//of doubles and returns the sum of all its elements. 
		System.out.println(sumArrElements(taskOne));
		
		int[] taskTwo = {3, 17, 12, 8, 9, 4, 12};
		
		//task 2 - Create a method makeEveryOtherOne that is passed an array 
		//of ints and changes that array. It should make every other element 
		//in the array '1' starting with the second element.  
		makeEveryOtherOne(taskTwo);

	}

	/**
	 * this method is passed an array of doubles and returns the sum of all elements
	 * @param taskOne 
	 * @return sum of all elements
	 */
	private static double sumArrElements(double[] taskOne) 
	{
		//variable declared outside of loop to be able to return final value
		double hold = 0;
		for (int counter = 0; counter <= taskOne.length-1; counter++) 
		{
			double adder = taskOne[counter];
			hold += adder;
		}
		return hold;
		
	}
	
	/**
	 * this method traverses an array of ints and changes every other integer to 1
	 * @param taskTwo
	 */
	private static void makeEveryOtherOne(int[] taskTwo) 
	{
		//change every other element to '1'
		//increments array by 2
		for (int counter = 1; counter <= taskTwo.length-1; counter+=2) 
		{
			taskTwo[counter] = 1;
		}
		
		//print to check
		System.out.print("{");
		for (int j = 0; j <= taskTwo.length-1; j++) 
		{
			System.out.print(taskTwo[j]);
			//print a comma isn't on last element
			if (j != taskTwo.length-1) 
			{
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}

}
