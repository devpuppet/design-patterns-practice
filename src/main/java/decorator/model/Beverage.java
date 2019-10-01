package decorator.model;

public abstract class Beverage {

    private String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

    public String printOrder() {
        return cost() + "$ - " + getDescription();
    }

}
