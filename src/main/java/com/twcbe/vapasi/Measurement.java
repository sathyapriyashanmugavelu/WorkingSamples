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
        int thisConvertedSize = this.size;
        int thatConvertedSize = that.size;

        if(this.unit == that.unit){
            return thisConvertedSize == thatConvertedSize;
        }
        if(this.unit == Unit.METER){
            thisConvertedSize = this.size * 100;
        }
        if(that.unit == unit.METER){
            thatConvertedSize = that.size * 100;
        }
        return thisConvertedSize == thatConvertedSize;
    }

}




