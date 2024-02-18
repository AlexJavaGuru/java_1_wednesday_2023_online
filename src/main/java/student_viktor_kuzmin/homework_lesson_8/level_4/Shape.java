package student_viktor_kuzmin.homework_lesson_8.level_4;

abstract class Shape {

    protected String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}

