package Esercizio12;


public class RettangoloUnoDue {


    private int base, altezza, coordinatax1, coordinatax2, coordinatay1, coordinatay2;


    public RettangoloUnoDue() {
    }

    public RettangoloUnoDue(int altezza,
                            int base) {
        this.altezza = altezza;
        this.base = base;
    }

    public RettangoloUnoDue(int altezza,
                            int base,
                            int coordinatax1,
                            int coordinatax2,
                            int coordinatay1,
                            int coordinatay2) {
        this.altezza = altezza;
        this.base = base;
        this.coordinatax1 = 0;
        this.coordinatax2 = coordinatax2;
        this.coordinatay1 = 0;
        this.coordinatay2 = coordinatay2;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getCoordinatax1() {
        return coordinatax1;
    }

    private void setCoordinatax1(int coordinatax1) {
        this.coordinatax1 = coordinatax1;
    }

    public int getCoordinatax2() {
        return coordinatax2;
    }

    public void setCoordinatax2(int coordinatax2) {
        this.coordinatax2 = coordinatax2;
    }

    public int getCoordinatay1() {
        return coordinatay1;
    }

    private void setCoordinatay1(int coordinatay1) {
        this.coordinatay1 = coordinatay1;
    }

    public int getCoordinatay2() {
        return coordinatay2;
    }

    public void setCoordinatay2(int coordinatay2) {
        this.coordinatay2 = coordinatay2;
    }


    public String getPoints() {
        coordinatax2 = base * 2;
        coordinatay2 = altezza * 2;
        int a, a1, b, b1, c, c1, d, d1;
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


    public int getArea(int base,
                       int altezza) {
        int area = base * altezza;
        return area;
    }


}
