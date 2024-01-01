package teacher.lesson_7_encapsulation.lessoncode.encapsulation;

/*
▸ private
▸ default (package private)
▸ public

State
1. Current counter value cannot be accessed directly
‣ Behaviour
2. Can increment, decrement and clear counter value
3. Can set counter value to any specified positive
number (otherwise set to 0)
4. Can be constructed only within the same package
 */

class BasicCounter {

    private int value;

    void setValue(int newValue) {
        if (isPositive(newValue)) {
            value = newValue;
        } else {
            clear();
        }
    }

    int getCount() {
        return value;
    }

    void increment() {
        value++;
        //value = value + 1;
    }

    void decrement() {
        value--;
        //value = value - 1;
    }

    void clear() {
        value = 0;
    }

    private boolean isPositive(int newValue) {
        return newValue >= 0;
    }

}
