package student_dmitrijs_voronins.lesson_3.Level_7;

public class DiceRollDemo {
    public static void main(String[] args) {
        Dice firstDie = new Dice();
        Dice secondDie = new Dice();
        firstDie.roll();
        secondDie.roll();
        firstDie.rolll();
        secondDie.rolll();
        System.out.println("Dice 1 :" + firstDie.getValue());
        System.out.println("Dice 2 :" + secondDie.getValue());
        System.out.println("Dice 1 and 2 :" +firstDie.getValue() + secondDie.getValue());
    }
}
