package student_dmitrijs_voronins.lesson_3.Level_7;

public class ComputerDemo {

    public static void main(String[] args) {

        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model= dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);



    }
}


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