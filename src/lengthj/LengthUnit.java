package lengthj;

public enum LengthUnit {
    YARD("yd", 9140),
    METRE("m", 10000),
    INCH("in", 254);

    private final String display;
    private int millimetres;

    LengthUnit(String display, int millimetres) {
        this.display = display;
        this.millimetres = millimetres;
    }

    @Override
    public String toString() {
        return display;
    }

    public int inMillimetres() {
        return millimetres;
    }
}
