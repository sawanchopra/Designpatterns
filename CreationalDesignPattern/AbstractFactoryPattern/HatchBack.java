package CreationalDesignPattern.AbstractFactoryPattern;

public class HatchBack implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling HatchBack");
    }
}
