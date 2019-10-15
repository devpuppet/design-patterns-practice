package singleton;

public class ClassUsingDoubleLockSingleton {

    private SingletonDoubleLock singletonDoubleLock = SingletonDoubleLock.getInstance();

    public void changeSingletonState(String value) {
        singletonDoubleLock.setImportantProperty(value);
    }

    public String getSingletonState() {
        return singletonDoubleLock.getImportantProperty();
    }

}
