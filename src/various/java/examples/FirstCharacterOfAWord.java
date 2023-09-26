package various.java.examples;

import java.util.Scanner;

public class FirstCharacterOfAWord {

    public static void main(String[] args) {

        Scanner scanThis = new Scanner(System.in);

        System.out.println("Please enter a single word: ");

        char firstCharacter = scanThis.next().charAt(0);

        System.out.println("First character of the word typed is: " + firstCharacter);

    }
}
