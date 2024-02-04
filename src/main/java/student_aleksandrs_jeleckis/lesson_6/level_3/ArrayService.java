package student_aleksandrs_jeleckis.lesson_6.level_3;

 class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        boolean result = false;

        for (int element : arr) {
            if (element == numberToSearch) {
                result = true;
                break;
            }
        }
        return result;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;

        for (int element : arr) {
            if (element == numberToSearch) {
                count++;
            }
        }
        return count;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                result = true;
                break;
            }
        }
        return result;
    }
}






