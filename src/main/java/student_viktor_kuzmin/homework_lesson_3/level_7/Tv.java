package student_viktor_kuzmin.homework_lesson_3.level_7;

 class Tv {

         private double screenSize;
         private String resolution;

         public Tv(double screenSize, String resolution) {
             this.screenSize = screenSize;
             this.resolution = resolution;
         }

         public void changeChannel() {
             System.out.println("TV channel changed.");
         }

         public void displayInfo() {
             System.out.println("TV Screen Size: " + screenSize + " inches");
             System.out.println("TV Resolution: " + resolution);
         }
     }

