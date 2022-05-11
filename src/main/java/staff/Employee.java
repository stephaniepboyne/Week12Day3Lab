package staff;

public abstract class Employee {
    private String name;
    private int nino;
    private double salary;
    private double raise;

    public Employee(String name, int nino, double salary){
        this.name = name;
        this.nino = nino;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNino() {
        return nino;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        this.salary += raise;
    }

    public double payBonus(double Salary){
        return this.salary / 100.00;
    }
}
