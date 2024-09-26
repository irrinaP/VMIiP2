package org.example;

public class Button {
    private int clickCount;

    public Button() {
        clickCount = 0;
    }

    public void click() {
        clickCount++;
        System.out.println("Clicks: " + clickCount);
    }

    public int getClickCount() {
        return clickCount;
    }
}
