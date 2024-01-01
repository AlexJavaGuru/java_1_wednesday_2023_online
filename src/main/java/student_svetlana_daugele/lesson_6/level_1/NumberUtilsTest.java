package student_svetlana_daugele.lesson_6.level_1;

class NumberUtilsTest {

    public static void main(String[] args) {

        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTestForEvenNumber(4);
        numberUtilsTest.isEvenTestForOddNumber(5);
    }
    public void isEvenTestForEvenNumber (int number) {
        NumberUtils numberUtils = new NumberUtils();
        boolean expectedResult = true;
        if (numberUtils.isEven(number) == expectedResult) {
            System.out.println(" Is even test is ok");
        }else{
                System.out.println(" Is even test is false");
            }
        }
    public void isEvenTestForOddNumber (int number) {
        NumberUtils numberUtils = new NumberUtils();
        boolean expectedResult = false;
        if (numberUtils.isEven(number) == expectedResult) {
            System.out.println(" Is even test is ok");
        }else{
            System.out.println(" Is even test is false");
        }
    }
}
/*
Напишите тесты для проверки метода isEven(int number).
Упростите работу метода, код внутри может быть написан в одну строку.

class NumberUtils {

    public boolean isEven(int number) {
           return (number % 2 == 0);
      }
}
 */
