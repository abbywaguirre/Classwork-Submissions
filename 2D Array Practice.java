
public class TwoDArrayPractice 
{

	public static void main(String[] args) 
	{
		//Task 1: Create a method print2DArray() that is passed a 2D String 
		//array and will print out each element in row-major order 
		//(instead of column-major order like we did yesterday). 
		String[][] strings = {{"1", "2"},
							{"3", "4"},
							{"5", "6"}};
		
		print2DArray(strings);
		
		//Task 2: Create a method allOnes2D() that is passed a 2D double array, 
		//makes an array of the same column and row length but all its literals
		//are 0.0 called copyArr, and then changes each element inside to 1.0 
		//and returns copyArr. (So it is passed a 2D array and returns a 
		//2D array with all 1.0).
		double[][] doubles = {{1.0, 2.0},
							{3.0, 4.0},
							{5.0, 6.0}};
		allOnes2D(doubles);
		
	}

	private static double [][] allOnes2D(double[][] doubles) 
	{
		int rows = doubles.length;
		int columns = doubles[0].length;
		
		double [][] copyArr = new double [rows][columns];
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				copyArr[i][j] = 1.0;
			}
		}
		
		return copyArr;
		
	}



	private static void print2DArray(String[][] strings) 
	{
		int rows = strings.length;
		int columns = strings[0].length;

		//row major order
				for (int c = 0; c < rows; c++)
				{
					for (int i = 0; i < columns; i++)
					{
						System.out.println(strings[c][i]);
					}
				}
		
	}

}
