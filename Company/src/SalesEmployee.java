public class SalesEmployee extends Employee {

double totalSales;
double commissionRate;

public SalesEmployee(int id, String name, double baseSalary,double totalSales, double commissionRate) {
    super(id, name, baseSalary);
    this.totalSales = totalSales;
    this.commissionRate = commissionRate;

}

public double calculateMonthlyPayment(){

return (totalSales * commissionRate)+ getBaseSalary();

}
public double calculateBonus(){

    if(totalSales >10000){
        return totalSales*(0.1);
    }
    return 0;
}

public String toString() {
    return super.toString()+" total sales: "+totalSales+ " commission rate: "+commissionRate;
}




}
