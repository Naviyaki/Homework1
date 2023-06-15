//Ivan Wu

import java.util.Scanner;

public class CircleCompute {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius: ");
		int R = sc.nextInt();
		
		double P = 3.141592;
		
		double A = P * (R * R);
		
		double C = (2 * P * R);
		
		System.out.printf("%s%d%s%f%s%f%s \n", "When the radius is ", R, ", the area is ", A, " and the circumference is ", C, "."); 

		sc.close();
		
	}
	
}
