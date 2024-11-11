package StructuralDesignPatterns.AdaptedDesignPattern.Adapter;

import StructuralDesignPatterns.AdaptedDesignPattern.Adaptee.WeightMachine;

public class WeighMachineImpl implements WeightMachineAdapter{
    WeightMachine weightMachine;

    public WeighMachineImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeightInPount();


        return weightInPound * 0.45;
    }
}
