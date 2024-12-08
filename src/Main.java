
public class Main {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);

		System.out.println("Square root of " + x + " = " + A);
		System.out.println("Square root of " + y + " = " + B);
		System.out.println("Square root of  25 = " + C);

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " raised to power of " + y + " = " + A);
		System.out.println(x + " squared equals = " + B);
		System.out.println("5 squared equals = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Absolute value of " + y + " = " + A);
		System.out.println("Absolute value of " + z + " = " + B);
		
		
		double a = 3.0;
		double b = 1.0;
		double c = -4.0;
		double delta;
		double x1, x2;
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		System.out.println("Delta = " + delta);
		System.out.println("X1 = " + x1);
		System.out.println("X2 = " + x2);
		
	}

}
