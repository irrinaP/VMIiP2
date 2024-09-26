package org.example;

// Main класс для демонстрации работы всех классов
public class Main {
    public static void main(String[] args) {
        // Задание 1: Демонстрация работы Button
        System.out.println("Button Test:");
        Button button = new Button();
        button.click();  // Выведет: Clicks: 1
        button.click();  // Выведет: Clicks: 2
        System.out.println();

        // Задание 2: Демонстрация работы Balance
        System.out.println("Balance Test:");
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(5);
        balance.result();  // Выведет: L

        balance.addRight(5);
        balance.result();  // Выведет: =
        System.out.println(balance.result());

        // Задание 3: Демонстрация работы Bell
        System.out.println("Bell Test:");
        Bell bell = new Bell();
        bell.sound();  // Выведет: ding
        bell.sound();  // Выведет: dong
        bell.sound();  // Выведет: ding
        System.out.println();

        // Задание 4: Демонстрация работы OddEvenSeparator
        System.out.println("OddEvenSeparator Test:");
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);

        separator.even();  // Выведет: Even numbers: [2, 4]
        separator.odd();   // Выведет: Odd numbers: [1, 3]
        System.out.println();

        // Задание 5: Демонстрация работы Table
        System.out.println("Table Test:");
        Table table = new Table(3, 3);  // Создаем таблицу 3x3
        table.setValue(0, 0, 5);
        table.setValue(1, 1, 10);
        table.setValue(2, 2, 15);

        System.out.println("Table:");
        System.out.println(table);  // Выведет таблицу
        System.out.println("Value at (1, 1): " + table.getValue(1, 1));  // Выведет: 10
        System.out.println("Average: " + table.average());  // Выведет среднее арифметическое всех значений
    }
}
