package EsercizioComparable;

import java.util.Date;

// @Data
public class Cliente implements Comparable<Cliente> {
    String name;
    String surname;
    int age;
    String id;
    Date born;


    public Cliente(int age,
                   Date born,
                   String id,
                   String name,
                   String surname) {
        this.age = age;
        this.born = born;
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int compareTo(Cliente o) {
//        return Integer.compare(this.getAge(), o.getAge());
        if (this.getAge() == o.getAge()) {
            return 0;
        } else if (this.getAge() > o.getAge()) {
            return 1;
        } else {
            return -1;
        }



    }

    @Override
    public String toString() {
        return "Cliente{" + "age=" + age + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", id='" + id + '\'' + ", born=" + born + '}';
    }
}
