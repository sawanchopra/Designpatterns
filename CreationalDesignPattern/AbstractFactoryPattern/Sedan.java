package CreationalDesignPattern.AbstractFactoryPattern;

public class Sedan implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan");
    }
}
