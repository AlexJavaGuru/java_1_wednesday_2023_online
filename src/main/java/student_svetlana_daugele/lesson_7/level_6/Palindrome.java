package student_svetlana_daugele.lesson_7.level_6;

public class Palindrome {
    public boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        text = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        char[] characters = text.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            if (characters[left] != characters[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
/*
Написать программу, которая определяет, является ли строка палиндромом.
Палиндром - это буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
Иногда палиндромом называют любой симметричный относительно своей середины набор символов,
например: "racecar", "level", "sum summus mus", "А роза упала на лапу Азора".

Создать класс Palindrome, который реализует следующий метод:

    boolean isPalindrome(String text)

метод возвращает true, если строка является палиндромом,
в противном случае возвращается false.

Ограничения:
- Логику проверки необходимо реализовать при помощи массивов;
- Регистр букв (верхний/нижний) при проверке необходимо игнорировать (LeVEl = level);

Перед реализацией метода isPalindrome() создайте класс PalindromeTest
и в нём напишите тесты. Так как реализация метода isPalindrome()
будет пуста (например всегда будет возвращать false) то тесты будут
не проходить. После того как вы написали тесты можете приступать
к реализации самого метода isPalindrome(). После того как вы закончите
все ваши тесты должны проходить. В конце обязательно напишите тест
на негативный сценарий и убедитесь в том, что он тоже работает.
 */