package encapsulation.domain;

public class Person {
    // Protect atributes, to not access directly
    private String name;
    private double salary;
    private boolean removed;

    public Person(String name, double salary, boolean removed) {
        this.name = name;
        this.salary = salary;
        this.removed = removed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Boolean isRemoved() {
        return this.removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    public String toString() {
        return "Person{" + "name=" + name + ", salary=" + salary + ", removed=" + removed + '}';
    }
    
    
}
