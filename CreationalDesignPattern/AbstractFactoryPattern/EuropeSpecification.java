package CreationalDesignPattern.AbstractFactoryPattern;

public class EuropeSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("Europe Specification");
    }
}
