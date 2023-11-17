package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        main.callPig("pig");

    }

    public void callPig(String pigName) {
        System.out.println(pigName);
    }

    public void cfgAnalyze(int input) {
        int a = input;
        if(a > 5) {
            System.out.println("a > 5");
        } else {
            System.out.println("a <= 5");
        }
    }
}