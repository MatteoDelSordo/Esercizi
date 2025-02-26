package Esercizio12;

public class TestRettangoloUnoDue {
    public static void main(String[] args) {
        RettangoloUnoDue r1 = new RettangoloUnoDue(10, 9);
        System.out.println(r1.getArea(r1.getBase(), r1.getAltezza()));
        System.out.println(r1.getPoints());
    }


}
