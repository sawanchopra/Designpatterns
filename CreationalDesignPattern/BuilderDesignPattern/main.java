package CreationalDesignPattern.BuilderDesignPattern;

public class main {
    public static void main(String[] args) {
        Director director =new Director(new EngineeringStudentBuilder());
        Director director2 =new Director(new MBAStudentBuilder());

        Student student=director.createStudent();
        Student student2=director2.createStudent();
        System.out.println(student.toString());
        System.out.println(student2.toString());

    }
}
