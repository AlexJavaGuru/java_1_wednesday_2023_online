package student_dmitrijs_voronins.lesson_3.Level_3;

class Robot {

    String name;

    public Robot(String newName){
        this.name = newName;

    }

    public void sayHello(){
        System.out.println("Hello!");


    }
    public void sayYouName(){
        System.out.println("My name is :" + this.name);
    }


}
//Создайте класс робот (Robot).
//
//Научите вашего робота "говорить" привет.
//
//Создайте в классе Robot метод со следующей сигнатурой:
//
//    public void sayHello() {
//        // тут напишите команду распечатки на консоли строки "Hello!"
//    }