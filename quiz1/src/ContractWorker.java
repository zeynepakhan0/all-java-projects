public class ContractWorker extends Employee{

    int projectsCompleted;
    double paymentPerProject;

    public ContractWorker(int id, String name, double baseSalary, int projectsCompleted, double paymentPerProject) {
        super(id, name, baseSalary);
        this.projectsCompleted = projectsCompleted;
        this.paymentPerProject = paymentPerProject;

    }

    public double calculateMonthlyPayment(){
        return (paymentPerProject * projectsCompleted) + getBaseSalary();
    }

    public double calculateBonus(){
        if(projectsCompleted >=5){
            return 1000;
        }
        return 0;
    }

    public String toString() {
        return super.toString()+ " Projects Completed: " + projectsCompleted+ " Payment Per Project: " + paymentPerProject;
    }



}
