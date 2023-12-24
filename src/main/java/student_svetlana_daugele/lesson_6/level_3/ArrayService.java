package student_svetlana_daugele.lesson_6.level_3;


class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        int i;
        for (i = 0; i < arr.length; i++)
            if (arr[i] == numberToSearch) {
                return true;
            }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                count++;
            }
        }
        return count;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                break;
            }
        }
        return true;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count1++;
            }
        }
        return count1;
    }


    void revert(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int midResult = arr[start];
            arr[start] = arr[end];
            arr[end] = midResult;

            start++;
            end--;
        }
    }

    void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    void printArray( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
    }




