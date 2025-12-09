class Student {
    String name;

    void result(int marks) {
        System.out.println("result is " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "harshada";
        s.result(80);
    }
}