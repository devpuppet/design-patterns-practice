package singleton;

public class SingletonDoubleLock {

    private static SingletonDoubleLock instance;
    private String importantProperty;

    private SingletonDoubleLock() {

    }

    public static SingletonDoubleLock getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleLock.class) {
                if (instance == null) {
                    instance = new SingletonDoubleLock();
                }
            }
        }
        return instance;
    }

    public String getImportantProperty() {
        return importantProperty;
    }

    public void setImportantProperty(String importantProperty) {
        this.importantProperty = importantProperty;
    }
}
