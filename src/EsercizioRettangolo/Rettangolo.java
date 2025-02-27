package EsercizioRettangolo;

import java.awt.geom.Rectangle2D;

public class Rettangolo {
    /// Ogni lettera corrisponde a un vertice del rettangolo, la lettera singola è per le coordinate di x e quella
    /// numerata per le coordinate di y
    /// Se un rettangolo ha come valori base 10 e altezza 5 risultera cosi
    ///
    ///  D (0,5) ------------------------- C (10,5)
    ///     |                                   |
    ///     |                                   |
    ///     |                                   |
    ///     |                                   |
    ///  A (10,0)  ------------------------- B (0,10)
    ///

    private double a, a1, b, b1, c, c1, d, d1;
    private double base, altezza, coordinatax1, coordinatax2, coordinatay1, coordinatay2;

    public Rettangolo() {
    }

    /// Nell esercizio non era richiesto di passare anche le coordinate quindi le assegno nel costruttore che uso per
    ///  il rettangolo
    public Rettangolo(double altezza,
                      double base) {
        this.altezza = altezza;
        this.base = base;
        this.coordinatax1 = 0;
        this.coordinatax2 = coordinatax1 + this.base;
        this.coordinatay1 = 0;
        this.coordinatay2 = coordinatay1 + this.altezza;
        a = coordinatax1;
        b = coordinatax2;
        c = coordinatax2;
        d = coordinatax1;
        a1 = coordinatay1;
        b1 = coordinatay1;
        c1 = coordinatay2;
        d1 = coordinatay2;

    }

/// Getter e Setter
    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
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

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }


    /// Questo metodo serve per prendere le coordinate di ogni vertice
    public String getPoints() {


        return "Le coordinate del purnto A sono: (" + a + "," + a1 + ") \n Le coordinate del punto B sono: (" + b +
                "," + b1 + ") \n Le coordinate del punto C sono: (" + c + "," + c1 + ") \n Le coordinate del punto D "
                + "sono: (" + d + "," + d1 + ")";
    }

/// Cacolo dell area
    public double getArea() {

        return this.base * this.altezza;
    }

    public String traslaStoRettangolo(double x,
                                      double y) {

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
/// Metodo per controllare se i rettangoli sono intersecati
    public boolean areIntersected(Rettangolo rettangolo) {

        if (this.getA() <= rettangolo.getB()
                && this.getB() >= rettangolo.getA()
                && this.getA1() <= rettangolo.getC1()
                && this.getC1() >= rettangolo.getA1()) {
//            System.out.println("I rettanoli si interescano");
            return true;

        }
//        System.out.println("I rettangolo non si intersecano");
        return false;

    }

    /// Qui sotto ci sono i metodi per calcolare l'area del rettangolo
    /// che si crea dall intersecazione dei due rettangoli




    /// Questo è quello che funziona
    public double getIntersectedArea(Rettangolo r1,
                                     Rettangolo r2) {
        double r1_x = r1.getD();
        double r1_y = Math.min(r1.getA1(), r1.getC1()); // Prendiamo la y minore per ottenere la parte superiore
        double r1_width = r1.getBase();
        double r1_height = Math.abs(r1.getC1() - r1.getA1()); // Altezza calcolata correttamente

        double r2_x = r2.getD();
        double r2_y = Math.min(r2.getA1(), r2.getC1());
        double r2_width = r2.getBase();
        double r2_height = Math.abs(r2.getC1() - r2.getA1());

        Rectangle2D.Double rect1 = new Rectangle2D.Double(r1_x, r1_y, r1_width, r1_height);
        Rectangle2D.Double rect2 = new Rectangle2D.Double(r2_x, r2_y, r2_width, r2_height);

        Rectangle2D rect3 = rect1.createIntersection(rect2);
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);

        if (!rect3.isEmpty()) {
            return rect3.getWidth() * rect3.getHeight();
        }

        return -1;
    }

    /// questo è quello con il metodo di Rectangle2D che NON funziona
    public double getIntersectedAreaCheNonFunziona(Rettangolo r1,
                                                   Rettangolo r2) {
        Rectangle2D.Double rect1 = new Rectangle2D.Double(r1.getD(), r1.getD1(), r1.getBase(), r1.getAltezza());
        Rectangle2D.Double rect2 = new Rectangle2D.Double(r2.getD(), r2.getD1(), r2.getBase(), r2.getAltezza());
        System.out.println(rect1);
        System.out.println(rect2);
        Rectangle2D rect3 = rect1.createIntersection(rect2);
//        rect3.setFrame(rect3.getX(), rect3.getY(), rect3.getWidth(), rect3.getHeight());
        System.out.println(rect3.getHeight());
        System.out.println(rect3.getY());
        if (!rect3.isEmpty()) {
            return rect3.getWidth() * rect3.getHeight();
        }


        return -1;
    }


}
