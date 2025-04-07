class Employee01{
    int salary;
    String name;

    int getSalary(){
        return salary;
    }

    void setSalary(int s){
        salary =s;
    }

    String getName(){
        return name;
    }


    void setName(String n){
        name = n;
    }
}
public class Employee {
    public static void main(String[] args) {
        Employee01 e1 = new Employee01();
        e1.setName("employeename");
        e1.setSalary(100000);

        System.out.println("salary of the employee is " + e1.getSalary());
        System.out.println("name of the employee is "+ e1.getName());
    }
}