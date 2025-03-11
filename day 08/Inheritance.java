class Parent {
    int age, id;
    String name;

    void name(String name) {
        System.out.println("Name: " + name);
    }

}

class Child extends Parent {
    void ageN(int age) {
        System.out.println("age of student is " + age);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child s = new Child();
        s.name("Aashish");
        s.ageN(14);
    }
}
