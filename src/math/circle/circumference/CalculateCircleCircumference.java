package math.circle.circumference;

import java.util.Scanner;

public class CalculateCircleCircumference {

    public static void main(String[] args) {

        Scanner scanning = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");

        if (scanning.hasNextInt()) {

            int radius = scanning.nextInt();

            double circumference = 2 * Math.PI * radius;

            System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);
        } else {

            System.out.println("Invalid input. Please enter an integer.");
        }

        scanning.close();
    }
}
