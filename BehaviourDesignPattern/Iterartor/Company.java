package BehaviourDesignPattern.Iterartor;

import java.util.List;

public class Company implements Aggregate<Employee>{
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterartor<Employee> createIterator() {
        return new EmployeeIterator(employees);
    }
}
