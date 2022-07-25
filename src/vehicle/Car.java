package vehicle;

public class Car extends Vehicle{
    private boolean isSafe;
    private String name;

    public Car(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Need drivers license for car!\n");
    }

    @Override public String toString() {
        return super.toString();
    }
}
