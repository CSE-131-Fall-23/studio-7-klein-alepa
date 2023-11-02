package studio7;

public class Fraction {
	private double fraction1;
	private double fraction2;
	public Fraction(double num1, double num2) {
		fraction1 = num1;
		fraction2 = num2;
	}
	public double addFraction() {
		return fraction1+fraction2;
	}
	public double multiplyFraction() {
		return fraction1*fraction2;
	}
	public double reciprocal() {
		return fraction1*1/fraction1;
	}
	public static void main(String[] args) {
		Fraction p1 = new Fraction(1.0/2, 1.0/4);
		System.out.println(p1.addFraction());
		System.out.println(p1.multiplyFraction());
		System.out.println(p1.reciprocal());
	}
	
}
