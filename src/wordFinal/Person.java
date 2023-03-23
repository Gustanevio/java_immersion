package wordFinal;

public final class Person {

    public final static int MY_CONSTANT = 15;

    private String name;

    public final void print() {
        System.out.println("Final class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
