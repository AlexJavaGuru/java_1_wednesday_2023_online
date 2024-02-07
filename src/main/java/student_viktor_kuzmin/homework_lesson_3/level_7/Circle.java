package student_viktor_kuzmin.homework_lesson_3.level_7;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
