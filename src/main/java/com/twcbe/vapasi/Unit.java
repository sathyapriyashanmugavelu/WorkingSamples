package com.twcbe.vapasi;

public enum Unit {
    CENTIMETER(1),METER(100);

    private final int conversionFactor;
    Unit(int conversionFactor){
        this.conversionFactor=conversionFactor;
    }

    int convert(int value){
        return value * conversionFactor;
    }


}
