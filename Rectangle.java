/*
 * author: Sang Nguyen
 * email: shn2020@email.vccs.edu	
 * purpose: calculate perimeter and are of the rectangle
 *
 */

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double width,height,P,S;

		// prompt user to input height and width of the rectangle
		System.out.print("Enter the width: ");
		width = input.nextDouble();
		System.out.print("Enter the height: ");
		height = input.nextDouble();
		
		// calculate perimeter and area of the rectangle.
		
		P = (width + height)*2;
		S = width*height;
		
		// output
		
		System.out.println("Perimeter of the rectangle: " + P);
		System.out.println("Area of the rectangle: " + S);
		
		input.close();
	}
}
