package co.grandcircus;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		// Alex Nouhan
		// Grand Circus 2019

		// Create scanner and declare variables
		Scanner scan = new Scanner(System.in);

		boolean flag = true;
		int counter = 0;

		// Greet user
		System.out.println("Welcom to the Circle Tester");

		while (flag) {
			counter += 1;
			System.out.println();
			double radius = Validator.getDouble(scan, "Enter radius: ", 1, 100000000);

			Circle userCircle = new Circle(radius);

			System.out.println("Circumference: " + userCircle.getFormattedCircumference());
			System.out.println("Area: " + userCircle.getFormattedArea());
			
			while (flag) {
				int go = Validator.getGo(scan, "Continue? (y/n/c): ");

				if (go == 1) {
					break;
				} else if (go == 2) {
					flag = false;
				} else if (go == 3) {
					System.out.println();
					System.out.println("\"Give me a lever long enough and a fulcrum on which to place it, and I shall move the world.\"");
					System.out.println();
					continue;

				}
			}
		}

		System.out.println();
		System.out.println("You built " + counter + " circles.");
		System.out.println("Goodbye.");
	}

}
