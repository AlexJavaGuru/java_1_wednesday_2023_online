package student_slava_subacius.lesson_8;

public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 instance = new DefaultConstructorV3();

        System.out.println("Full Name: " + instance.getFullName());
        System.out.println("Age: " + instance.getAge());
        System.out.println("Is Male: " + instance.isMale());
        System.out.println("Is Female: " + instance.isFemale());
    }
}
