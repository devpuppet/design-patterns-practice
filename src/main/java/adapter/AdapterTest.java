package adapter;

public class AdapterTest {

    public static void run() {
        System.out.println("\n--- Mallard Duck ---");
        Duck duck = new MallardDuck();
        testDuck(duck);

        System.out.println("\n--- Wild Turkey with Adapter ---");
        Turkey turkey = new WildTurkey();
        testDuck(new TurkeyAdapter(turkey));
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
