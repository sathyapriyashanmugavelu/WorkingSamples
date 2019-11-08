package com.twcbe.vapasi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MeasurementTest {
    @Test
    void shouldBeEqualWhenSizesAre1cmAnd1cm() {
        Measurement firstInput=new Measurement(1,"cm");
        Measurement secondInput=new Measurement(1,"cm");
        boolean result= firstInput.equality(secondInput);
        assertTrue(result);
    }
}
