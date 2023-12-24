package student_sergejs_kibals.homework2.level7;

class CircleDemo {

    public static void main(String[] args) {

     Circle Circle1 = new Circle("C1", 5);
     Circle Circle2 = new Circle("C2", 10);
     Circle Circle3 = new Circle("C3", 20);

        System.out.println("Area of a " + Circle1.name + " = " + Circle1.calculateArea());
        System.out.println("Area of a " + Circle2.name + " = " + Circle2.calculateArea());
        System.out.println("Area of a " + Circle3.name + " = " + Circle3.calculateArea());
    }
}
