package Calc_logic;


import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Operations op =new Operations();
        Scanner scan=new Scanner(System.in);
        float num1,num2;
        char o;
        System.out.println("Enter first number then operator and then second number");
        System.out.println("eg :- 5 + 6");
        num1=scan.nextFloat();
        o=scan.next().charAt(0);
        num2= scan.nextFloat();


        float output=op.calculate(num1,o,num2);

        if(output!=-1){
            System.out.println(output);
        }
        else{
            System.out.println("Error!! Please enter valid input!!");
        }
    }
}
