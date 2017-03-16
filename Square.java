// author : Vaibhav Jindal

package Assign2;

public class Square extends Shape implements Moveable, Rollable{
	
	public float area(float side){
		return side*side;
	}
	
	// from interface rollable for multiple inheritance
	public void roll() {
		System.out.println("inheried from interface Rollable");		
	}
	
	// from interface moveable for multiple inheritance
	public void move() {
		System.out.println("inheried from interface Moveable");
		
	}
	// from interface rollable for multiple inheritance
	public void roll2() {
		System.out.println("another method and value inheried from interface Rollable :  " + avg_speed);		
	}
	
	
	// method overridden
	public float perimeter(float side){
		super.perimeter(side);
		return 4*side;
	}

	public static void main(String[] args) {
		int side = 6;
		Square a = new Square();
		Shape b = new Square();
		
		System.out.println("area of the square with side " + side + " is : " + a.area(side)); // instance of class square
		System.out.println("area of the square with side " + side + " is : " + b.area(side)); // instance of class system but with a method
		
		System.out.println("perimeter of the square with side " + side + " is : " + a.perimeter(side)); // instance of class square
		System.out.println("perimeter of the square with side " + side + " is : " + b.perimeter(side) + "and this is overridden method"); // instance of class system but with a method
		
		a.roll();
		a.roll2();
		a.move();
		
	}	
}