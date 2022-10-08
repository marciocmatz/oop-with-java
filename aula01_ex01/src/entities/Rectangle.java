package entities;

public class Rectangle {

	public double width, height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (2 * width) + (2 * height);
	}
	
	public double diagonal() {
		return Math.sqrt((height * height) + (width * width));
	}
	
	public String toString() {
		return "AREA: " + String.format("%.2f%n", area()) + "PERIMETER: " + String.format("%.2f%n", perimeter()) + "DIAGONAL: " + String.format("%.2f%n", diagonal()); 
	}
	
}
