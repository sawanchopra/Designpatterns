package BehaviourDesignPattern.ChainOfResponsibiltyPattern;

public interface SupportHandler {
    void handleRequest(SupportRequest request);
    void setNextHandler(SupportHandler next);
}
