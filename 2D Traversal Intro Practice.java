
public class TwoDArrTrav 
{

	public static void main(String[] args) 
	{
		String[][] name = new String[3][2];
		String[][] name1 = {{"Abby", "Abbyy"},
							{"Abbyyy", "Abbyyyy"},
							{"Abi", "Abe"}};
		String[][] name2 = {{"A", "B", "A", "B", "A", "B"},
							{"A", "B", "A", "B", "A", "B"},
							{"A", "B", "A", "B", "A", "B"},
							{"A", "B", "A", "B", "A", "B"},
							{"A", "B", "A", "B", "A", "B"},
							{"A", "B", "A", "B", "A", "B"},
							{"A", "B", "A", "B", "A", "B"}};
		
		System.out.println(name2[0][0]);
		System.out.println(name2[1][0]);
		System.out.println(name2[2][0]);
		System.out.println(name2[3][0]);
		System.out.println(name2[4][0]);
		System.out.println(name2[5][0]);
		System.out.println(name2[6][0]);
		
		int rows = name2.length;
		for (int i = 0; i < rows; i++)
		{
			System.out.print(name2[i][0]);
		}
		
		System.out.println(name2[0][0]);
		System.out.println(name2[0][1]);
		System.out.println(name2[0][2]);
		System.out.println(name2[0][3]);
		System.out.println(name2[0][4]);
		System.out.println(name2[0][5]);

		int columns = name2[0].length;
		for (int i = 0; i < columns; i++)
		{
			System.out.print(name2[0][i]);
		}
		
		for (int c = 0; c < columns; c++)
		{
			for (int i = 0; i < rows; i++)
			{
				System.out.print(name2[i][c]);
			}
		}
		
	}

}
