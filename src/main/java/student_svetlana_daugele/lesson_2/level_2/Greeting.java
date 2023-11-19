package student_svetlana_daugele.lesson_2.level_2;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your name");
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
    }
}