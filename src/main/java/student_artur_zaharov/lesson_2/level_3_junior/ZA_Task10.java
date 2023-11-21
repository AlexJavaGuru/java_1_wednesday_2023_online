package student_artur_zaharov.lesson_2.level_3_junior;
import java.util.Scanner;

public class ZA_Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double perimeter = 2.0 * Math.PI * radius;
        double plowad = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimetr kruga: " + perimeter);
        System.out.println("Plowad` kruga: " + plowad);
    }
}
