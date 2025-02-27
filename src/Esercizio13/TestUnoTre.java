package Esercizio13;

import Esercizio13.RettangoloUnoTre;

public class TestUnoTre {
    public static void main(String[] args) {
        RettangoloUnoTre r1 = new RettangoloUnoTre(19, 21);
        System.out.println(r1.getArea(r1.getBase(), r1.getAltezza()));
        String i = r1.getPoints();
        System.out.println(i);
        String r = r1.traslaStoRettangolo(-2, 22);
        System.out.println(r);
    }
}
