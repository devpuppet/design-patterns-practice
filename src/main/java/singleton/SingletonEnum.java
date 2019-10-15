package singleton;

public enum SingletonEnum {

    INSTANCE;

    private String importantProperty;

    public String getImportantProperty() {
        return importantProperty;
    }

    public void setImportantProperty(String importantProperty) {
        this.importantProperty = importantProperty;
    }
}
