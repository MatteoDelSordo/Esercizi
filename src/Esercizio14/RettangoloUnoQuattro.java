package Esercizio14;

import java.awt.geom.Rectangle2D;

public class RettangoloUnoQuattro {


    private double aX, aY, bX, bY, cX, cY, dX, dY;
    private double base, altezza, coordinatax1, coordinatax2, coordinatay1, coordinatay2;

    public RettangoloUnoQuattro() {
    }

    public RettangoloUnoQuattro(double altezza,
                                double base) {
        this.altezza = altezza;
        this.base = base;
        this.coordinatax1 = coordinatax1;
        this.coordinatax2 = coordinatax2;
        this.coordinatay1 = coordinatay1;
        this.coordinatay2 = coordinatay2;
        aX = coordinatax1;
        bX = coordinatax2;
        cX = coordinatax2;
        dX = coordinatax1;
        aY = coordinatay1;
        bY = coordinatay1;
        cY = coordinatay2;
        dY = coordinatay2;

    }

    public RettangoloUnoQuattro(double altezza,
                                double base,
                                double coordinatax1,
                                double coordinatax2,
                                double coordinatay1,
                                double coordinatay2) {
        this.altezza = altezza;
        this.base = base;
        this.coordinatax1 = coordinatax1;
        this.coordinatax2 = coordinatax1 + this.base;
        this.coordinatay1 = coordinatay1;
        this.coordinatay2 = coordinatay1 + this.altezza;
        aX = coordinatax1;
        bX = coordinatax2;
        cX = coordinatax2;
        dX = coordinatax1;
        aY = coordinatay1;
        bY = coordinatay1;
        cY = coordinatay2;
        dY = coordinatay2;


    }


    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getaX() {
        return aX;
    }

    public void setaX(double aX) {
        this.aX = aX;
    }

    public double getaY() {
        return aY;
    }

    public void setaY(double aY) {
        this.aY = aY;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getbX() {
        return bX;
    }

    public void setbX(double bX) {
        this.bX = bX;
    }

    public double getbY() {
        return bY;
    }

    public void setbY(double bY) {
        this.bY = bY;
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

    public double getcX() {
        return cX;
    }

    public void setcX(double cX) {
        this.cX = cX;
    }

    public double getcY() {
        return cY;
    }

    public void setcY(double cY) {
        this.cY = cY;
    }

    public double getdX() {
        return dX;
    }

    public void setdX(double dX) {
        this.dX = dX;
    }

    public double getdY() {
        return dY;
    }

    public void setdY(double dY) {
        this.dY = dY;
    }

    public String getPoints() {


        return "Le coordinate del purnto A sono: (" + aX + "," + aY + ") \n Le coordinate del punto B sono: (" + bX + "," + bY + ") \n Le coordinate del punto C sono: (" + cX + "," + cY + ") \n Le coordinate del punto D " + "sono: (" + dX + "," + dY + ")";
    }


    public double getArea() {

        double area = this.base * this.altezza;
        return area;
    }

    public String traslaStoRettangolo(double x,
                                      double y) {
        this.coordinatax1 += x;
        this.coordinatax2 += x;
        this.coordinatay1 += y;
        this.coordinatay2 += y;

        return "Le coordinate del purnto A sono: (" + aX + "," + aY + ") \n Le coordinate del punto B sono: (" + bX + "," + bY + ") \n Le coordinate del punto C sono: (" + cX + "," + cY + ") \n Le coordinate del punto D " + "sono: (" + dX + "," + dY + ")";


    }

    public boolean areIntersected(RettangoloUnoQuattro rettangolo) {

        if (this.getaX() <= rettangolo.getbX() && this.getbX() >= rettangolo.getaX() && this.getaY() <= rettangolo.getcY() && this.getcY() >= rettangolo.getaY()) {

            return true;
        }

        return false;

    }


    public double getIntersectedArea(RettangoloUnoQuattro r1,
                                     RettangoloUnoQuattro r2) {

        Rectangle2D rect1 = new Rectangle2D.Double(r1.dX, r1.dY - r1.altezza, r1.base, r1.altezza);
        Rectangle2D rect2 = new Rectangle2D.Double(r2.dX, r2.dY - r2.altezza, r2.base, r2.altezza);
        System.out.println(rect1);
        System.out.println(rect2);
        Rectangle2D intersezione = rect1.createIntersection(rect2);
        // boolean appoggio = rect1.intersects(rect2);
//            if (intersezione.getWidth() == 0 && intersezione.getHeight() == 0) {
//                System.out.println("L'area dell'intersezione è uguale a 0");
//
//            } else if (intersezione.getWidth() > 0 && intersezione.getHeight() > 0) {
//                System.out.println(intersezione.getWidth());
//                System.out.println(intersezione.getHeight());
//
//                System.out.println("L'area dell intersezione è: " + (intersezione.getWidth() * intersezione
//                .getHeight()));
//            } else {
//                System.out.println("-1");
//            }
        if (!intersezione.isEmpty()) {
            double areaIntersezione = intersezione.getWidth() * intersezione.getHeight();
            return areaIntersezione;
        } else {
            return -1;
        }

    }

    public double calcolaIntersezione(RettangoloUnoQuattro altro) {
        // Calcoliamo i limiti della sovrapposizione
        double xMin = Math.max(this.aX, altro.aX);
        double yMin = Math.max(this.aY, altro.aY);
        double xMax = Math.min(this.cX, altro.cX);
        double yMax = Math.min(this.cY, altro.cY);

        // Verifica se c'è intersezione
        double base = xMax - xMin;
        double altezza = yMax - yMin;

        // Se non c'è intersezione, l'area è 0
        if (base <= 0 || altezza <= 0) {
            return 0;
        }

        return base * altezza;
    }

}

