package student_slava_subacius.lesson_9;

class FunctionalInterfaceExample implements MyFunctionalInterface {
    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        example.myMethod();
    }
    @Override
    public void myMethod() {
        System.out.println("Executing myMethod ");

    }
}
//Функциональный интерфейс - это интерфейс, содержащий только один абстрактный метод


