package StructuralDesignPatterns.BridgePattern;

public class Fish extends LivingThings{
    public Fish(BreathImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    void breathProcess() {
        breathImplementor.breathProcess();
    }
}
