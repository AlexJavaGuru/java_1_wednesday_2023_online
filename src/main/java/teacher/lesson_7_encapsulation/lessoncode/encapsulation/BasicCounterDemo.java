package teacher.lesson_7_encapsulation.lessoncode.encapsulation;

public class BasicCounterDemo {

    public static void main(String[] args) {
        BasicCounter counter = new BasicCounter();

        System.out.println(counter.getCount());
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();

        System.out.println(counter.getCount());

        counter.clear();
        counter.setValue(-100);
        System.out.println(counter.getCount());

    }
}
