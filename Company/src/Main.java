public class Main {
    public static void main(String[] args) {

        SalesEmployee e1=new SalesEmployee(1,"ayşe",2000,15,20);
        SalesEmployee e2=new SalesEmployee(2,"ali",5000,15,20);
        ContractWorker e3=new ContractWorker(3,"Kaan",6000,18,30);
        ContractWorker e4= new ContractWorker(4,"Zeynep",8000,4,36);
        Company company=new Company();
        company.addEmployee(e1);
        company.addEmployee(e2);
        company.addEmployee(e3);
        company.addEmployee(e4);
        System.out.println(company.calculatePaymentsAndBonuses());
        company.increaseByPercentage(20.0);


    }
}
