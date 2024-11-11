package CreationalDesignPattern.Prototype;

public class Main {
    public static void main(String[] args) {
        Student student =new Student(1,2,"sawan");
        Student clone = (Student) student.clone();
        System.out.println(""+clone.name);
    }
}
