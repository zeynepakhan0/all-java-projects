public class Company {

    String name;
    Employee[] employees;
    int currentEmployeeCount;
    int maxEmployeeCount;

Company(String name, int maxEmployeeCount) {

    this.name = name;
    this.currentEmployeeCount = 0;
    this.maxEmployeeCount = maxEmployeeCount;
    this.employees = new Employee[maxEmployeeCount];

}

void addEmployee(Employee employee) {

    if(currentEmployeeCount < maxEmployeeCount) {
        employees[currentEmployeeCount] = employee;
        currentEmployeeCount++;
    }

}

void displayEmployees() {

   for (int i = 0; i < currentEmployeeCount; i++) {
       System.out.println(employees[i]);
   }
}

double getSalary() {

    int totalSalary=0;
    for (int i = 0; i < currentEmployeeCount; i++) {
        totalSalary+= employees[i].salary;
    }
    return totalSalary;
}

public static void main(String[] args) {

    Company company = new Company("Zeynep's company",100);
    Employee e1= new Employee(1,"Ali","Intern", 8000);
    Employee e2= new Employee(2,"Ahmet","Intern", 8000);
    Employee e3= new Employee(3,"Sıla","Intern", 8000);

    company.addEmployee(e1);
    company.addEmployee(e2);
    company.addEmployee(e3);
    company.displayEmployees();
    System.out.println("Total salary is:" +company.getSalary());

}


}
