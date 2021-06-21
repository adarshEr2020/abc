
package Encapsulation;

class Circle {

	// private instance variable, not accessible from outside this class 
	private double radius;
	private String color;


	public Circle () { //1st default constructor 
		radius = 1.0;
		//color = red;
	}

	// Constructs a Circle instance with the given radius and default color 
	public Circle(double r) { //2nd constructor
		radius = r;
		//color = red;
	}

	public Circle(double r , String c) {
		radius = r;
		color = c;
	}

	public double getRadius() {
		return radius;
	}
	// Returns the area of this Circle instance 
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// getter for instance variable color
	public String getColor() {
		return color;
	}

}
class TestCircle { 
	public static void main(String[] args) {
		// Declare an instance of Circle class class called c1
		// construct the instance c1 by invoking thye "default"constructor 
		// which sets its radius and color to their default value 

		Circle c1 = new Circle();
		// invoke public methods on instance c1, via dot operator ;

		System.out.println("The circle has radius of " +c1.getRadius() +" and area of " + c1.getArea() );

		Circle c2 = new Circle(2.0); 

		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea() );

		Circle c3 = new Circle(10.0, "green");
		System.out.println("The circle has radius of " +c3.getRadius() +" and area of " + c3.getArea() +"and circle color" +c3.getColor() );


	}
}

