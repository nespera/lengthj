package lengthj;

public enum LengthUnit {
    YARD("yd"),
    METRE("m"),
    INCH("in");

    private String display;

    LengthUnit(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return display;
    }
}
