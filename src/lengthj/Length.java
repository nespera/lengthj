package lengthj;

public class Length {

    private final LengthUnit unit;
    private final Double magnitude;

    public Length(Double magnitude, LengthUnit unit) {
        if (unit == null || magnitude == null) {
            throw new LengthException("Cannot construct with null arguments");
        }
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return String.format("%.2f", magnitude) + " " + unit.toString();
    }

    public Length to(LengthUnit newUnit) {
        if (newUnit == null) {
            throw new LengthException("Cannot convert with null unit");
        }
        return newUnit == unit ? this : new Length(convert(newUnit), newUnit);
    }

    private Double convert(LengthUnit newUnit) {
        return (magnitude*unit.inMillimetres())/newUnit.inMillimetres();
    }

}
