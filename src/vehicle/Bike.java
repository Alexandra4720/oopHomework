package vehicle;

public class Bike extends Vehicle {

    private int maxSpeed;

    public Bike() {
        super();
    }

    @Override
    public void drive() {
        System.out.println("Don't need driver license for bike!\n");
    }

    @Override public String toString() {
        return "Vehicle: " + "maxSpeed=" + maxSpeed +" "+ super.toString();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
