package student_dmitrijs_voronins.lesson_3.Level_7;

class Circle {

    double radius;
    double pi;

    public Circle(double radius , double pi){
        this.radius = radius;
        this.pi = pi;
    }
    double calculateArea(){
        return pi*(radius * radius );

    }
}
//Разработать класс - круг, у которого должны быть следующие характеристики:
//Свойства: радиус (double radius),
//Методы: расчет площади (double calculateArea()).
//
//Класс с объявлением фигуры круг должен называться "Circle".
//Класс с демонстрацией работы должен называться "CircleDemo".