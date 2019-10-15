package singleton;

public class SingletonTest {



    public static void run() {
        ClassUsingNotThreadSafeSingleton classUsingNotThreadSafeSingleton1 = new ClassUsingNotThreadSafeSingleton();
        ClassUsingNotThreadSafeSingleton classUsingNotThreadSafeSingleton2 = new ClassUsingNotThreadSafeSingleton();

        // SingletonNotThreadSafe pattern causes problems in multithreaded applications
        System.out.println("\n--- NOT THREAD SAFE SINGLETON ---\n");

        classUsingNotThreadSafeSingleton1.changeSingletonState("1");
        System.out.println("Value of SingletonNotThreadSafe in class 2 after changing in class 1: " + classUsingNotThreadSafeSingleton2.getSingletonState());

        classUsingNotThreadSafeSingleton2.changeSingletonState("2");
        System.out.println("Value of SingletonNotThreadSafe in class 1 after changing in class 2: " + classUsingNotThreadSafeSingleton1.getSingletonState());

        // SingletonDoubleLock pattern is thread safe but can be broken by reflection - simply access Singleton class
        // and set constructor to accessible=true, then create second instance of singleton
        System.out.println("\n--- DOUBLE LOCK SINGLETON ---\n");
        ClassUsingDoubleLockSingleton classUsingDoubleLockSingleton1 = new ClassUsingDoubleLockSingleton();
        ClassUsingDoubleLockSingleton classUsingDoubleLockSingleton2 = new ClassUsingDoubleLockSingleton();

        classUsingDoubleLockSingleton1.changeSingletonState("1");
        System.out.println("Value of SingletonDoubleLock in class 2 after changing in class 1: " + classUsingDoubleLockSingleton2.getSingletonState());

        classUsingDoubleLockSingleton2.changeSingletonState("2");
        System.out.println("Value of SingletonDoubleLock in class 1 after changing in class 2: " + classUsingDoubleLockSingleton1.getSingletonState());

        // SingletonEnum pattern is thread safe because Java ensures that enums are unique by nature
        // but it has drawbacks e.g. no lazy initialization
        System.out.println("\n--- ~ENUM SINGLETON ---\n");
        ClassUsingEnumSingleton classUsingEnumSingleton1 = new ClassUsingEnumSingleton();
        ClassUsingEnumSingleton classUsingEnumSingleton2 = new ClassUsingEnumSingleton();

        classUsingEnumSingleton1.changeSingletonState("1");
        System.out.println("Value of SingletonEnum in class 2 after changing in class 1: " + classUsingEnumSingleton2.getSingletonState());

        classUsingEnumSingleton2.changeSingletonState("2");
        System.out.println("Value of SingletonEnum in class 1 after changing in class 2: " + classUsingEnumSingleton1.getSingletonState());

    }

}
