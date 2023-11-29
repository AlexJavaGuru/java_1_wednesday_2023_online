package student_dmitrij_petrass.lesson_3.level_7;

class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer("MSI", "Katana 15 B13VEK");
        String manufacturer = computer.getManufacturer();
        String model = computer.getModel();

        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Model = " + model);
    }
}
