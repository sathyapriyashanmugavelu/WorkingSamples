package com.twcbe.vapasi;

import java.util.Objects;

class Measurement {
    public final int size;
    private Unit unit;
    public static final String CENTIMETER = "cm";

    Measurement(int size, Unit unit) {
        this.size = size;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.equals("") || !(obj instanceof Measurement)) {
            return false;
        }

        Measurement that = (Measurement) obj;
        int thisConvertedSize = this.size;
        int thatConvertedSize = that.size;


        if (this.unit == that.unit) {
            return thisConvertedSize == thatConvertedSize;
        }
        if (this.unit == Unit.METER) {
            thisConvertedSize = this.size * 100;
        }
        if (that.unit == unit.METER) {
            thatConvertedSize = that.size * 100;
        }
        return thisConvertedSize == thatConvertedSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, unit);
    }

}




