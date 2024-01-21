package student_artur_zaharov.lesson_5.level_5;



public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 5;
        int[] newArray = arrayUtil.createArray(arrayLength);

        if (newArray != null) {
            System.out.println("Null test passed");
        } else {
            System.out.println("Null test failed");
        }

            if (newArray.length == arrayLength) {
                System.out.println("MAIN TEST PASSED");

            } else {
                System.out.println("MAIN TEST FAILED");


            }
        }
    }

