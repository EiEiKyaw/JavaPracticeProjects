package InterfaceDemonstrate;

import java.util.Scanner;

interface Shape{
	public double CalculateArea();
}

abstract class GeometricShape implements Shape{
	protected double area;
	
	public double getArea() {
		return area;
	}
}

class Rectangle extends GeometricShape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public  double CalculateArea() {
		area = length * width;
		return area;
	}
}

class Circle extends GeometricShape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;			
	}
	
	@Override
	public double CalculateArea() {
		area = Math.PI*Math.pow(radius, 2);
		return area;
	}
}

public class HierarchyClassDemo {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 5);
		System.out.println("Rectangle area: " + rectangle.CalculateArea());

		Circle circle = new Circle(5);
		System.out.println("Circle area: " + circle.CalculateArea());
		
		
		// User Input Method
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Length: ");
//		double length = sc.nextDouble();
//		System.out.print("Enter Width: ");
//		double width = sc.nextDouble();
//		
//		Rectangle rectangle = new Rectangle(length, width);
//		System.out.println("Rectangle area: " + rectangle.CalculateArea());
//		
//		System.out.print("Enter radius: ");
//		double radius = sc.nextDouble();
//		
//		Circle circle = new Circle(radius);
//		System.out.println("Circle area: " + circle.CalculateArea());
		
	}
}
