import java.util.ArrayList;

public class ArrayListSorters 
{

	public static void main(String[] args) 
	{
		//Task 1: In the main method, instantiate two ArrayLists nums and names
		//of Integers (remember ints wouldn't work for ArrayLists) and Strings
		//respectively. Fill them with five unsorted values (nums out of 
		//numerical order and names out of alphabetical order). 
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(4);
		nums.add(1);
		nums.add(7);
		nums.add(0);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Abby");
		names.add("Kennedy");
		names.add("Nua");
		names.add("Paige");
		
		//Task 2: Create a void method bubbleSortNumbers that is passed an 
		//ArrayList and bubble sorts it just like we did for arrays. 
		System.out.println("orignal " + nums);
		bubbleSortNumbers(nums);
		System.out.println("sorted " + nums);

		//Task 3: Create a void method bubbleSortStrings that is passed an 
		//ArrayList and bubble sorts it into alphabetical order. 
		System.out.println("original " + names);
		bubbleSortStrings(names);
		System.out.println("sorted " + names);

	}
	
	private static void bubbleSortStrings(ArrayList<String> names) 
	{
		 for (int x = 0; x < names.size(); x++) 
	        {
	            for (int i = 0; i < names.size() - x - 1; i++) 
	            {
	                if (names.get(i).compareTo(names.get(i+1)) > 0)
	                {
	                    String temp = names.get(i);
	                    names.set(i, names.get(i + 1));
	                    names.set(i + 1, temp);
	                }
	            }
	        }		
	}

	private static void bubbleSortNumbers(ArrayList<Integer> nums) 
	{
		        for (int x = 0; x < nums.size(); x++) 
		        {
		            for (int i = 0; i < nums.size() - x - 1; i++) 
		            {
		                if (nums.get(i) > nums.get(i + 1))
		                {
		                    Integer temp = nums.get(i);
		                    nums.set(i, nums.get(i + 1));
		                    nums.set(i + 1, temp);
		                }
		            }
		        }
	}

}
