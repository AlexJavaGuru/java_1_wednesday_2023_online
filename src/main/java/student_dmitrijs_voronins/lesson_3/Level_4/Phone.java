package student_dmitrijs_voronins.lesson_3.Level_4;

class Phone {

    String model;

    public Phone(String newModel){
        this.model = newModel;
    }

    String getModel(){
        return this.model;
    }



}
//Найти ошибку в коде.
//Исправить и запустить программу.
//Менять можно только класс Phone.
//
//class Phone {
//
//    String model;{
//
//    Book(String newModel) {
//        this.model = newModel;
//    }
//
//    String getModel() {
//        return this.model;
//    }
//
//}
//
//class PhoneDemo {
//
//    public static void main(String[] args) {
//        Phone myPhone = new Phone("Huawei");
//        String phoneModel = myPhone.getModel();
//        System.out.println("Phone model = " + phoneModel);
//    }
//
//}