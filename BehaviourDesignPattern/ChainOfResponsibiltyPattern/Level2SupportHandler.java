package BehaviourDesignPattern.ChainOfResponsibiltyPattern;

public class Level2SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;
    @Override
    public void handleRequest(SupportRequest request) {
        if(request.getLevel() == Level.LEVEL_TWO){
            System.out.println("Level 2 Support Handler is handling the request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);

        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
    this.nextHandler= nextHandler;
    }
}
