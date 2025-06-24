package org.example;

public class TemperatureConverter {

    public static double cToF(double c) {
        return c * 9.0/5.0 + 32.0;
    }

    public static double cToK(double c) {
        return c + 273.15;
    }

    public static double fToC(double f) {
        return (f - 32.0) * 5.0/9.0;
    }

    public static double fToK(double f) {
        return (f - 32.0) * 5.0/9.0 + 273.15;
    }

    public static double kToC(double k) {
        return k - 273.15;
    }

    public static double kToF(double k) {
        return (k - 273.15) * 9.0/5.0 + 32.0;
    }


}
