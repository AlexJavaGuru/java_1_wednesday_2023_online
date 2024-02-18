package student_viktor_kuzmin.homework_lesson_8.level_4;

class Square extends Shape {

    private final double sideLenght;

    Square(String title, double sideLenght) {
        super(title);
        this.sideLenght = sideLenght;
    }

    @Override
    double calculateArea() {
        return sideLenght * sideLenght;
    }


    @Override
    double calculatePerimeter() {
        {
            return 4 * sideLenght;
        }
    }
}



