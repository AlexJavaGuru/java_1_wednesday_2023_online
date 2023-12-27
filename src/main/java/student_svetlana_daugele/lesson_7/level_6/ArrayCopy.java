package student_svetlana_daugele.lesson_7.level_6;

class ArrayCopy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int length = arrayLength(in, numberFrom, numberTo);
        return createNewArray(in, numberFrom, numberTo, length);
    }

    public int arrayLength(int[] in, int numberFrom, int numberTo) {
        int length = 0;
        for (int num : in) {
            if (num >= numberFrom && num <= numberTo) {
                length++;
            }
        }
        return length;
    }

    public int[] createNewArray(int[] in, int numberFrom, int numberTo, int length) {
        int[] result = new int[length];
        int index = 0;
        for (int num : in) {
            if (num >= numberFrom && num <= numberTo) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }

}
