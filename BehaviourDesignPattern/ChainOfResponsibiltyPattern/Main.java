package BehaviourDesignPattern.ChainOfResponsibiltyPattern;

public class Main {
    public static void main(String[] args) {
        SupportHandler level1Handler = new Level1SupportHandler();
        SupportHandler level2Handler = new Level2SupportHandler();
        SupportHandler level3Handler = new Level3SupportHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        SupportRequest request1 = new SupportRequest(Level.LEVEL_ONE);
        SupportRequest request2 = new SupportRequest(Level.LEVEL_TWO);
        SupportRequest request3 = new SupportRequest(Level.LEVEL_THREE);

        level1Handler.handleRequest(request1);
        level1Handler.handleRequest(request2);
        level1Handler.handleRequest(request3);
    }
}
