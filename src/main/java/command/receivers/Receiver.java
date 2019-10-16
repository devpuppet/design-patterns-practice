package command.receivers;

public abstract class Receiver {

    public Receiver(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(String.format("[%s] switched ON", getName()));
    }

    public void off() {
        System.out.println(String.format("[%s] switched OFF", getName()));
    }

}
