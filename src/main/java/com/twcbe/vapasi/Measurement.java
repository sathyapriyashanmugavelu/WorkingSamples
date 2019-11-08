package com.twcbe.vapasi;

import java.util.Objects;

class Measurement {

    public final int magnitude;
    private final Unit unit;
    public static final int centimeterConstant =100;

    Measurement(int magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if(!(obj instanceof Measurement)) {
            return false;
        }
        Measurement that = (Measurement) obj;
        return that.toCentimeter() == this.toCentimeter();

    }


    @Override
    public int hashCode() {
        int thisValue = this.magnitude;
        if (this.unit == Unit.METER)
        {
            return toCentimeter();
        }
        return thisValue;
    }


    public int toCentimeter(){
        return unit.convert(magnitude);
    }

}




