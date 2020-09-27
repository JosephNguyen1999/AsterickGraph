/*
 * StarGraph.java
 * Author:  Joseph Nguyen 
 * Submission Date:  3/2/2020
 *
 * Purpose: The program creates arrays of x and y values (y is the absolute value of the sin of x) and then based off the y, it makes a graph made up of astericks to represent the integer of y.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class StarGraph {

	public static void main(String[] args) {

		//declare variables
		int quantity, numberOfAstericks;
		double increment, minimum;

		//scanner and initialize quantities for the arrays
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: ");
		quantity = keyboard.nextInt();
		keyboard.nextLine();
		if (quantity <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		minimum = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("Enter the amount to increment x: ");
		increment = keyboard.nextDouble();
		keyboard.nextLine();
		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		//declare arrays
		double[] xValues = new double[quantity];
		double[] yValues = new double[quantity];

		//initialize the doubles in the arrays
		System.out.println("");
		System.out.println("Values");
		for (int i = 0; i < xValues.length; i++) {
			xValues[i] = minimum + (i* increment);
			yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
			System.out.print("x: ");
			System.out.format("%.03f", xValues[i]);
			System.out.print(", " + "y: ");
			System.out.format("%.03f%n", yValues[i]);
		}

		//creates a graph of astericks based off the integer value of each y
		System.out.println("");
		System.out.println("Graph");
		for (int i = 0; i < yValues.length; i++) {
			System.out.print(":");
			numberOfAstericks = (int) yValues[i];
			for (int asterick = 0; asterick < numberOfAstericks; asterick++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.exit(0);
		keyboard.close();
	}

}
