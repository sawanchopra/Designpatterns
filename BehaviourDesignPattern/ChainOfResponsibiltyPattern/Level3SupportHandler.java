package BehaviourDesignPattern.ChainOfResponsibiltyPattern;

public class Level3SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;
    @Override
    public void handleRequest(SupportRequest request) {
        if(request.getLevel() == Level.LEVEL_THREE){
            System.out.println("Level 3 Support Handler is handling the request");
        }   else
            System.out.println("No handler available for the request");
    }

    @Override
    public void setNextHandler(SupportHandler next) {
        // No next handler for Level 3
        System.out.println("No next handler for Level 3");
    }
}
