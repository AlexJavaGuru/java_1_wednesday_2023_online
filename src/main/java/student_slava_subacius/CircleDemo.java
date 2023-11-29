package student_slava_subacius;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5.0 ;
        double area = circle.calculateArea();
        System.out.println("Аrea of circle : " + area);
    }
}
