package student_aleksandra_azbuka.lesson_3;

class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
