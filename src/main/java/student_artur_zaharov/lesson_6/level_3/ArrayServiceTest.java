package student_artur_zaharov.lesson_6.level_3;



class ArrayServiceTest {

    public static void main(String[] args) {
        testContainsPositive();
        testContainsNegative();
        testCountContained();
        testCountContainedNoNumber();

    }

    static void checkTrue(boolean condition) {
        if (condition) {
            System.out.println("Test checkTrue OK");
        } else {
            System.out.println("Test checkTrue Failed");
        }

    }

    static void checkTrueNumber(int expected, int actual) {
        if (expected == actual) {
            System.out.println("Test checkTrueNumber OK");
        } else {
            System.out.println("Test checkTrueNumber Failed");
        }

    }

    static void checkFalse(boolean condition) {
        checkTrue(!condition);
    }

    static void testContainsPositive() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {1, 2, 3, 4, 5};
        int numberToSearch = 3;
        checkTrue(arrayService.contains(myArray, numberToSearch));

    }

    static void testContainsNegative() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {1, 2, 3, 4, 5};
        int numberToSearch = 6;
        checkFalse(arrayService.contains(myArray, numberToSearch));
    }

    public static void testCountContained() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {1, 2, 3, 3, 4, 5, 5, 5, 5};
        int numberToCount = 5;
        checkTrueNumber(4, arrayService.countContains(myArray, numberToCount));
        System.out.println("Velsja podschet cifir:" + numberToCount + " podschet sostavil: " + arrayService.countContains(myArray, numberToCount));

    }

    public static void testCountContainedNoNumber() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {1, 2, 3, 3, 4, 5, 5, 5, 5};
        int numberToCount = 6;
        checkTrueNumber(0, arrayService.countContains(myArray, numberToCount));
        System.out.println("Velsja podschet cifir:" + numberToCount + " podschet sostavil: " + arrayService.countContains(myArray, numberToCount) + "<---resultat 0, chisla netu v massive!!!");

    }

}