package student_svetlana_daugele.lesson_8.level_1;

class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 newPerson = new DefaultConstructorV3();
        newPerson.getAge();
        newPerson.isFemale();
        newPerson.getFullName();
        newPerson.isMale();
        System.out.println("Person's name is " + newPerson.getFullName());
        System.out.println("Person's age is " + newPerson.getAge());
        System.out.println("Person is female: " + newPerson.isFemale());
        System.out.println("Person is male: " + newPerson.isMale());
    }
}
