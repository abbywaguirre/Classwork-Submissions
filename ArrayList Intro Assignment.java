import java.util.ArrayList;

public class ArrayListIntro 
{

	public static void main(String[] args) 
	{
		//Task 1: Create an empty ArrayList studentNames of Strings.
		ArrayList<String> studentNames = new ArrayList<String>();
		
		//Task 2: Add the following String literals to studentNames: 
		//"Alice", "Charlie", "Dave", "Elizabeth", "Fieri", "Gwen". 
		//The ArrayList should hold them in this order. Print the ArrayList to make sure it is organized correctly.
		studentNames.add("Alice");
		studentNames.add("Charlie");
		studentNames.add("Dave");
		studentNames.add("Elizabeth");
		studentNames.add("Fieri");
		studentNames.add("Gwen");
		System.out.println(studentNames);

		//Task 3: Now add "Brittany" directly after "Alice."
		studentNames.add(1, "Brittany");
		System.out.println(studentNames);

		//Task 4: Charlie got expelled. Remove him from the ArrayList. 
		studentNames.remove(2);
		System.out.println(studentNames);

		//Task 5: I forgot who is at the 2 index. Please get the value of the String literal at index 2 and then print studentNames.
		System.out.println(studentNames.get(2));
		System.out.println(studentNames);
		
		//Task 6: Elizabeth had a name change. Set the value of the String literal where "Elizabeth" is to "Evan".
		studentNames.set(3, "Evan");
		System.out.println(studentNames);

	}

}
