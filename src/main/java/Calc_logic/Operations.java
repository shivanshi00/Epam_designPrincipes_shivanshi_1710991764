package Calc_logic;

public class Operations {
    float num1,num2,result;
    char o;
    Operations(){
        num1=0;
        num2=0;
        result=0;
    }
    public float calculate(float num1,char operator,float num2){

        switch (operator){
            case '+':
                return add(num1,num2);
            case '-':
                return subtract(num1,num2);
            case '*':
                return multiply(num1,num2);
            case '/':
                return divide(num1,num2);

        }

        return -1;

    }
    public float add(float a,float b){
        return a+b;
    }
    public float subtract(float a,float b){
        return a-b;
    }
    public float multiply(float a,float b){
        return a*b;
    }
    public float divide(float a,float b){
        return a/b;
    }

}
