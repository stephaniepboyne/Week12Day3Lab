package staff;

public abstract class Employee {
    String name;
    int nino;
    double salary;

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
        if (raise > 0) {
            this.salary += raise;
        }
    }

    public double payBonus(double Salary){
        return this.salary / 100.00;
    }

    public void changeName(String newName){
        if (newName != null){
            this.name = newName;
        }
    }
}
