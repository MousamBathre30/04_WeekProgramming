package advancedproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void testFahrenheitToCelsius(){
        assertEquals(-6,TemperatureConverter.fahrenheitToCelsius(20));
    }

    @Test
    void testCelsiusToFahrenheit(){
        assertEquals(93,TemperatureConverter.celsiusToFahrenheit(20));
    }
}