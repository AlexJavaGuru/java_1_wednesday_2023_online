package student_viktor_kuzmin.homework_lesson_8.level_1;

class DefaultConstructorV3Demo {


    public static void main(String[] args) {

        DefaultConstructorV3 cons = new DefaultConstructorV3();

        System.out.println("Full name is:" + cons.getFullName());
        System.out.println("Age is:" + cons.getAge());
        System.out.println("Male:" +cons.isMale());
        System.out.println("Female" + cons.getFemale());

    }
}
