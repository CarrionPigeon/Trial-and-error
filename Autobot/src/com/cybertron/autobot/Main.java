package com.cybertron.autobot;

public class Main {

    public static void main(String[] args) {
        boolean prime = true;
        int value1= 21; //Transformer serial number to test
        for (int i = 2; i <= value1 / 2; ++i) {
            if (value1 % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println(value1 + " is a Optimus number.");
        else
            System.out.println(value1 + " is a Decepticon number.");
    }
}
