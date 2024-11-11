package CreationalDesignPattern.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
    List<String> subjects=new ArrayList<>();
    subjects.add("MATHS");
    subjects.add("ECONOMICS");
   this.subjects=subjects;
   return this;
    }
}
