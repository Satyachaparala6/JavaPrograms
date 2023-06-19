package tasksix;

public class Rectangle {
 
	int length;
	int breadth;
	
	public Rectangle() {
		this.length = 0;
		this.breadth = 0;
	}
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle(int val) {
		this.length = val;
		this.breadth = val;
	}
	public void area() {
		System.out.println("Area of rectangle:" + length*breadth);
	}
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(2,3);
		Rectangle rect3 = new Rectangle(5);
		rect1.area();
		rect2.area();
		rect3.area();
	}
}
