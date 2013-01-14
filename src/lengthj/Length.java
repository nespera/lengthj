package lengthj;

public class Length {

    private final LengthUnit unit;
    private final Double magnitude;

    public Length(Double magnitude, LengthUnit unit) {
        if (unit == null || magnitude == null) {
            throw new RuntimeException("Cannot construct with null arguments");
        }
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return magnitude.toString() + " " + unit.toString();
    }
}
