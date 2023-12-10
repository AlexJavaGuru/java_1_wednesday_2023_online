package student_artur_zaharov.lesson_2.level_1_intern;

import java.util.Scanner;
public class ZaLesson2Task1v1 {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Читаем первое число
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        // Читаем второе число
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        // Закрываем Scanner, так как больше не нужен
        scanner.close();

        // Выполняем операции
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;

        // Проверка деления на ноль перед выполнением операции деления
        if (secondNumber != 0) {
            int division = firstNumber / secondNumber;

            // Вывод результатов на консоль
            System.out.println("Результат сложения: " + sum);
            System.out.println("Результат вычитания: " + difference);
            System.out.println("Результат умножения: " + product);
            System.out.println("Результат деления: " + division);
        } else {
            System.out.println("Деление на ноль невозможно.");
        }
    }
}

