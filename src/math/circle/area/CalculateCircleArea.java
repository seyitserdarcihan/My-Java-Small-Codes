package math.circle.area;

import java.util.Scanner;

public class CalculateCircleArea {

    public static void main(String[] args) {

        Scanner scanning = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");

        if (scanning.hasNextInt()) {

            int radius = scanning.nextInt();

            double area = Math.PI * radius * radius;

            System.out.println("The area of the circle with radius " + radius + " is: " + area);

        } else {

            System.out.println("Invalid input. Please enter an integer.");
        }

        scanning.close();

    }
}

