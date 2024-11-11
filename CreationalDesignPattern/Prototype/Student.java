package CreationalDesignPattern.Prototype;

public class Student implements Protype{
    private int rollNumber;
    int age;
    String name;

    public Student(int rollNumber, int age, String name) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
    }

    public Student() {

    }

    @Override
    public Protype clone() {
        return new Student(rollNumber,age,name);
    }
}
