//Ivan Wu

import java.util.Scanner;

public class RectangleCompute {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the width: ");
		int Width = sc.nextInt();
		
		System.out.print("Enter the length: ");
		int Length = sc.nextInt();
		
		int Area = Width * Length;
		
		int Perimeter = (2 * Width) + (2 * Length);
		
		System.out.println("When one side is " + Width + " and the other side is " + Length + ", the area is " + Area + " and the perimeter is " + Perimeter + ".");
		
		sc.close();
		
	}
	

}
