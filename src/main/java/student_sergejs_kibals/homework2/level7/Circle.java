package student_sergejs_kibals.homework2.level7;

class Circle {

    String name;
    double radius;

    Circle (String circleName, double circleRadius){
        this.name = circleName;
        this.radius = circleRadius;
    }

    double calculateArea(){
        return radius * radius * Math.PI;
    }

}
