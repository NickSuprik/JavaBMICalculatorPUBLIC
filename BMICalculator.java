package day3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = 0, height = 0, heightsq = 0;
        
        // Loop until a valid weight is entered
        while (true) {
            System.out.println("Enter your body weight in pounds (lbs), just the number:");
            if (scanner.hasNextDouble()) {
                weight = scanner.nextDouble();
                break; // Exit loop when valid input is received
            } else {
                System.out.println("Error: Input is not a valid number. Please try again.");
                scanner.next(); // Consume invalid input to prevent infinite loop
            }
        }
        
        // Loop until a valid height is entered
        while (true) {
            System.out.println("Enter your height in inches, just the number:");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                heightsq = height * height;
                break; // Exit loop when valid input is received
            } else {
                System.out.println("Error: Input is not a valid number. Please try again.");
                scanner.next(); // Consume invalid input
            }
        }

        // Calculate BMI
        double BMI = weight / heightsq * 703;
        System.out.println("Your BMI is " + BMI);

        // Determine category
        if (BMI < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("BMI Category: Healthy Weight");
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println("BMI Category: Overweight");
        } else {
            System.out.println("BMI Category: Obesity");
        }

        scanner.close();
    }
}
