package student_sergejs_kibals.homework2.level1;

class Robot {

    String name;

    public Robot(String robotName){
        this.name = robotName;

    }

    public void sayHello(){
        System.out.println("Hello!");
    }
    public void sayYourName(){
        System.out.println("My name is " + this.name + ".");
    }
}
