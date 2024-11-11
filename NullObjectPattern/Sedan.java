package NullObjectPattern;

public class Sedan implements Car{
    @Override
    public void drive() {
        System.out.println("Driving Sedan");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Sedan");
    }
}
