import java.util.Objects;

public class Flying extends Birds {
    private final String typeMovement = "полет";


    public Flying(String name, String livingEnvironment) {
        super(name, livingEnvironment);
    }

    public Flying(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public void fly() {
        System.out.println("полетел");
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return Objects.equals(getLivingEnvironment(), flying.getLivingEnvironment())
                && Objects.equals(getName(), flying.getName());
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
