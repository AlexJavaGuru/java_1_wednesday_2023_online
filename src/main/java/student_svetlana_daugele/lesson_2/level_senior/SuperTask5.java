package student_svetlana_daugele.lesson_2.level_senior;
import java.util.Scanner;

public class SuperTask5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's calculate the knitting tension!");

        System.out.println(" Knit the swatch at least 15 cm in width and 15 cm in height.");

        System.out.println("Enter number of rows: ");
        double rows = scanner.nextDouble();
        // how many rows in 10 cm

        System.out.println("Enter number of stitches: ");
        double stitches = scanner.nextDouble();
        // how many stitches in 10 cm

double tensionInRows = rows / 10;
/* Number of rows in 10 cm divided on 10 .
We get the tension in rows. */

        double tensionInStitches = stitches /10;
        System.out.print("Tension in rows is : " + tensionInRows + ".");
        System.out.print(" Tension in stitches is : " + tensionInStitches + ".");

    }
}
