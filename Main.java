class Student {
    int age;
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 20;
        s.name = "shiv";
        System.out.println("my name is " + s.name);
    }
}