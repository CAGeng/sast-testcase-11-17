package org.example.PointToTest;

public class PointToAnalysisTest {

    public static void main(String[] args) {
        PointToAnalysisTest pointToAnalysisTest = new PointToAnalysisTest();
        pointToAnalysisTest.test1();
    }

    public void test1(){
        Animal animal = new Pig();
        System.out.println(animal.eat());
    }
}
