package StructuralDesignPatterns.flyweight;

public class roboticDog implements robot{
    String type;
    String body;

    public roboticDog(String type, String body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int x, int y) {

    }
}
