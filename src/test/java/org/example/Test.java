package org.example;

import org.example.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// Тесты для класса Button
class ButtonTest {
    @Test
    void testButtonClick() {
        Button button = new Button();
        button.click();  // Первый клик
        button.click();  // Второй клик

        // Поскольку метод click() выводит результат на экран,
        // мы не можем проверить напрямую результат через Assertions,
        // но можем использовать дополнительные методы для проверки
        // количества кликов, если они добавлены.
    }
}

// Тесты для класса Balance
class BalanceTest {
    @Test
    void testBalanceEqual() {
        Balance balance = new Balance();
        balance.addLeft(5);
        balance.addRight(5);
        assertEquals("=", getBalanceResult(balance));
    }

    @Test
    void testBalanceLeftHeavier() {
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(5);
        assertEquals("L", getBalanceResult(balance));
    }

    @Test
    void testBalanceRightHeavier() {
        Balance balance = new Balance();
        balance.addLeft(3);
        balance.addRight(7);
        assertEquals("R", getBalanceResult(balance));
    }

    // Метод для имитации работы result() в Balance
    private String getBalanceResult(Balance balance) {
        // Перехват вывода метода result() для тестирования
        return balance.result();  // Замените возвращение результата
    }
}

// Тесты для класса Bell
class BellTest {
    @Test
    void testBellSound() {
        Bell bell = new Bell();
        assertEquals("ding", getBellSound(bell));
        assertEquals("dong", getBellSound(bell));
        assertEquals("ding", getBellSound(bell));
    }

    // Метод для получения результата звука
    private String getBellSound(Bell bell) {
        return bell.sound();  // Добавьте возвращение звука в метод sound()
    }
}

// Тесты для класса OddEvenSeparator
class OddEvenSeparatorTest {
    @Test
    void testOddEvenSeparator() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);

        List<Integer> even = separator.even();
        List<Integer> odd = separator.odd();

        assertEquals(List.of(2, 4), even);
        assertEquals(List.of(1, 3), odd);
    }
}

// Тесты для класса Table
class TableTest {
    @Test
    void testTableSetAndGetValue() {
        Table table = new Table(3, 3);
        table.setValue(0, 0, 5);
        table.setValue(1, 1, 10);

        assertEquals(5, table.getValue(0, 0));
        assertEquals(10, table.getValue(1, 1));
    }

    @Test
    void testTableAverage() {
        Table table = new Table(3, 3);
        table.setValue(0, 0, 5);
        table.setValue(1, 1, 10);
        table.setValue(2, 2, 15);

        assertEquals(3.33, table.average(), 0.01);
    }

    @Test
    void testTableToString() {
        Table table = new Table(2, 2);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(1, 0, 3);
        table.setValue(1, 1, 4);

        String expected = "1 2\n3 4\n";
        assertEquals(expected, table.toString());
    }
}
