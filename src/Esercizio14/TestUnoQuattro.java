package Esercizio14;

public class TestUnoQuattro {
    public static void main(String[] args) {
        RettangoloUnoTQuattro r1 = new RettangoloUnoTQuattro(19, 21);
        System.out.println(r1.getArea(r1.getBase(), r1.getAltezza()));
        String i = r1.getPoints();
        System.out.println(i);
        String r = r1.traslaStoRettangolo(-2, 22);
        System.out.println(r);
        RettangoloUnoTQuattro r2 = new RettangoloUnoTQuattro(20,20);

        System.out.println(r1.areIntersected(r2));



    }
}
