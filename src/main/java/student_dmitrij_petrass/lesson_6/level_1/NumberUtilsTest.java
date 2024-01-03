package student_dmitrij_petrass.lesson_6.level_1;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.testNumberIsEven();
    }

    public void testNumberIsEven() {
        NumberUtil numberUtil = new NumberUtil();
        boolean actualResult = numberUtil.isEven(10);

        if (actualResult) {
            System.out.println("Number is even test = OK!");
        } else {
            System.out.println("Number is even test = FAIL!");
        }
    }
}
