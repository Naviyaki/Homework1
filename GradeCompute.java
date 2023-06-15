//Ivan Wu

import java.util.Scanner;

public class GradeCompute {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Homework grade: ");
		int Homework = sc.nextInt();
		
		System.out.print("Enter CodeLab grade: ");
		int CodeLab = sc.nextInt();
		
		System.out.print("Enter Midterm 1 grade: ");
		int Midterm1 = sc.nextInt();
		
		System.out.print("Enter Midterm 2 grade: ");
		int Midterm2 = sc.nextInt();
		
		int Total = Homework + CodeLab + Midterm1 + Midterm2;
		
		System.out.println("The total score is " + Total + " of possible 60 points. ");
		
		sc.close();
		
	}
	
}
