package student_artur_zaharov.lesson_6.level_1;



class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest utilsTest = new NumberUtilsTest();
        utilsTest.Test1();

    }

    public void Test1(){
        boolean expectedResult = true;
        NumberUtils victim = new NumberUtils();
        boolean realResult = victim.isEven(2);
        if  (realResult == expectedResult) {
            System.out.println("Test = passed" );
        }else {
            System.out.println("Test = failed" );
        }

    }
}
