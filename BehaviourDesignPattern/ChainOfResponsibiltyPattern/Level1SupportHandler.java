package BehaviourDesignPattern.ChainOfResponsibiltyPattern;

public class Level1SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;
    @Override
    public void handleRequest(SupportRequest request) {
        if(request.getLevel() == Level.LEVEL_ONE){
            System.out.println("Level 1 Support Handler is handling the request");
        }else if(nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
