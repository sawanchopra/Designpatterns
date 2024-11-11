package StructuralDesignPatterns.FacadeDesignPattern;

public class EmployeeClient {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.insert();

    }

}
