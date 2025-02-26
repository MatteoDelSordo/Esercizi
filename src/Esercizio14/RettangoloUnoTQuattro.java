package Esercizio14;

import Eserczio11.Rettangolo;

public class RettangoloUnoTQuattro {


    private double a, a1, b, b1, c, c1, d, d1;
    private double base, altezza, coordinatax1, coordinatax2, coordinatay1, coordinatay2;

    public RettangoloUnoTQuattro() {
    }

    public RettangoloUnoTQuattro(double altezza,
                                 double base) {
        this.altezza = altezza;
        this.base = base;
        this.coordinatax1 = 0;
        this.coordinatax2 = base * 2;
        this.coordinatay1 = 0;
        this.coordinatay2 = altezza * 2;
        a = coordinatax1 + base;
        b = coordinatax2;
        c = coordinatax2;
        d = coordinatax1 + base;
        a1 = coordinatay1 + altezza;
        b1 = coordinatay1 + altezza;
        c1 = coordinatay2;
        d1 = coordinatay2;

    }

    public RettangoloUnoTQuattro(double altezza,
                                 double base,
                                 double coordinatax1,
                                 double coordinatax2,
                                 double coordinatay1,
                                 double coordinatay2) {
        this.altezza = altezza;
        this.base = base;
        this.coordinatax1 = 0;
        this.coordinatax2 = base * 2;
        this.coordinatay1 = 0;
        this.coordinatay2 = altezza * 2;


    }


    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = coordinatay1 + altezza;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = coordinatax1 + base;
    }

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = coordinatay1 + altezza;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = coordinatax2;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = coordinatay2;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = coordinatax2;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = coordinatay2;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = coordinatax1 + base;
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

    public void setCoordinatax1(double coordinatax1) {

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

    public void setCoordinatay1(double coordinatay1) {
        this.coordinatay1 = coordinatay1;
    }

    public double getCoordinatay2() {

        return coordinatay2;
    }

    public void setCoordinatay2(double coordinatay2) {

        this.coordinatay2 = coordinatay2;
    }


    public String getPoints() {


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

        return "Le coordinate del purnto A sono: (" + a + "," + a1 + ") \n Le coordinate del punto B sono: (" + b +
                "," + b1 + ") \n Le coordinate del punto C sono: (" + c + "," + c1 + ") \n Le coordinate del punto D "
                + "sono: (" + d + "," + d1 + ")";


    }

    public boolean areIntersected(RettangoloUnoTQuattro rettangolo) {

        if (rettangolo.getD() <= this.getC()
                &&rettangolo.getC() >=this.getD()

                ) {
            return true;

        } else {
            return false;
        }
    }


}
