// author : Vaibhav Jindal

package Assign2;

public abstract class Shape {
	
	public abstract float area(float side);
	public float perimeter(float side){
		System.out.println("this form abstract shape and have no perimeter.");
		return 0;
	}
}
