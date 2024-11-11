package CreationalDesignPattern.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects=new ArrayList<>();
        subjects.add("DS");
        this.subjects=subjects;
        return this;
    }
}

