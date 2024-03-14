
public class TraversalMethodsHomework 
{

	public static void main(String[] args) 
	{
		//task 1 - Make a method that is passed an int array 
		//and returns the highest value in that array
		//Ex: { 2, 6, 3, 9, 1, 1, 4} ---> returns 9
		int[] nums1 = {2, 6, 3, 9, 1, 1, 4};
		System.out.println(getHighestValue(nums1));
		
		//task 2 - Make a method that is passed an array of
		//doubles and returns a double array consisting of their average 
		//Ex: { 3.1, 4.2, 5.0, 6.2, 6.9} --> returns 5.08
		double[] nums2 = {3.1, 4.2, 5.0, 6.2, 6.9};
		System.out.println(getAverage(nums2));
		
		//task 3 - Make a method that is passed an int array 
		//and returns whether or not the array has any even numbers in it.
		//Ex: { 1, 6, 9} --> returns true
		//Ex: { 1, 5, 7} --> returns false
		int[] nums3 = {1, 5, 9};
		System.out.println(checkIfAnyEven(nums3));
		
		//task 4 - Make a method that is passed an int array and 
		//returns whether or not the array has ALL even numbers in it.
		//Ex: { 1, 6, 9} --> returns false
		//Ex: { 4, 2, 18} --> returns true
		int[] nums4 = {4, 2, 18};
		System.out.println(checkIfAllEven(nums4));
		
		//task 5 - Make a method that is passed a double array and returns whether or not three consecutive doubles of the same value appear in the array.
		//Ex: { 2.0, 8.8, 8.8, 8.8, 9.0, 3.1} --> returns true
		//Ex: {3.1, 7.1, 6.6, 9.3} --> returns false
		double[] nums5 = {2.0, 8.8, 8.8, 8.8, 9.0, 3.1};
		System.out.println(checkSameThree(nums5));

	}

	/**
	 * Make a method that is passed an int array and returns the highest value in that array
	 * @param nums
	 * @return
	 */
	private static int getHighestValue(int[] nums) 
	{
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i] > max)
			{
				max = nums[i];
			}
		}
		return max;
	}

	/**
	 * Make a method that is passed an array of doubles and returns a double array consisting of their average. 
	 * @param nums
	 * @return
	 */
	private static double getAverage(double[] nums) 
	{
		double sum = 0;
		int length = nums.length;
		for (int i = 0; i < nums.length; i++) 
		{
            sum += nums[i];
        }
        double average = sum / length;
        return average;
	}

	/**
	 * Make a method that is passed an int array and returns whether or not the array has any even numbers in it.
	 * @param nums
	 * @return
	 */
	private static boolean checkIfAnyEven(int[] nums) 
	{
		boolean isEven = false;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] % 2 == 0)
			{
				isEven = true;
			}
		}
		return isEven;
	}

	/**
	 * Make a method that is passed an int array and returns whether or not the array has ALL even numbers in it.
	 * @param nums
	 * @return
	 */
	private static boolean checkIfAllEven(int[] nums) 
	{
		boolean isEven = true;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] % 2 != 0)
			{
				isEven = false;
			}
		}
		return isEven;
	}

	/**
	 * Make a method that is passed a double array and returns whether or not three consecutive doubles of the same value appear in the array.
	 * @param nums
	 * @return
	 */
	private static boolean checkSameThree(double[] nums) 
	{
		int traverser = 0;
		boolean hasThree = false;
		for (; traverser <= nums.length - 3; traverser++) 
		{
			if (nums[traverser] == nums[traverser+1] && nums[traverser] == nums[traverser+2])
			{
				hasThree = true;
			}
		}
		return hasThree;
	}

}
