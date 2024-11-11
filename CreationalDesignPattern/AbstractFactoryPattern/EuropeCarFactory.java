package CreationalDesignPattern.AbstractFactoryPattern;

public class EuropeCarFactory implements CarFactory {

    public Car createCar() {
        return new HatchBack();
    }

    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
