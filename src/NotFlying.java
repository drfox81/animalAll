import java.util.Objects;

public class NotFlying extends Birds{
    private final String typeMovement="бег";

    public NotFlying(String name, String livingEnvironment) {
        super(name, livingEnvironment);
    }

    public NotFlying(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public void wolk(){
        System.out.println("гулять!!!");
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotFlying notFlying = (NotFlying) o;
        return Objects.equals(getLivingEnvironment(),notFlying.getLivingEnvironment())
                && Objects.equals(getName(), notFlying.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeMovement);
    }

    @Override
    public String toString() {
        return "Животное - " + getName() + ", возраст - " + getAge() + ", среда обитания - "
                + getLivingEnvironment() + ", тип передвижения - " + getTypeMovement() + ", " +
                getClass();
    }
}
