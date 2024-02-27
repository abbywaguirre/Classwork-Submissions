
public class ArraysTutorial {

	public static void main(String[] args) 
	{
		//declare an int array without any values
		int[] arr = null;
		
		//declare an array of 4 default values
		int[] arr2 = new int[4];
		
		//declare array w/ 3 values we want to set to literals of 4, 12, 28
		int[] arr3 = {4, 12, 28};
		
		//print contents
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr3);
		
		//print out first element of arr3
		System.out.println("first element of arr3 is " + arr3[0]);

		//print out last element
		System.out.println("last element is " + arr3[arr3.length -1]);
		
		//call method to print first and last element and change them to 1
		printAndChangeFirstLast(arr3);
		
		//print first and last elements
		//arrays can never be local
		System.out.println("**the first and last elements are " + 
		arr3[0] + " and " + arr3[arr3.length -1]);
		
		//call method to return sum of 2 indices
		int sum = sumOfTwoElements(arr3, 0, 1);
		System.out.println("the sum is " + sum);
		
		//call method to return a new array with same lengths but all zeros as literals
		int [] newArr = makeSenseLengthArrWtihZeros(arr3);

		//declare array
		int[] taskArr = {8, 12, 28};
		
		//TASK 1: make a method that returns an ARRAY of the first and last 
		//elements of a passed array
		//example: {4, 7, 12, 3} --returns--> {4, 3}
		System.out.println(returnFirstLast(taskArr));
		
		//TASK 2: make a method that changes an array
		//it should be passed the array and the index you want to change
		//it will divide specified index by 2
		//example: ( {2, 4, 6, 8}, 2 ) ---> {2, 4, 6, 8}
		System.out.println(divideIndexBy2(taskArr, 0));
		System.out.println(taskArr[0]);
		
	}

	

	private static int[] divideIndexBy2(int[] taskArr, int i) 
	{
		taskArr[i] = taskArr[i]/2;
		return taskArr;
	}



	private static int[] returnFirstLast(int[] taskArr) 
	{
		int[] newArr = {taskArr[0], taskArr[taskArr.length - 1]};
		return newArr;	
	}

	private static int[] makeSenseLengthArrWtihZeros(int[] arr) 
	{
		int[] tempArr = new int[arr.length];
		return tempArr;
	}

	private static int sumOfTwoElements(int[] arr, int first, int second) 
	{
		//return sum of 1st and 2nd
		return arr[first] + arr[second];
	}

	private static void printAndChangeFirstLast(int[] arr) 
	{
		//print first and last elements
		System.out.println("the first and last elements are " + 
		arr[0] + " and " + arr[arr.length -1]);
		
		//change these elements to 1
		arr[0] = 1;
		arr[arr.length -1] = 1;
		
		//print first and last elements to make sure the values are changed
		System.out.println("the first and last elements are " + 
		arr[0] + " and " + arr[arr.length -1]);
		
	}


}
