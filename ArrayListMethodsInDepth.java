import java.util.ArrayList;

public class ArrayListMethodsInDepth {

	public static void main(String[] args) 
	{
		//In the main method, instatiate an empty ArrayList foods that stores 
		//Strings. Then add the following Strings to foods: "Apples", "Bread",
		//"Cookies". After each task (except task 1) print out the length of the foods ArrayList.
		ArrayList<String> foods = new ArrayList<String>();
		System.out.println(foods.size());
		
		foods.add("Apples");
		System.out.println(foods.size());

		foods.add("Bread");
		System.out.println(foods.size());

		foods.add("Cookies");
		System.out.println(foods.size());

		//Task 1: Print out the length of the foods ArrayList. 
		//in this case, this prints 3
		//in general, this prints the current length of the array
		System.out.println(foods.size());

		//Task 2: Inside of a print statement, add the String "Dole Whip" to 
		//foods. In the line comment for this code, state what it prints.
		
		//this method will always print true no matter the array or what the method is passed
		//this prints "true"
		System.out.println(foods.add("Dole Whip"));

		//Task 3: Inside of a print statement, use the .set(E) method to 
		//change "Bread" in foods to "Butter". Comment what it prints. 
		
		//in general, this line prints the old value at element it is passed;
		//in this case - "Bread"
		System.out.println(foods.set(1, "Butter"));
		
		//Task 4: Inside of a print statement, use the .remove(int) method
		//to remove "Cookies" from foods. Comment what it prints.
		
		//this line removes Cookies from the array and prints "Cookies"
		//in general, this method prints the element that was removed before it was removed
		System.out.println(foods.remove(2));


	}

}
