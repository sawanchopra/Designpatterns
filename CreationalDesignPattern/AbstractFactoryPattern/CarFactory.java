package CreationalDesignPattern.AbstractFactoryPattern;

// Abstract Factory Interface
interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}
