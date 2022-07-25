import vehicle.Bike;
import vehicle.Car;
import vehicle.Owner;
import vehicle.Vehicle;

public class main {
    public static void main(String[] args){
//        Vehicle auto = new Bike();
//        auto.setNeedDriversLicense(false);
//        auto.drive();
        ///composition
        Vehicle vehicle = new Bike();
        Owner owner = new Owner();

        owner.getAuto().getCategory();
        owner.setName("Alexandra");
        owner.setAge(20);
        owner.setAuto(vehicle);
        System.out.println(owner);

        owner=new Owner();
        System.out.println(owner);

        Bike bike=new Bike();
        Vehicle bike1=new Bike();

        bike.setCategory("categorie1");
        bike.setMaxSpeed(20);
        bike1.setCategory("categorie2");
        System.out.println(bike);
        System.out.println(bike1);

    }
}
