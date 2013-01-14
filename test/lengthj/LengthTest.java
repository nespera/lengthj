package lengthj;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthTest {

    @Test(expected = LengthException.class)
    public void cannotCreateLengthWithNullUnit() {
        new Length(1.1, null);
    }

    @Test(expected = LengthException.class)
    public void cannotCreateLengthWithNullMagnitude() {
        new Length(null, LengthUnit.INCH);
    }

    @Test
    public void lengthsDisplayNicely() {
        assertEquals("0.50 m", new Length(0.5, LengthUnit.METRE).toString());
    }
    
    @Test
    public void convertingALengthToSameUnitGivesIdenticalLength() {
        Length length = new Length(87.0, LengthUnit.YARD);
        assertEquals(length.toString(), length.to(LengthUnit.YARD).toString());
    }

    @Test
    public void convertingALengthToAnotherUnitWorksAsExpected() {
        Length length = new Length(1.5, LengthUnit.METRE);
        assertEquals("59.06 in", length.to(LengthUnit.INCH).toString());
        assertEquals("1.64 yd", length.to(LengthUnit.YARD).toString());
    }

    @Test(expected = LengthException.class)
    public void cannotConvertToNullUnit() {
        new Length(78.7, LengthUnit.INCH).to(null);
    }

}
