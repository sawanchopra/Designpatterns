package NullObjectPattern;

public class Suv implements Car{
    @Override
    public void drive() {
        System.out.println("Driving Suv");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Suv");
    }
}
