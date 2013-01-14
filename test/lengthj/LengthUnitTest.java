package lengthj;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthUnitTest {
    
    @Test
    public void unitsDisplayNicely() {
        assertEquals("yd", LengthUnit.YARD.toString());
        assertEquals("m", LengthUnit.METRE.toString());
        assertEquals("in", LengthUnit.INCH.toString());
    }
    
}
