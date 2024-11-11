package CreationalDesignPattern.singleton;

public class LazySingleton {
    private static LazySingleton constObject;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if(constObject == null){
            constObject = new LazySingleton();
        }
        return constObject;
    }
}
