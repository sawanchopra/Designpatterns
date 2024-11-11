package CreationalDesignPattern.singleton;

public class DoubleLocking {

    private static DoubleLocking constObject;

    private DoubleLocking() {
    }

    synchronized public static DoubleLocking getInstance(){
        if(constObject == null){
            synchronized (DoubleLocking.class) {
                if(constObject == null) {
                    constObject = new DoubleLocking();
                }
            }
        }
        return constObject;
    }
}

