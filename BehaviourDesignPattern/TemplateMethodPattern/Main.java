package BehaviourDesignPattern.TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        TeaMaker teaMaker = new TeaMaker();
        System.out.println("Making Coffee:");
        coffeeMaker.makeBeverage();
        System.out.println("Making tea:");
        teaMaker.makeBeverage();
    }
}
