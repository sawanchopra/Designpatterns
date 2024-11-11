package CreationalDesignPattern.singleton;

public class DbConnection {
    private static DbConnection constObject=new DbConnection();

    private DbConnection() {
    }

    public static DbConnection getInstance(){
        return constObject;
    }
}
