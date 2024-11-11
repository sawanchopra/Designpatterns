package StructuralDesignPatterns.BridgePattern;

public class TreeBreath implements BreathImplementor{
    @Override
    public void breathProcess() {
        System.out.println("breathing through Leaves");
    }
}
