package template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Brewing coffee...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding milk...");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer.toLowerCase().startsWith("n") ? false : true;
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like to add milk to your coffee (y/n) ?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (answer == null) {
            answer = "no";
        }

        return answer;
    }
}
