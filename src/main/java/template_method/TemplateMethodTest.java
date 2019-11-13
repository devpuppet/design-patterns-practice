package template_method;

public class TemplateMethodTest {

    public static void run() {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        System.out.println("\nPreparing Tea");
        tea.prepareRecipe();

        System.out.println("\nPreparing Coffee");
        coffee.prepareRecipe();
    }

}
