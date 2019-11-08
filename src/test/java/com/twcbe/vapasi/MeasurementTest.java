package com.twcbe.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MeasurementTest {

    @Test
    void shouldBeEqualWhenSizesAre1cmAnd1cm() {
        Measurement oneCm = new Measurement(1, Unit.CENTIMETER);
        Measurement twoCm = new Measurement(1, Unit.CENTIMETER);
        assertEquals(oneCm, twoCm);
    }

    @Test
    void shouldBeNotEqualWhenSizesAre1cmAnd2cm() {
        Measurement oneCm = new Measurement(1, Unit.CENTIMETER);
        Measurement twoCm = new Measurement(2, Unit.CENTIMETER);
        boolean result = oneCm.equals(twoCm);
        assertFalse(result);
    }

    @Test
    void shouldBeEqualWhenUnitsAreInCm() {
        Measurement oneCm = new Measurement(1, Unit.CENTIMETER);
        Measurement twoCm = new Measurement(1, Unit.CENTIMETER);
        assertEquals(oneCm, twoCm);
    }

    @Test
    void shouldBeNotEqualWhenUnitsAreInCmAndM() {
        Measurement oneCm = new Measurement(1, Unit.CENTIMETER);
        Measurement twoMeter = new Measurement(1, Unit.METER);
        boolean result = oneCm.equals(twoMeter);
        assertFalse(result);
    }
}
