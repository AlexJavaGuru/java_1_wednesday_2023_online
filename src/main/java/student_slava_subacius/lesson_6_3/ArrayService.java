package student_slava_subacius.lesson_6_3;

class ArrayService {
     public boolean contains(int[] arr, int numberToSearch) {
         for (int num : arr) {
             if (num == numberToSearch) {
                 return true;
             }
         }
         return false;
     }

     public int countOccurrences(int[] arr, int numberToSearch) {
         int count = 0;
         for (int i = 0; i < arr.length; i++)
             if (arr[i] == numberToSearch) {
                 count++;
             }
         return count;
     }

     public boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == numberToReplace) {
                 arr[i] = newNumber;
                 return true;
             }
         }
         return false;
     }

     public boolean replaceAll(int[] arr, int numberToReplace, int newNumber) {
         int count = 0;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == numberToReplace) {
                 arr[i] = newNumber;
                 count ++;
                 return true;
             }
         }
         return false;
     }
     public int[] reverse(int[] arr) {
         int[] reverseArray = new int[arr.length];
         for (int i = 0; i < arr.length ; i ++) {
             reverseArray[i] = arr[arr.length -1 - i];
         }
         return reverseArray;
     }
        public boolean sort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
            return true;

        }
 }

