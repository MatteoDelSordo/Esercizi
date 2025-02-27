package Esercizio11;

public class RettangoloUnoUno {

    private int base;
    private int altezza;


    public RettangoloUnoUno() {
    }

    public RettangoloUnoUno(int altezza,
                            int base) {
        this.altezza = altezza;
        this.base = base;
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


    public int getArea(int base,
                       int altezza) {
        int area = base * altezza;
        return area;
    }

}
