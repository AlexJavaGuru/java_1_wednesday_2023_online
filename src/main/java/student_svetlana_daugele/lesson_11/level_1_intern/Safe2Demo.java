package student_svetlana_daugele.lesson_11.level_1_intern;

public class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe2 = new Safe2("1234", 300.50);
        safe2.putMoney("1234", 500.45);
        safe2.putMoney("1234", 199.05);
        safe2.getMoney("1234", 500);
        safe2.getMoney("1234", 600);
        safe2.getMoney("1235", 600);
    }
}
