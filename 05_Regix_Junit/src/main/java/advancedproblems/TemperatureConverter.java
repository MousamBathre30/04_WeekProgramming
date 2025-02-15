package advancedproblems;

public class TemperatureConverter {
    public static void main(String[] args) {
        int temp = 20;
        System.out.println(celsiusToFahrenheit(temp));
        System.out.println(fahrenheitToCelsius(temp));
    }

    public static int fahrenheitToCelsius(int temp) {
        return (temp - 32)*5/9;
    }

    public static int celsiusToFahrenheit(int temp) {
      return (temp + 32)*9/5;
    }
}
