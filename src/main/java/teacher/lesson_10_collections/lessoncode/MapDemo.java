package teacher.lesson_10_collections.lessoncode;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, Student> studentCatalog = new HashMap<>();

        studentCatalog.put(101, new Student(1001, 2,"Alex"));
        studentCatalog.put(102, new Student(1002, 1, "Viktor"));
        studentCatalog.put(103, new Student(1003, 4, "Svetlana"));

        Student student = studentCatalog.get(103);
        System.out.println(student);

        for (Student studentValue : studentCatalog.values()) {
            if (studentValue.getId() == 1001) {
                System.out.println(studentValue);
            }
        }

        studentCatalog.put(101, new Student(1001, 3, "Alex"));
        for (Map.Entry<Integer, Student> entry : studentCatalog.entrySet()) {
            System.out.println("Key - " + entry.getKey() + " value - " + entry.getValue());
        }

    }
}
