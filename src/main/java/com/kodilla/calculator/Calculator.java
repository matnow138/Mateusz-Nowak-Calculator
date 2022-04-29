package com.kodilla.calculator;

public class Calculator {



        int a;
        int b;
        public void add(int a, int b){
            System.out.println(a+b);
        }
        public void min(int a, int b){
            System.out.println(a-b);
        }

        public static void main(String args[]) {
            Calculator calculator = new Calculator();
            calculator.add(2,3);
            calculator.min(2,3);

        }
    }


