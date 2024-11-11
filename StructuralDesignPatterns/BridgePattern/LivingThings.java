package StructuralDesignPatterns.BridgePattern;

public abstract class LivingThings {
    BreathImplementor breathImplementor;

    public LivingThings(BreathImplementor breathImplementor) {
        this.breathImplementor = breathImplementor;
    }
    abstract void breathProcess();
}
