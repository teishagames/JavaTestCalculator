package com.Teisha;


import java.util.Scanner;

public class Operation {

    static Scanner scanner=new Scanner(System.in);
    static int numbers[]  = {1, 4, 5, 9, 10, 50, 100, 500, 1000 };

    static String letters[]  = { "I", "IV", "V", "IX", "X", "L", "C", "D", "M"};

    public static int getInt() {
        System.out.println("Enter number");
        int num = 0;
        String romanString=new String();
        char romanChar;
        if (scanner.hasNextInt() ) {
            num = scanner.nextInt();


        }else if(scanner.hasNext())
        {

            romanString=scanner.next();
            romanChar=romanString.charAt(0);
        switch (romanChar){

            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
            case 'X':
                num = 10;
                break;
            case 'L':
                num = 50;
                break;
            case 'C':
                num = 100;
                break;
            case 'D':
                num = 500;
                break;
            case 'M':
                num = 1000;
                break;
           // default:   return -1;
        }


        }

        else {

            System.out.println("Not String please....");
            scanner.next();
            num = getInt();
        }
        return num;

    }

    public static char getOperation() {
        System.out.println("Enter operation");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);


        } else {
            System.out.println("Error");
            scanner.next();
            operation = getOperation();
        }
        return  operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result=0;
        switch (operation) {
            case '+':
                result=num1 + num2;
                break;

            case '-':
                result= num1 - num2;
                break;
            case '*':
                result= num1 * num2;
                break;
            case '/':
                result=num1 / num2;
                break;
            default:
                System.out.println("Not understand");
                calc(num1, num2, getOperation());
        }
        return  result;



    }



}
