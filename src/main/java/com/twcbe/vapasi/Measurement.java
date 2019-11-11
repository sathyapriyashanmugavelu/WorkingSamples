package com.twcbe.vapasi;

class Measurement {

    public final int magnitude;
    private final Unit unit;

    Measurement(int magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Measurement)) {
            return false;
        }
        Measurement that = (Measurement) obj;
        return that.toCentimeter() == this.toCentimeter();
    }

    @Override
    public int hashCode() {
        int thisValue = this.magnitude;
        if (this.unit == Unit.METER) {
            return toCentimeter();
        }
        return thisValue;
    }

    public int toCentimeter() {
        return unit.convert(magnitude);
    }

    public Measurement add(Measurement anotherCm) {
        Measurement result;
        if (equals(anotherCm)) {
            int addResult = this.magnitude + toCentimeter();
            if (this.unit != Unit.CENTIMETER) {
                return new Measurement(this.magnitude + unit.convertToAnyUnit(anotherCm.magnitude), this.unit);
            }
            return new Measurement(addResult, this.unit);
        }
        return new Measurement(0, Unit.CENTIMETER);
    }
}




