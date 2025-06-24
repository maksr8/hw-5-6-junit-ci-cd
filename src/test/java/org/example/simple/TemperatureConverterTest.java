package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("fast")
public class TemperatureConverterTest {

    @Tag("celsius")
    @Test
    void givenZeroCelsius_whenConvertToFahrenheit_thenReturns32() {
        double celsius = 0.0;
        double expectedFahrenheit = 32.0;
        double actualFahrenheit = TemperatureConverter.cToF(celsius);
        assertEquals(expectedFahrenheit, actualFahrenheit, 1e-6);
    }

    @Tag("celsius")
    @Test
    void givenZeroCelsius_whenConvertToKelvin_thenReturns273Point15() {
        double celsius = 0.0;
        double expectedKelvin = 273.15;
        double actualKelvin = TemperatureConverter.cToK(celsius);
        assertEquals(expectedKelvin, actualKelvin, 1e-6);
    }

    @Tag("fahrenheit")
    @Test
    void givenZeroFahrenheit_whenConvertToCelsius_thenReturnsMinus17Point78() {
        double fahrenheit = 0.0;
        double expectedCelsius = -17.77777777777778;
        double actualCelsius = TemperatureConverter.fToC(fahrenheit);
        assertEquals(expectedCelsius, actualCelsius, 1e-6);
    }

    @Tag("fahrenheit")
    @Test
    void givenZeroFahrenheit_whenConvertToKelvin_thenReturns255Point37() {
        double fahrenheit = 0.0;
        double expectedKelvin = 255.37222222222223;
        double actualKelvin = TemperatureConverter.fToK(fahrenheit);
        assertEquals(expectedKelvin, actualKelvin, 1e-6);
    }

    @Tag("kelvin")
    @Test
    void givenZeroKelvin_whenConvertToCelsius_thenReturnsMinus273Point15() {
        double kelvin = 0.0;
        double expectedCelsius = -273.15;
        double actualCelsius = TemperatureConverter.kToC(kelvin);
        assertEquals(expectedCelsius, actualCelsius, 1e-6);
    }

    @Tag("kelvin")
    @Test
    void givenZeroKelvin_whenConvertToFahrenheit_thenReturnsMinus459Point67() {
        double kelvin = 0.0;
        double expectedFahrenheit = -459.66999999999996;
        double actualFahrenheit = TemperatureConverter.kToF(kelvin);
        assertEquals(expectedFahrenheit, actualFahrenheit, 1e-6);
    }
}
