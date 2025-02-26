package Esercizio13;

public class RettangoloUnoTre {


    private double base, altezza, coordinatax1, coordinatax2, coordinatay1, coordinatay2;


    public RettangoloUnoTre() {
    }

    public RettangoloUnoTre(double altezza,
                            double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public RettangoloUnoTre(double altezza,
                            double base,
                            double coordinatax1,
                            double coordinatax2,
                            double coordinatay1,
                            double coordinatay2) {
        this.altezza = altezza;
        this.base = base;
        this.coordinatax1 = 0;
        this.coordinatax2 = coordinatax2;
        this.coordinatay1 = 0;
        this.coordinatay2 = coordinatay2;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getCoordinatax1() {
        return coordinatax1;
    }

    private void setCoordinatax1(double coordinatax1) {
        this.coordinatax1 = coordinatax1;
    }

    public double getCoordinatax2() {
        return coordinatax2;
    }

    public void setCoordinatax2(double coordinatax2) {
        this.coordinatax2 = coordinatax2;
    }

    public double getCoordinatay1() {
        return coordinatay1;
    }

    private void setCoordinatay1(double coordinatay1) {
        this.coordinatay1 = coordinatay1;
    }

    public double getCoordinatay2() {
        return coordinatay2;
    }

    public void setCoordinatay2(double coordinatay2) {
        this.coordinatay2 = coordinatay2;
    }


    public String getPoints() {
        double a, a1, b, b1, c, c1, d, d1;
        coordinatax2 = base * 2;
        coordinatay2 = altezza * 2;
        a = coordinatax1 + base;
        b = coordinatax2;
        c = coordinatax2;
        d = coordinatax1 + base;
        a1 = coordinatay1 + altezza;
        b1 = coordinatay1 + altezza;
        c1 = coordinatay2;
        d1 = coordinatay2;
        return "Le coordinate del purnto A sono: (" + a + "," + a1 + ") \n Le coordinate del punto B sono: (" + b +
                "," + b1 + ") \n Le coordinate del punto C sono: (" + c + "," + c1 + ") \n Le coordinate del punto D "
                + "sono: (" + d + "," + d1 + ")";
    }


    public double getArea(double base,
                          double altezza) {
        double area = base * altezza;
        return area;
    }

    public String traslaStoRettangolo(double x,
                                      double y) {
        double a, a1, b, b1, c, c1, d, d1;
        coordinatax2 = base * 2;
        coordinatay2 = altezza * 2;
        a = coordinatax1 + base + x;
        b = coordinatax2 + x;
        c = coordinatax2 + x;
        d = coordinatax1 + base + x;
        a1 = coordinatay1 + altezza + y;
        b1 = coordinatay1 + altezza + y;
        c1 = coordinatay2 + y;
        d1 = coordinatay2 + y;
        return "Le coordinate del purnto A sono: (" + a + "," + a1 + ") \n Le coordinate del punto B sono: (" + b +
                "," + b1 + ") \n Le coordinate del punto C sono: (" + c + "," + c1 + ") \n Le coordinate del punto D "
                + "sono: (" + d + "," + d1 + ")";


    }


}
