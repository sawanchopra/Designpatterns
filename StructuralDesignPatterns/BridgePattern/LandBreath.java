package StructuralDesignPatterns.BridgePattern;

public class LandBreath implements BreathImplementor{
    @Override
    public void breathProcess() {
        System.out.println("breathing through nose");
    }
}
