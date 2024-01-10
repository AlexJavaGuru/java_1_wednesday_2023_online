package teacher.lesson_10_collections.lessoncode;

import java.util.Objects;

public class Student {

    int id;
    int course;
    String name;

    public Student(int id, int course, String name) {
        this.id = id;
        this.course = course;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", course=" + course +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, name);
    }
}
