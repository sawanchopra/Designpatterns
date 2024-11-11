package CreationalDesignPattern.BuilderDesignPattern;

public class Director {
    StudentBuilder  studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder  instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createMBAStudent() {
        return studentBuilder.setAge(19).setName("sawan").setSubjects().build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setAge(19).setName("sawanMBA").setSubjects().build();
    }
}
