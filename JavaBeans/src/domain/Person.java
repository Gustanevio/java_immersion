package domain;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String surname;

    public Person() {
    }

    public Person(String name, String sunname) {
        this.name = name;
        this.surname = sunname;
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

    public void setSurname(String sunname) {
        this.surname = sunname;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", sunname=" + surname + '}';
    }

}
