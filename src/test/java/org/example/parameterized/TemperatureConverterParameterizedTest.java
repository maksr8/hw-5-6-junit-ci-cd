package org.example.parameterized;

import org.example.TemperatureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("parameterized")
public class TemperatureConverterParameterizedTest {

    @Tag("celsius")
    @ParameterizedTest(name = "given {0}°C when cToF then {1}°F")
    @CsvSource({
            "0.0,    32.0",
            "100.0,  212.0",
            "-40.0, -40.0"
    })
    void givenCelsius_whenConvertToFahrenheit_thenReturnsExpected(double celsius, double expectedF) {
        Assertions.assertEquals(expectedF, TemperatureConverter.cToF(celsius), 1e-6);
    }

    @Tag("celsius")
    @ParameterizedTest(name = "given {0}°C when cToK then {1}K")
    @CsvSource({
            "0.0,    273.15",
            "100.0,  373.15",
            "-273.15, 0.0"
    })
    void givenCelsius_whenConvertToKelvin_thenReturnsExpected(double celsius, double expectedK) {
        assertEquals(expectedK, TemperatureConverter.cToK(celsius), 1e-6);
    }

    @Tag("fahrenheit")
    @ParameterizedTest(name = "given {0}°F when fToC then {1}°C")
    @CsvSource({
            "32.0,   0.0",
            "212.0, 100.0",
            "-40.0, -40.0"
    })
    void givenFahrenheit_whenConvertToCelsius_thenReturnsExpected(double fahrenheit, double expectedC) {
        assertEquals(expectedC, TemperatureConverter.fToC(fahrenheit), 1e-6);
    }

    @Tag("fahrenheit")
    @ParameterizedTest(name = "given {0}°F when fToK then {1}K")
    @CsvSource({
            "32.0,   273.15",
            "212.0, 373.15",
            "-40.0, 233.15"
    })
    void givenFahrenheit_whenConvertToKelvin_thenReturnsExpected(double fahrenheit, double expectedK) {
        assertEquals(expectedK, TemperatureConverter.fToK(fahrenheit), 1e-6);
    }

    @Tag("kelvin")
    @ParameterizedTest(name = "given {0}K when kToC then {1}°C")
    @CsvSource({
            "273.15, 0.0",
            "373.15, 100.0",
            "0.0,   -273.15",
            "-273.15, -546.3"
    })
    void givenKelvin_whenConvertToCelsius_thenReturnsExpected(double kelvin, double expectedC) {
        Assumptions.assumeTrue(kelvin >= 0.0, () -> "Skipping invalid Kelvin: " + kelvin);
        assertEquals(expectedC, TemperatureConverter.kToC(kelvin), 1e-6);
    }

    @Tag("kelvin")
    @ParameterizedTest(name = "given {0}K when kToF then {1}°F")
    @CsvSource({
            "273.15, 32.0",
            "373.15, 212.0",
            "0.0,   -459.67",
            "-273.15, -459.67"
    })
    void givenKelvin_whenConvertToFahrenheit_thenReturnsExpected(double kelvin, double expectedF) {
        Assumptions.assumeTrue(kelvin >= 0.0, () -> "Skipping invalid Kelvin: " + kelvin);
        assertEquals(expectedF, TemperatureConverter.kToF(kelvin), 1e-6);
    }
}
