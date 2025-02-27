package EsercizioRettangolo;

public class DemoMainRettangolo {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(25, 10);
        Rettangolo r2 = new Rettangolo(20, 9);
        System.out.println(r1.getIntersectedArea(r1, r2));
//            System.out.println(r1.getArea());
//            String i = r1.getPoints();
//            System.out.println(i);
//            String r = r1.traslaStoRettangolo(-2, 22);
//            System.out.println(r);
//            System.out.println(r1.areIntersected(r2));
//            r2.areIntersected(r1);
//            System.out.println(r1.getIntersectedAreaCheNonFunziona(r1, r2));


    }
}
