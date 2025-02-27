package Esercizio14;

public class TestUnoQuattro {
    public static void main(String[] args) {
//        RettangoloUnoCinque r1 = new RettangoloUnoCinque(20, 20);
//        System.out.println(r1.getArea(r1.getBase(), r1.getAltezza()));
//        String i = r1.getPoints();
//        System.out.println(i);
//        String r = r1.traslaStoRettangolo(-2, 22);
//        System.out.println(r);
//        RettangoloUnoCinque r2 = new RettangoloUnoCinque(20, 20);
//        /System.out.println(r1.areIntersected(r2));
//        r2.areIntersected(r1);
//        r1.getIntersectedArea(r1, r2);
        RettangoloUnoQuattro r1 = new RettangoloUnoQuattro(10, 20, 0, 30, 0, 20);
        RettangoloUnoQuattro r2 = new RettangoloUnoQuattro(10, 20, 0, 30, 0, 20);
        System.out.println(r1.getArea());
        System.out.println(r1.getPoints());
        System.out.println( r1.getIntersectedArea(r1, r2));
        System.out.println(r1.calcolaIntersezione(r2));

    }
}
