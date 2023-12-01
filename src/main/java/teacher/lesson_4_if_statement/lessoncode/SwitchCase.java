package teacher.lesson_4_if_statement.lessoncode;

public class SwitchCase {

    public static void main(String[] args) {
        String drink = "Alex";
        switch (drink) {
            case "coffee":
                System.out.println("I would go for Java!");
                break;
            case "tea":
                System.out.println("Everything but Lipton");
                break;
            default:
                System.out.println("Ugh.. What?");
        }
    }
}
