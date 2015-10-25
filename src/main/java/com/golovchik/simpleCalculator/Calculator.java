package com.golovchik.simpleCalculator;

public class Calculator {

    public Calculator(){}

    public void definitionOfOperation(double a, Character sign, double b){
        switch(sign){
            case '+':
                System.out.println(a + " + " + b + " = " + this.add(a,b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + this.sub(a,b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + this.mul(a,b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + this.div(a,b));
                break;
            default:
                System.out.println("Unknown operation");
                break;
        }
    }
    public double add(double a, double b) {
        double c = a + b;
        return c;
    }

    public double sub(double a, double b) {
        double c = a - b;
        return c;
    }

    public double mul(double a, double b) {
        double c = a * b;
        return c;
    }

    public double div(double a, double b) {
        double c = a / b;
        return c;
    }
}