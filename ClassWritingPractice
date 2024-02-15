/**
 * a class that allows us to store the grades of a student
 * scienceGrade, mathGrade, theologyGrade
 * 
 * also store grade level and name
 * 
 * includes getGPA method to return average of all grades 
 * includes method to introduce the student by name
 */
public class Student 
{
	//list the properties/data attributes
	private double scienceGrade;
	private double mathGrade;
	private double theologyGrade;
	private int gradeLevel;
	private String name;
	
	/**
	 * this constructor allows us to make students
	 * we pass it numbers to be the initial values for the data attributes
	 * @param a science grade
	 * @param b math grade
	 * @param c theology grade
	 * @param d grade level
	 * @param n name of student
	 */
	public Student (double a, double b, double c, int d, String n)
	{
		scienceGrade = a;
		mathGrade = b;
		theologyGrade = c;
		gradeLevel = d;
		name = n;
	}
	
	//functionalities 
	/**
	 * uses all the student's grades to calculate the average
	 * @return A for average
	 */
	public double getGPA()
	{
		//equation to get average
		double A = (scienceGrade + mathGrade + theologyGrade) / 3;
		return A;
	}
	
	/**
	 * this method prints an introduction of student
	 * includes grade level, name, and GPA
	 */
	public void introduceSelf()
	{ 
		System.out.println("I am a student in grade " + gradeLevel + 
				" My name is " + name + " My GPA is " + getGPA());
	}

}
