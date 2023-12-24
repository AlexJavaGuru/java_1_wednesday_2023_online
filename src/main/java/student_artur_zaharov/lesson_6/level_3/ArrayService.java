package student_artur_zaharov.lesson_6.level_3;

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
}






