
public class printPrevNextElement {

	public static void main(String[] args) 
	{
		double[] arr = { 3.26, 8.84, 9.63, -4.22, 12.80 } ;

		int index = 2;

		//Precondition: the method will never be passed an index that 
		//creates an ArrayIndexOutOfBoundsException error.
		printPrevnextElement( arr, index );

	}

	private static void printPrevnextElement(double[] arr, int index) 
	{
		System.out.println("the number before the element at index " 
	+ index + " is " + arr[index - 1] + " and the number after is " + arr[index + 1]);
	}

}
