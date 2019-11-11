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
    void shouldBeEqualWhenUnitsAndSizeAreSame() {
        Measurement oneCm = new Measurement(1, Unit.METER);
        Measurement twoCm = new Measurement(1, Unit.METER);
        assertEquals(oneCm, twoCm);
    }

    @Test
    void shouldBeNotEqualWhenUnitsAreInCmAndM() {
        Measurement oneCm = new Measurement(1, Unit.CENTIMETER);
        Measurement twoMeter = new Measurement(1, Unit.METER);
        boolean result = oneCm.equals(twoMeter);
        assertFalse(result);
    }

    @Test
    void shouldBeEqualWhenUnitsIs100CmAnd1m() {
        Measurement oneCm = new Measurement(100, Unit.CENTIMETER);
        Measurement twoMeter = new Measurement(1, Unit.METER);
        boolean result = oneCm.equals(twoMeter);
        assertTrue(result);
    }

    @Test
    void shouldBeNotEqualWhenValuesAre1MAnd2Cm() {
        Measurement oneCm = new Measurement(1, Unit.METER);
        Measurement twoMeter = new Measurement(2, Unit.CENTIMETER);
        boolean result = oneCm.equals(twoMeter);
        assertFalse(result);
    }

    @Test
    void shouldBeNotEqualWhenOneObjectIsEmpty() {
        Measurement oneM = new Measurement(1, Unit.METER);
        assertNotEquals(oneM, "");
    }

    @Test
    void shouldBeNotEqualWhenOneObjectNull() {
        Measurement oneM = new Measurement(1, Unit.METER);
        assertNotEquals(oneM, null);
    }

    @Test
    void shouldBeNotEqualWhenOneObjectIsDifferent() {
        Measurement oneM = new Measurement(1, Unit.METER);
        assertNotEquals(oneM, "hello");
    }

    @Test
    void shouldBeEqualWhenObjectsHashcodesAreSame() {
        Measurement oneM = new Measurement(1, Unit.METER);
        Measurement twoM = new Measurement(1, Unit.METER);
        assertEquals(oneM.hashCode(), twoM.hashCode());
    }

    @Test
    void shouldBeEqualWhenObjectsHashcodesAreNotSame() {
        Measurement oneCm = new Measurement(100, Unit.CENTIMETER);
        Measurement twoM = new Measurement(1, Unit.METER);
        assertEquals(oneCm.hashCode(), twoM.hashCode());
    }

    @Test
    void shouldAdditionBeEqualWhenUnitsAreSame() {
        Measurement oneCm = new Measurement(2, Unit.CENTIMETER);
        Measurement anotherCm = new Measurement(2, Unit.CENTIMETER);
        Measurement resultCm = new Measurement(4, Unit.CENTIMETER);
        assertEquals(resultCm, oneCm.add(anotherCm));
    }

    @Test
    void shouldAdditionBeEqualWhenUnitsAreDifferentWithCmAsFirstUnit() {
        Measurement oneCm = new Measurement(100, Unit.CENTIMETER);
        Measurement anotherM = new Measurement(1, Unit.METER);
        Measurement resultCm = new Measurement(200, Unit.CENTIMETER);
        assertEquals(resultCm, oneCm.add(anotherM));
    }

    @Test
    void shouldAdditionBeEqualWhenUnitsAreDifferentWithMAsFirstUnit() {
        Measurement oneM = new Measurement(1, Unit.METER);
        Measurement anotherCm = new Measurement(100, Unit.CENTIMETER);
        Measurement resultM = new Measurement(2, Unit.METER);
        assertEquals(resultM, oneM.add(anotherCm));
    }

    @Test
    void shouldAdditionBeEqualWhenUnitsAreDifferentWithKmAsFirstUnit() {
        Measurement oneKm = new Measurement(1, Unit.KILOMETER);
        Measurement anotherCm = new Measurement(1000, Unit.CENTIMETER);
        Measurement resultKm = new Measurement(2, Unit.KILOMETER);
        assertEquals(resultKm, oneKm.add(anotherCm));
    }
}
