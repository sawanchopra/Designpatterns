package StructuralDesignPatterns.AdaptedDesignPattern.Client;

import StructuralDesignPatterns.AdaptedDesignPattern.Adaptee.WeightMachineForBabies;
import StructuralDesignPatterns.AdaptedDesignPattern.Adapter.WeighMachineImpl;
import StructuralDesignPatterns.AdaptedDesignPattern.Adapter.WeightMachineAdapter;

public class Main {
    public static void main(String[] args) {

        WeightMachineAdapter machineAdapter = new WeighMachineImpl(new WeightMachineForBabies());

        System.out.println(machineAdapter.getWeightInKg());


    }
}
