package student_artur_zaharov.lesson_7.level_6;


import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite osnovanie: ");
        int osnovanie = scanner.nextInt();

        System.out.print("Vvedite stepen': ");
        int stepen = scanner.nextInt();

        int rezultat = exponent(osnovanie, stepen);

        System.out.println(osnovanie + " v stepeni " + stepen + " = " + rezultat);
    }


    static int exponent(int osnovanie, int stepen) {
        int rezultat = 1;
        for (int i = 0; i < stepen; i++) {
            rezultat *= osnovanie;
        }

        return rezultat;
    }
}




