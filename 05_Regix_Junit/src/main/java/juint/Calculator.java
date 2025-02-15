package juint;

public class Calculator {

    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a , int b){
        return a-b;
    }
    public int divide(int a , int b){
        return a/b;

    }
    public boolean isEven(int a){
        return a%2==0;
    }

    public static void main(String[] args) {
        int a = 9;;
        int b = 3;
        Calculator cac = new Calculator();
        System.out.println(cac.add(a,b));
        System.out.println(cac.divide(a,b));
        System.out.println(cac.subtract(a,b));



    }
}
