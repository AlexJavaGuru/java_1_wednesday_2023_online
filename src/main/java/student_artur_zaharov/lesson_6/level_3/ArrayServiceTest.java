package student_artur_zaharov.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        testContainsPositive();
        testContainsNegative();
        testCountContained();
        testCountContainedNoNumber();
        testReplaceFirst();
        testReplaceAll();
        testReplaceNON();
        testRevert();

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
    static void checkTrueArray(int[] expected, int[] actual) {
        if (Arrays.equals(expected, actual)) {
            System.out.println("Test checkTrueArray OK");
        } else {
            System.out.println("Test checkTrueArray Failed");
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
    static void testReplaceFirst() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {1, 2, 3, 4, 5};
        int targetNumber = 1;
        int replacementNumber = 7;

        System.out.println("testReplaceFirst:");
        checkTrue(arrayService.replaceFirst(myArray, targetNumber, replacementNumber));

    }

    static void testReplaceAll() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {1, 2, 3, 4, 5,1,1};
        int targetNumber = 1;
        int replacementNumber = 7;

        System.out.println("test ReplaceAll:");
        checkTrueNumber(3, arrayService.replaceAll(myArray, targetNumber, replacementNumber));

    }
    static void testReplaceNON() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {1, 2, 3, 4, 5,1,1};
        int targetNumber = 6;
        int replacementNumber = 7;

        System.out.println("test ReplaceNON:");
        checkTrueNumber(0, arrayService.replaceAll(myArray, targetNumber, replacementNumber));

    }

    public static void testRevert(){
        ArrayService arrayService = new ArrayService();
        int[] myArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {5, 4, 3, 2, 1};

        System.out.println("test Revert:");
        checkTrueArray(expectedArray, arrayService.revert(myArray));
    }

}