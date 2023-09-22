/* A code where you type these in the console:
   Name of the person (click Enter) e.g. "Christopher Tolkien"
   Person's year of birth (click Enter) e.g. "1924"
   Person's year of death (click Enter) e.g. "2020"
   Then the code produces this output:
   "Christopher Tolkien was born in 1924 and died in 2020
   when Christopher Tolkien was approximately 96 years old"
*/
package approximatelifetime;

import java.util.Scanner;
public class ShowApproximateLifetime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the name of the person, the year of birth and the year of death: ");

        String personName = scan.nextLine();
        short birthYear = scan.nextShort();
        short deathYear = scan.nextShort();
        int lifetime = deathYear - birthYear ;
        String born = " was born in ";
        String died = " was died in ";
        String approximation = " was approximately " + lifetime + " years old.";

        System.out.println(personName + born + birthYear + " and" + died + deathYear + "\n" +
                "when " + personName + approximation);

        scan.close();

    }
}


/* I cannot write a code at the moment which can calculate exact years of lifetime
   of a person. Because it involves months and days and how to calculate them.
   It is complicated for me at the moment.
 */