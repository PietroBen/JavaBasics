package JavaBasics._19;

public class Student {
    String name;
    int age;
    public Student(String name,int age){
        //System.out.println("Costructing");
        this.name = name;
        this.age = age;
        //System.out.println("Costructed");
    }
    public Student(String name) {
        this.name = name;
    }
    public Student(int age) {
        this.age = age;
    }
    public Student() {
    }
}
