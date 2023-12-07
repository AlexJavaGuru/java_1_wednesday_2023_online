package student_dmitrijs_voronins.lesson_3.Level_7;

public class ProductDemo {

    public static void main(String[] args) {
        Product apple = new Product("Apple", 100,25.0);

        apple.printInformation();

        double actualPrice = apple.actualPrice();
        System.out.println(actualPrice);
    }
}



//Разработать класс - продукт,
//у которого должны быть следующие характеристики:
//
//Свойства:
//- Наименование (String name)
//- Стандартная цена (double regularPrice)
//- Скидка в процентах (double discount)
//
//Методы:
//1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
//Вывод информации о продукте в консоль (void printInformation())1P
//2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".
//
//Класс с объявлением продукта должен называться "Product".
//Класс с демонстрацией работы должен называться "ProductDemo".