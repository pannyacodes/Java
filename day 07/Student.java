class Student1{
    int age;
    String name;

    Student1(int studentAge, String studentName){
        age = studentAge;
        name = studentName;
    }
    void display(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class Student {
    public static void main(String[] args) {
        Student1 s1 = new Student1(9, "name");
        s1.display();
    }
}
