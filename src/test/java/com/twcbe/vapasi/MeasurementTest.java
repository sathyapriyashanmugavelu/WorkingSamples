package com.twcbe.vapasi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MeasurementTest {

    @Test
    void shouldBeEqualWhenSizesAre1cmAnd1cm() {
        Measurement firstInput=new Measurement(1, Unit.CENTIMETER);
        Measurement secondInput=new Measurement(1, Unit.CENTIMETER);
        assertEquals(firstInput, secondInput);
    }

    @Test
    void shouldBeNotEqualWhenSizesAre1cmAnd2cm() {
        Measurement firstInput=new Measurement(1, Unit.CENTIMETER);
        Measurement secondInput=new Measurement(2, Unit.CENTIMETER);
        boolean result = firstInput.equals(secondInput);
        assertFalse(result);
    }

    @Test
    void shouldBeEqualWhenUnitsAreInCm() {
        Measurement firstInput=new Measurement(1, Unit.CENTIMETER);
        Measurement secondInput=new Measurement(1, Unit.CENTIMETER);
        assertEquals(firstInput, secondInput);
    }
}
