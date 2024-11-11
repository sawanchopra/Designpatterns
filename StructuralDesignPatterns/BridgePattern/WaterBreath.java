package StructuralDesignPatterns.BridgePattern;

public class WaterBreath implements BreathImplementor{
    @Override
    public void breathProcess() {
        System.out.println("breathing though gills");
    }
}
