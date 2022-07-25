package vehicle;

import java.time.LocalDate;
import java.util.Objects;

public class Owner{
    private String name;
    private int age;
    private LocalDate dateOfBirth;

    private Vehicle auto = new Vehicle("bike");

    public Owner(){
        super();
        auto = new Vehicle("Default name");
    }

    public Owner(int age, String name){
        this.age=age;
        this.name=name;
    }

    public Owner(Vehicle v){
        this.auto = v;
    }

    public int getAge(){
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
        return age;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getAuto() {
        return auto;
    }

    public void setAuto(Vehicle auto) {
        this.auto = auto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Owner p = (Owner) o;
        return dateOfBirth.equals(p.dateOfBirth) && name.equals(p.name);
    }

    @Override public int hashCode() {
        return Objects.hash(dateOfBirth, name);
    }

    @Override public String toString() {
        return name+"/"+age;
    }
}
