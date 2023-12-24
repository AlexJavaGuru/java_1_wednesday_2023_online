package student_dmitrijs_voronins.lesson_3.Level_7;

class Computer {
    String manufacturer;
    String model;

   public Computer(String manufacturer, String model){
       this.manufacturer = manufacturer;
       this.model = model;

    }

    public String getModel() {
       this.model = model;
        return model;
    }

    public String getManufacturer() {
       this.manufacturer = manufacturer;
       return manufacturer;
    }
}


//Дописать код программы, что бы она запускалась
//и выводила на консоль производителя и модель компьютера.
//Менять можно только класс Computer.
//
//class Computer {
//
//    String manufacturer;
//    String model;
//
//    Computer(String manufacturer, String model) {
//        this.manufacturer = manufacturer;
//        this.model = model;
//    }
//
//}
//
//class ComputerDemo {
//
//    public static void main(String[] args) {
//        Computer dell = new Computer("Dell", "XXX-1");
//        String manufacturer = dell.getManufacturer();
//        String model = dell.getModel();
//        System.out.println("Computer manufacturer = " + manufacturer);
//        System.out.println("Computer model = " + model);
//    }
//
//}