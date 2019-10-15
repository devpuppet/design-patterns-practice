package singleton;

public class ClassUsingEnumSingleton {

    private SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

    public void changeSingletonState(String value) {
        singletonEnum.setImportantProperty(value);
    }

    public String getSingletonState() {
        return singletonEnum.getImportantProperty();
    }

}
