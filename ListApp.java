/**
 * This class tests the ArrayList generic class using Strings, Squares and PointThreeD's to fill it
 * @author Kirin Sharma
 *
 * CS 131 Lab 3
 */

public class ListApp {

	public static void main(String[] args) 
	{
		// Testing ArrayList using Strings
		ArrayList<String> stringList = new ArrayList<String>(3);
		stringList.addItem("First Item");
		stringList.addItem("Second Item");
		stringList.addItem("Third Item");
		
		System.out.println(stringList.toString());
		
		
		// Testing ArrayList using Squares
		ArrayList<Square> squareList = new ArrayList<Square>(5);
				for(int i = 1; i <= 5; i++)
		{
			squareList.addItem(new Square(i));
		}
				
		System.out.println(squareList.toString());
		
		
		// Testing ArrayList using PointThreeD
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>(3);
		
		pointList.addItem(new PointThreeD(1, 4, 7));
		pointList.addItem(new PointThreeD(5, 10, 25));
		pointList.addItem(new PointThreeD(11.5, 13.8, 15.9));
		
		System.out.println(pointList.toString());
		
	} // end main()

} // end class
