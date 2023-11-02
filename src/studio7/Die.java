package studio7;

public class Die {
	private int numSides;
	public Die(int num) {
		numSides = num;
	}
	public int returnValue() {
		return (int)(Math.random()*numSides+1);
	}
	public static void main(String[] agrs) {
		Die p1 = new Die(5);
		System.out.print(p1.returnValue());
	}
}
