package Lambda;

public class Cat implements Printable{
    String name;
    int age;

    public Cat() {
    }

    public Cat(int age,
               String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


//    @Override
//    public void print() {
//        System.out.println("meow");
//    }
//
//    @Override
//    public void print1(String s) {
//
//    }

    @Override
    public String print2(String prefisso,
                         String suffisso) {

        return prefisso;
    }
}
