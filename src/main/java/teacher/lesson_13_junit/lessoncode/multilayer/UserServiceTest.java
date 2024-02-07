package teacher.lesson_13_junit.lessoncode.multilayer;

import teacher.lesson_12_exceptions.lessoncode.v2.User;

public class UserServiceTest {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        long userId = 1L;
        String userName = "Alex";

        DataBaseMock dataBaseMock = new DataBaseMock();
        UserService victim = new UserService(dataBaseMock);
        boolean actualResult = victim.addUser(userId, userName);
        check(actualResult, "Test for adding user");
        check(dataBaseMock.isMethodAddWasTriggered(), "Method from Mock was triggered");
        User parameterForMethodAdd = dataBaseMock.getParameterForMethodAdd();
        User actualExpectedParameter = new User(userId, userName);
        check(parameterForMethodAdd, actualExpectedParameter, "Method from Mock was triggered");
    }

    private static void check (boolean realResult, String testName) {
        if (realResult) {
            System.out.println("Test name " + testName + " = OK");
        } else {
            System.out.println("Test name " + testName + " = FAIL");
            System.out.println("Expected: true" + "but Actual: " + realResult);
        }
    }

    private static void check (User expectedResult, User realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " has PASSED!!");
        } else{
            System.out.println(testName + " has FAILED!!");
        }
    }

}
