package student_svetlana_daugele.lesson_3.level_7_senior;

public class Circle {
    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public void announceCalculatedArea() {
        double calculatedArea = calculateArea();
        System.out.println("The Circle Area is " + calculatedArea + ".");
    }

}

