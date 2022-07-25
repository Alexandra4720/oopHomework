package vehicle;


public class Vehicle {
    ///declararea unei primitive, unui strig si unui obiect
    private boolean needDriversLicense;
    private String category;

    ///constructor fara parametru
    public Vehicle()
    {
        System.out.println("Vehicle constructor");

    }

    ///constructor cu parametru
    public Vehicle(String category) {
        this.category = category;
    }

    public void drive(){
        if(needDriversLicense) {
            System.out.println("You can drive!");
        }
    }

    ///getteri si settari
    public boolean isNeedDriversLicense() {
        return needDriversLicense;
    }

    public void setNeedDriversLicense(boolean driversLicense) {
        needDriversLicense = driversLicense;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    ///suprascriere
    @Override public String toString() {
        return category + '\'';
    }




}
