package StructuralDesignPatterns.FacadeDesignPattern;

public class EmployeeFacade {
    EmployeeDao employeeDao;

    public EmployeeFacade() {
        employeeDao= new EmployeeDao();
    }

    public void insert(){
        employeeDao.insert();
    }
}
