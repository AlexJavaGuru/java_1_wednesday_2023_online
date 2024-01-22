package student_viktor_kuzmin.homework_lesson_3.level_7;

 class LightBulb {
     private int brightness;
     private String bulbType;

     public LightBulb (int brightness, String bulbType) {
         this.brightness = brightness;
         this.bulbType = bulbType;

     }
     public void turnOn() {
             System.out.println("Light bulb turned on.");
         }

         public void turnOff() {
             System.out.println("Light bulb turned off.");
         }

         public void displayInfo() {
             System.out.println("Light Bulb Brightness: " + brightness + " lumens");
             System.out.println("Light Bulb Type: " + bulbType);
         }

     }


