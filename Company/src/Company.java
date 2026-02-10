import java.util.ArrayList;

public class Company {
    public ArrayList<Employee> employees;

    Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public double calculatePaymentsAndBonuses(){
        double total = 0;
        for(int i = 0; i<employees.size(); i++){
            Employee employee = employees.get(i);
            total+= employee.calculateBonus()+ employee.calculateMonthlyPayment();
        }
        return total;
    }
    // A method that increases each employee’s base salary by a specified percentage.
    public void increaseByPercentage(double percentage) {
        for(int i=0; i<employees.size(); i++) {
            Employee employee = employees.get(i);
            employee.baseSalary+=(employee.getBaseSalary()*percentage)/100;
        }
    }

    public String toString() {
        String result = "";
        for(int i=0;i<employees.size();i++) {
            result += employees.get(i);
        }
        return super.toString()+ " Employees: " + result;
    }


}
