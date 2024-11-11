package CreationalDesignPattern.AbstractFactoryPattern;

public class NorthAmericaSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("North America Specification");
    }
}
