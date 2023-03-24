package inheritance;

public class Employee extends Person {

    private int idEmployee;
    private double salary;
    private static int employeeCounter;

    public Employee(String name, double salary) {
        super(name);
        this.idEmployee = ++Employee.employeeCounter;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return this.idEmployee;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("idEmployee=").append(this.idEmployee);
        sb.append(", salary=").append(this.salary);
        sb.append(", Person={").append(super.toString()).append("}"); //Or this.getName();
        sb.append('}');
        return sb.toString();
    }

}
