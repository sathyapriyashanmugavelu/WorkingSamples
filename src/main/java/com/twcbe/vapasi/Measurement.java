package com.twcbe.vapasi;

class Measurement {
    private int size;
    private String unit;

    Measurement(int size,String unit){
        this.size=size;
        this.unit=unit;
    }

    @Override
    public boolean equals(Object obj) {
        Measurement that=(Measurement) obj;
        return that.size == this.size;
    }

}




