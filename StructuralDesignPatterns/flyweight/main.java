package StructuralDesignPatterns.flyweight;

public class main {
    public static void main(String[] args) {
        robot robot1 = roboticFactory.CreateRobot("humanoid");
        robot1.display(100, 100);
        robot robot2 = roboticFactory.CreateRobot("humanoid");
        robot2.display(200, 200);
        robot robot3 = roboticFactory.CreateRobot("humanoid");
        robot3.display(300, 300);
    }
}
