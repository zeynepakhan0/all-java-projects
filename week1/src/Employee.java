public class Employee {

    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        System.out.println("Welcome");
        Employee e1 = new Employee("Zeynep", 20);
        System.out.println("Name:" +e1.name +  "\n" + "Age:" +e1.age + "\n");
        Employee e2= new Employee("Deniz", 20);
        System.out.println("Name:" +e2.name +  "\n" + "Age:" +e2.age);

    }
}
