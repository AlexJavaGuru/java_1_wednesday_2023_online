package student_artur_zaharov.lesson_6.level_3_4;

class ArrayService {

    boolean contains(int[] myArray, int numberToSearch) {
        for (int number : myArray) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countContains (int[] myArray, int numberToCount){
        int count = 0;
        for (int number : myArray){
            if (number == numberToCount){
                count++;
            }
        }
            return count;
    }
    public boolean replaceFirst(int[] myArray, int targetNumber, int replacementNumber) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == targetNumber) {
                myArray[i] = replacementNumber;
                return true;
            }
        }
        return false;
    }

    public int replaceAll(int[] myArray, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == numberToReplace) {
                myArray[i] = newNumber;
                count++;
            }
        }
        return count;
    }
    public int[] revert(int[] myArray) {

        int start = 0;
        int end = myArray.length - 1;

        while (start < end) {

            int temp = myArray[start];
            myArray[start] = myArray[end];
            myArray[end] = temp;


            start++;
            end--;
        }
        return myArray;
    }

}







