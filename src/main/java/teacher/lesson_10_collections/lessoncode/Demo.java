package teacher.lesson_10_collections.lessoncode;

import java.util.Optional;

public class Demo {

    public static void main(String[] args) {

    }

    public void doSomething(Student student) {
//        if (student != null) {
//            int studentId = student.getId();
//        }
        int studentId = Optional.ofNullable(student)
                .map(Student::getId)
                .orElse(0);
        //что-то делаете
    }
}
