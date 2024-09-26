package org.example;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private List<Integer> oddNumbers;
    private List<Integer> evenNumbers;

    public OddEvenSeparator() {
        oddNumbers = new ArrayList<>();
        evenNumbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    public void even() {
        System.out.println("Even numbers: " + evenNumbers);
    }

    public void odd() {
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
