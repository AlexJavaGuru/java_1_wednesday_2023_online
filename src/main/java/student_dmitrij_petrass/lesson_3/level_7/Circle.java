package student_dmitrij_petrass.lesson_3.level_7;

class Circle {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
