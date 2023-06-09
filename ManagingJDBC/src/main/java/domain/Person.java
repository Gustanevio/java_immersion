package domain;

public class Person {

    private int id;
    private String name;
    private String surname;
    private String email;
    private String cell;

    public Person() {
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String name, String surname, String email, String cell) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.cell = cell;
    }

    public Person(int id, String name, String surname, String email, String cell) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.cell = cell;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", cell=" + cell + '}';
    }

}
