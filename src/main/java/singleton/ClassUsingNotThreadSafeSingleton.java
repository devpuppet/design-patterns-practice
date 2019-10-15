package singleton;

public class ClassUsingNotThreadSafeSingleton {

    private SingletonNotThreadSafe singletonNotThreadSafe = SingletonNotThreadSafe.getInstance();

    public void changeSingletonState(String value) {
        singletonNotThreadSafe.setImportantProperty(value);
    }

    public String getSingletonState() {
        return singletonNotThreadSafe.getImportantProperty();
    }

}
