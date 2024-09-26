package org.example;

public class Balance {
    int rightWeight = 0;
    int leftWeight = 0;
    void addLeft(int weight) {
        this.leftWeight += weight;
    }
    void addRight(int weight) {
        this.rightWeight += weight;
    }
    String result() {
        if (this.rightWeight > this.leftWeight) {
            return "R";
        }
        if (this.rightWeight < this.leftWeight) {
            return "L";
        }
        return "=";
    }
}
