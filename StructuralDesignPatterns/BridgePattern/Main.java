package StructuralDesignPatterns.BridgePattern;

public class Main {
    public static void main(String[] args) {
     LivingThings fishObj=new Fish(new WaterBreath());
        fishObj.breathProcess();
        LivingThings dogObj=new Dog(new LandBreath());
        dogObj.breathProcess();
    }
}
