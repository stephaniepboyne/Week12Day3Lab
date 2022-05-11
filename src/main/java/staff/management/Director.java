package staff.management;

public class Director extends Manager{

    private double budget;

    public Director(String name, int nino, double salary, String deptName, double budget) {
        super(name, nino, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(double Salary){
        return this.getSalary() / 50.00;
    }
}
