package com.Teisha;
import  java.util.Scanner;
public class Main {



    public static void main(String[] args) {

        Operation operation=new Operation();


        int num1 = operation.getInt();
        int num2 = operation.getInt();

        char operationSymbol = operation.getOperation();

        int result = operation.calc(num1, num2, operationSymbol);
        System.out.println(result);

    }

}






