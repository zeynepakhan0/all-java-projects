public abstract class Employee {

    int id;
    String name;
    double baseSalary;

    Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateMonthlyPayment();
    public abstract double calculateBonus();

    public String toString() {
        return "name: " + name + ", salary: " + baseSalary + "id:"+id;
    }

}
