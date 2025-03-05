package LambdaCB;

public class SpaventaPasseri {
    public static void main(String[] args) {

        SpaventaPasseri spaventaPasseri = new SpaventaPasseri();
//        SpaventaUsignoli spaventaUsignoli = new SpaventaUsignoli();
        Spavento lambdaAnonima = new Spavento() {
            @Override
            public void spaventa(String frase,
                                 String animale) {
                System.out.printf("%s %s",frase,animale);

            }
        };

//        Spavento lambda = () -> System.out.println("Via brutti usignoli");
//        spaventaPasseri.faiSPavento(lambda);
        spaventaPasseri.faiSpavento(lambdaAnonima,"Andate via","Usignoli");

//    lambda =
//    @Override
//    public void spaventa() {
//        System.out.println("Via brutti usignoli");
//    };

//    lambda =
//    public void spaventa() {
//        System.out.println("Via brutti usignoli");
//    };


//    lambda =
//     spaventa() {
//        System.out.println("Via brutti usignoli");
//    };

        //    lambda =
//     () {
//        System.out.println("Via brutti usignoli");
//    };

//        lambda = () -> {
//            System.out.println("Via brutti usignoli");
//        };

//        Spavento lambda1 = () -> System.out.println("Via brutti usignoli");

    }


    public void faiSpavento(Spavento spavento,
                            String frase,
                            String animale) {
        spavento.spaventa(frase, animale);
    }
}
