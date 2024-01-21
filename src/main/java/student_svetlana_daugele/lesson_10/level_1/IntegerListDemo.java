package student_svetlana_daugele.lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();
        integerList.add(0, 8); // Добавляем в начало


        integerList.add(9); // Добавляем в конец
        integerList.add(10);// Добавляем в конец
        integerList.add(11);// Добавляем в конец
        integerList.add(12);// Добавляем в конец

        integerList.add(0, 7); // Добавляем в начало


        System.out.println("My integer list:");
        printList(integerList);

        // Узнаем длину списка
        System.out.println("\nList length: " + integerList.size());


        int indexToRemove = 4;
        integerList.remove(indexToRemove); // Удаляем элемент по индексу


        System.out.println("\nMy list after deleting index " + indexToRemove + ":");
        printList(integerList);


        Integer integerToRemove = 10;
        integerList.remove(integerToRemove);// Удаляем элемент без указания индекса (удалится первый найденный элемент)

        // Выводим окончательное содержимое списка
        System.out.println("\nMy list after deleting of integer  " + integerToRemove + ":");
        printList(integerList);


        System.out.println("\nMy list is empty: " + integerList.isEmpty()); // Проверяем, является ли список пустым
    }

    private static void printList(List<Integer> list) {
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}


/*
В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
- добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по индексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.
 */