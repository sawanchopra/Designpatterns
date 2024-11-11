package StructuralDesignPatterns.BridgePattern;

public class Dog extends LivingThings{
    public Dog(BreathImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    void breathProcess() {
        breathImplementor.breathProcess();
    }

}
