
public class Employee {

int id;
String name;
String position;
double salary;

 Employee(int id, String name, String position, double salary) {

    this.id = id;
    this.name = name;
    this.position = position;
    this.salary = salary;

}

public String toString() {
    return "id:" +id + " name:" +name + " position:" +position + " salary:" +salary;
}



    public static void main(String[] args) {

    Employee e1=new Employee(20,"Zeynep","Intern",8000);
    System.out.println(e1);



        }
    }
