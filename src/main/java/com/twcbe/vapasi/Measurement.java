package com.twcbe.vapasi;

class Measurement {
    private int size;
    private Unit unit;
    public static final String CENTIMETER = "cm";

    Measurement(int size, Unit unit) {
        this.size = size;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        Measurement that = (Measurement) obj;
        if (that.unit == this.unit) {
            if (that.size == this.size) {
                return true;
            }
        }
        return false;
    }

}




