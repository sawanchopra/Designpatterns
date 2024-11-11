package CreationalDesignPattern.singleton;

public class Sychronize {
    private static Sychronize constObject;

    private Sychronize() {
    }

    synchronized public static Sychronize getInstance(){
        if(constObject == null){
            constObject = new Sychronize();
        }
        return constObject;
    }
}
