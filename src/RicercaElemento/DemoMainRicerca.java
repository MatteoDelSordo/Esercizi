package RicercaElemento;

import java.util.ArrayList;

public class DemoMainRicerca {
    public static void main(String[] args) {
        RicercaConArray f = new RicercaConArray();
        int[] a = {4, 6, 10, 123, 4123};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(10);
        list.add(123);
        list.add(4123);
//        f.getIndexTrova(a, 6);
//        System.out.println("----prossimo metodo----");
//        System.out.println(f.getIndexTrovaV2(a, 123));
//        System.out.println("----prossimo metodo----");
//        f.getIndexTrova(a, 6);
        System.out.println("----prossimo metodo----");
        System.out.println(f.getIndexConList(list,10));

    }
}
