package student_svetlana_daugele.lesson_6.level_3;

public class ArrayServiceDemo {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 5, 6, 3, 4, 2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length- i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}


