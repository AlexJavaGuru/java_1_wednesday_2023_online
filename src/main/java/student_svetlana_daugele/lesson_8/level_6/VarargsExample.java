package student_svetlana_daugele.lesson_8.level_6;

class VarargsExample {
    public static void main(String[] args) {
        run(1,2,3);
    }

    public static void run(int ... start) {
        System.out.println("Varargs length is " + start.length);
        System.out.println("The first argument in varargs is " + start[0]);
    }

}
/*
Узнать в интернете, что такое varargs.
Придумайте пример кода, в котором продемонстрируйте
использование varargs.
 */
