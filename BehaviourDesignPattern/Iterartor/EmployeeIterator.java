package BehaviourDesignPattern.Iterartor;

import java.util.List;
import java.util.NoSuchElementException;

public class EmployeeIterator implements Iterartor<Employee> {
    private int currentIndex = 0;

    private List<Employee> employees;

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < employees.size();
    }

    @Override
    public Employee next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return employees.get(currentIndex++);
    }
}