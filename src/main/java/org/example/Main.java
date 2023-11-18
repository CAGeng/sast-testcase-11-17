package org.example;

import java.lang.reflect.Field;

public class Main {
    public String whp = "pig";
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main2 = new Main();
        main2.callPig("pig");

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

    public Main(String s){
        whp = s;
    }

    public Main(){

    }
}