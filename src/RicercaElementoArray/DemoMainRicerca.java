package RicercaElementoArray;

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
        System.out.println(f.getIndexTrova(a, 4));
        System.out.println(f.getIndexTrova(a, 6));
        System.out.println(f.getIndexTrova(a, 10));
        System.out.println(f.getIndexTrova(a, 123));
        System.out.println(f.getIndexTrova(a, 4123));
        System.out.println(f.getIndexTrova(a, 41233));
        System.out.println("----prossimo metodo----");

        System.out.println( f.getIndexConList(list, 1));
        System.out.println( f.getIndexConList(list, 4));
        System.out.println( f.getIndexConList(list, 4123));
        System.out.println( f.getIndexConList(list, 6));
        System.out.println( f.getIndexConList(list, 10));
        System.out.println( f.getIndexConList(list, 123));
        System.out.println( f.getIndexConList(list, 1));

//        System.out.println("----prossimo metodo----");
//        System.out.println(f.getIndexConList(list,10));

    }
}
