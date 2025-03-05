package Lambda;

public class Lmabdas {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
//        cat1.print();
//        printThing((pippo,franco) -> System.out.println("meow2"+pippo+"okay?"));
//        Printable lambdaPrintable = (tizio, strano) -> {
//            System.out.println("meow3"+strano);
//            return "meow";
//        };
        Printable lambdaPrintable = (tizio, strano) -> "Meow" + strano;
//        printThing(lambdaPrintable);


    }


//    static void printThing(Printable thing) {
//        thing.print("!", "okay?!");
//    }
}
