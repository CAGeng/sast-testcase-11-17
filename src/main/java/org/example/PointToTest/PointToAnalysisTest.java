package org.example.PointToTest;

public class PointToAnalysisTest {

    public static void main(String[] args) {
        PointToAnalysisTest pointToAnalysisTest = new PointToAnalysisTest();
        pointToAnalysisTest.entry1();
    }

    public void entry1(){
        Animal animal = new Pig();
        callee1(animal);
    }

    public void callee1(Animal animal){
        String eat = animal.eat();
        sink(eat);
    }

    public void sink(String message){
        System.out.println("sink: " + message);
    }
}