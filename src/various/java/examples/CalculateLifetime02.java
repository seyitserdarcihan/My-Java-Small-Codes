/* Bu kodun CalculateLifetime01 kodundan farkı,
   24-30 no.lu satırlarda try-catch blokunun eklenmesi
 */


package various.java.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateLifetime02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the name of the person, the year of birth and the year of death: ");

        String personName = scan.nextLine();

        short birthYear = 0;
        short deathYear = 0;

        try {
            birthYear = scan.nextShort();
            deathYear = scan.nextShort();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid years as numbers.");
            System.exit(1);
        }

        int lifetime = deathYear - birthYear ;
        String born = " was born in ";
        String died = " was died in ";
        String approximation = " was approximately " + lifetime + " years old.";

        System.out.println(personName + born + birthYear + " and" + died + deathYear + "\n" +
                "when " + personName + approximation);

        scan.close();

    }
}
