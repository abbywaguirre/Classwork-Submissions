
public class BubbleSorter 
{

	public static void main(String[] args) 
	{
		
		makeRandom();
		
		bubbleSort(makeRandom());
		
		printArr(bubbleSort(makeRandom()));
		
	}

	/**
	 * returns a totally new one that is a sorted version of the original array
	 * @param makeRandom
	 * @return 
	 */
	private static int[] bubbleSort(int[] arr) 
	{
		//declare int assigned the value of the length of array
				int n = arr.length; 
				
				//for loop to traverse the array all the way to the last
				//element
		        for (int i = 0; i < n - 1; i++) 
		        {   
		        	//for loop that again traverses the array with the purpose of
		        	//comparing each element at index j to the index at j+1
		        	for (int j = 0; j < n - i - 1; j++) 
		        	{
		               //swaps the two elements should the one at index j be greater
		        	   //than the one at the index of j+1, in turn pushing all the greater
		        	   //elements towards the end and lesser ones to the front
		        		if (arr[j] > arr[j + 1]) 
		                { 
		                    // swap temp and arr[i] 
		                    int temp = arr[j]; 
		                    arr[j] = arr[j + 1]; 
		                    arr[j + 1] = temp;
		                }
		        	}
		        }
		        
		        //return final value
		        return arr;
	}

	/**
	 * this method takes in an array and gives each element a random value
	 * @return new array
	 */
	private static int[] makeRandom() 
	{
		//declare array of 2000 ints
		int[] bigNums = new int[2000];
		
		//set int length equal to length of the array
		int len = bigNums.length;
		
		//for loop to traverse the array
		for (int i = 0; i < len; i++)
		{
			//declare a random number 1-1000
			int randomNumber = (int) ((Math.random() * 1000) + 1);
			//set each element of the array to a random number
			bigNums[i] = randomNumber;
			
		}
		
		//return the new array
		return bigNums;
	}
	
	/**
	 * this method is passed a double array and prints out each element one by one
	 * @param arr
	 */
	public static void printArr(int[] arr) 
	{
		//declare a variable to be the thing that traverses an array
		//task 1 - make a variable to be the traverser
		int counter;
		
		//task 2 - make a loop; we want it to traverse every character, so it
		//should go from start to finish of the loop
		System.out.print("{");
		for (counter = 0; counter <= arr.length-1; counter++) 
		{
			System.out.print(arr[counter]);
			//print a comma isn't on last element
			if (counter != arr.length-1) 
			{
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}

}
