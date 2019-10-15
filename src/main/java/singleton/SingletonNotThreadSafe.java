package singleton;

public class SingletonNotThreadSafe {

    private String importantProperty = "";
    private static SingletonNotThreadSafe INSTANCE;

    private SingletonNotThreadSafe() {

    }

    public static SingletonNotThreadSafe getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonNotThreadSafe();
        }
        return INSTANCE;
    }

    public String getImportantProperty() {
        return this.importantProperty;
    }

    public void setImportantProperty(String value) {
        this.importantProperty = value;
    }

}
