package student_dmitrijs_voronins.lesson_3.Level_3;

public class RobotDemo {
    public static void main(String[] args) {

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYouName();


        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYouName();


    }
}
//Создайте отдельный класс RobotDemo для демонстрации
//работы с классом Robot.
//
//Внутри класса RobotDemo создайте метод
//
//    public static void main(String[] args) {
//        // создайте экземпляр класса Robot вызвав конструктор класса
//        // сохраните ссылку (указатель) на только, что созданный
//        // виртуальный обьект класса Robot в переменную,
//        // она нам понадобиться для дальнейшего использования.
//    }
