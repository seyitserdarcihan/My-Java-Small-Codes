/* In this code, I am trying to learn error handling.
   Although I don't understand it completely, I am
   adding the code here to be able to compare this with
   ShowApproximateLifetime code.
   The difference is at lines 22-31
 */

package approximatelifetime;

        import java.util.Scanner;
        import java.util.InputMismatchException;   //This class is used to write error-handling code (go to 22-31)
public class ApproximateLifetimeErrorHandling {

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


/* The difference between this code and ShowApproximateLifetime is error handling.
   try-catch block causes an error message shown in console if
   a non-numeric input was typed for birthYear or deathYear.
 */