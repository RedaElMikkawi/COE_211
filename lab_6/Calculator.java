package Lab_6;

import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;


    public Calculator() {

        Scanner input = new Scanner(System.in);
    System.out.print("Input the first number: ");
    int num1=input.nextInt();
         System.out.print("Input the operator: ");
    String operator=input.next();
         System.out.print("Input the second number: ");
    int num2=input.nextInt();

         switch (operator) {
        case "+":
            System.out.print(add(num1, num2));
            break;
        case "-":
            System.out.print(subtract(num1, num2));
            break;
        case "*":
            System.out.print(multiply(num1, num2));
            break;
        case "/":
            System.out.print(divide(num1,num2));
        default:
            break;

    }
}


    public String add(int a, int b) {
        int s=a+b;
        String v=(a+" + "+b+" = " +s);
        return v;

    }

    public String subtract(int a, int b) {
        int s=a-b;
        String v= (a+" - "+b+" = "+s);
        return v;
    }

    public String multiply(int a, int b) {
        int s=a*b;
        String v= (a+" * "+b+" = "+s);
        return v;
    }

    public String divide(int a, int b) {
        double s=(double)a/b;
        String v= (a+" / "+b+" = "+s);
        return v;
    }


}





