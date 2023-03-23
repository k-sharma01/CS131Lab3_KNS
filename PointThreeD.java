/**
 * This class represents a three-dimensional point
 * @author Kirin Sharma
 *
 * CS 131 Lab 3
 */

public class PointThreeD 
{

	private double xPoint; // holds the x-coordinate
	private double yPoint; // holds the y-coordinate
	private double zPoint; // holds the z-coordinate
	
	/**
	 * Default constructor initializes the point to (0, 0, 0)
	 */
	public PointThreeD()
	{
		xPoint = yPoint = zPoint = 0;
	} // end default constructor
	
	/*
	 * Preferred constructor allows caller to pass in values for the coordinates
	 */
	public PointThreeD(double x, double y, double z)
	{
		xPoint = x;
		yPoint = y;
		zPoint = z;
	} // end preferred constructor

	@Override
	/**
	 * Override of the toString method
	 */
	public String toString() 
	{
		return "PointThreeD [xPoint= " + xPoint + ", yPoint= " + yPoint + ", zPoint= " + zPoint + "]";
	} // end toString

	/**
	 * Getter for xPoint
	 * @return the xPoint
	 */
	public double getxPoint() 
	{
		return xPoint;
	} // end getxPoint

	/**
	 * Setter for xPoint
	 * @param xPoint the xPoint to set
	 */
	public void setxPoint(double xPoint) 
	{
		this.xPoint = xPoint;
	} // end setxPoint

	/**
	 * Getter for yPoint
	 * @return the yPoint
	 */
	public double getyPoint() 
	{
		return yPoint;
	} // end getyPoint

	/**
	 * Setter for yPoint
	 * @param yPoint the yPoint to set
	 */
	public void setyPoint(double yPoint) 
	{
		this.yPoint = yPoint;
	} // end setyPoint

	/**
	 * Getter for zPoint
	 * @return the zPoint
	 */
	public double getzPoint() 
	{
		return zPoint;
	} // end getzPoint

	/**
	 * Setter for zPoint
	 * @param zPoint the zPoint to set
	 */
	public void setzPoint(double zPoint) 
	{
		this.zPoint = zPoint;
	} // end setzPoint
	
} // end class
