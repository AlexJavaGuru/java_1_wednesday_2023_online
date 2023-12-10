package teacher.lesson_4_if_statement.lessoncode;

public class ComplexConditions {

    public static void main(String[] args) {

        boolean flag = false;

        System.out.println(!flag);
        System.out.println(flag);

        boolean isRainOutside = false;
        boolean isGoodWeather = true;
//        boolean isWeekEnd = true;
//
//        if (isGoodWeather || isWeekEnd) {
//            System.out.println("Mood is great!");
//        }


        if (isGoodWeather && isRainOutside) {
            System.out.println("I need my umbrella...");
        } else if (isGoodWeather) {
            System.out.println("Go for a walk without an umbrella");
        }

    }
}
