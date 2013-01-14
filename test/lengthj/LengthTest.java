package lengthj;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthTest {

    @Test(expected = Throwable.class)
    public void cannotCreateLengthWithNullUnit() {
        new Length(1.1, null);
    }

    @Test(expected = Throwable.class)
    public void cannotCreateLengthWithNullMagnitude() {
        new Length(null, LengthUnit.INCH);
    }

    @Test
    public void lengthsDisplayNicely() {
        assertEquals("0.5 m", new Length(0.5, LengthUnit.METRE).toString());
    }
}
