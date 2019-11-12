package com.twcbe.vapasi;

public enum Unit {
    CENTIMETER(1), METER(100), KILOMETER(100000);

    private final int conversionFactor;
    int resultValue;

    Unit(int conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    int convert(int value) {
        resultValue = value * conversionFactor;
        return resultValue;
    }

    int convertToAnyUnit(int resultValue) {
        return resultValue / conversionFactor;
    }
}
