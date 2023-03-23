/**
 * This class represents a basic square
 * @author Kirin Sharma
 *
 * CS 131 Lab 3
 */

public class Square {

	private double side; // holds the side length of the square
	
	/**
	 * Default constructor initializes a square with side 1
	 */
	public Square()
	{
		side = 1;
	} // end default constructor
	
	/**
	 * Preferred constructor allows caller to pass in a value for side
	 * @param s
	 */
	public Square(double s)
	{
		side = s;
	} // end preferred constructor
	
	/**
	 * Calculates the area of a square
	 * @return
	 */
	public double getArea()
	{
		return (side * side);
	} // end getArea
	
	/**
	 * Getter for side
	 * @return
	 */
	public double getSide()
	{
		return side;
	} // end getSide
	
	/**
	 * Setter for side
	 * @param s
	 */
	public void setSide(double s)
	{
		side = s;
	} // end setSide

	@Override
	/**
	 * Overrides the toString method
	 */
	public String toString()
	{
		return "Square [side= " + side + "]";
	} // end toString
	
} // end class
