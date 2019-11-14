package iterator_composite.composite;

public class CompositeTest {

    public static void run() {

        MenuComponent allMenus = initializeMenus();

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }

    private static MenuComponent initializeMenus() {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem( "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true,
                3.89));
        dinerMenu.add(dessertMenu); // here is where magic happens, we have menu in menu (nested menus)
        // and Composite Pattern gives us ability to iterate through nested elements (tree-like structure)

        dessertMenu.add(new MenuItem( "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream", true,
                1.59));

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99));

        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));

        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49));

        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59));

        cafeMenu.add(new MenuItem("Latte",
                "Hot late with veggie milk!",
                true,
                1.99));

        return allMenus;
    }

}
