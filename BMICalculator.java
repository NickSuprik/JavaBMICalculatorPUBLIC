package day3;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// The BMI formula using American measurements is: BMI = (weight in pounds / height in inches squared) * 703
		Scanner scanner = new Scanner(System.in);

        double weight, height, heightsq;

        System.out.println("Enter your body weight in pounds (lbs), just the number");
        if (scanner.hasNextDouble()) {
            weight = scanner.nextDouble();
        } else {
            System.out.println("Error: Input is not a valid number, please restart the program and try again.");
            return;
        }

        System.out.println("Enter your height in inches, just the number");
        if (scanner.hasNextDouble()) {
            height = scanner.nextDouble();
            heightsq = height*height;
        } else {
            System.out.println("Error: Input is not a valid number, please restart the program and try again.");
            return;
        }
        
		double BMI=weight/heightsq*703;
		System.out.println("Your BMI is "+(BMI));
		
	    // Add category display
        if (BMI < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("BMI Category: Healthy Weight");
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println("BMI Category: Overweight");
        } else if (BMI >= 30.0) {
            System.out.println("BMI Category: Obesity");
        }
		
		
	}

}
