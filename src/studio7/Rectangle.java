package studio7;

public class Rectangle {
	private int RectangleLength;
	private int RectangleWidth;
	
	public Rectangle(int length, int width) {
		RectangleLength = length;
		RectangleWidth = width;
	}
	public int RectangleArea() {
		return RectangleLength*RectangleWidth;
		
	}
	public static void main(String[] args) {
		Rectangle p1 = new Rectangle(5, 5);
		System.out.print(p1.RectangleArea());
	}
}
