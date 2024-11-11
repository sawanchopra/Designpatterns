package BehaviourDesignPattern.ChainOfResponsibiltyPattern;

public class SupportRequest {
    private Level level;

    public SupportRequest(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }
}
