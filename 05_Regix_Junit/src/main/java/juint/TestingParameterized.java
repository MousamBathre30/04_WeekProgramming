package juint;

public class TestingParameterized {

    public static boolean isEven(int n){
        return n%2==0|| n % 2 == 1;
    }
    public static void main(String[] args) {
        System.out.println(isEven(4));
    }
}
