import java.util.Objects;

public class Herbivores extends Mammals {
    private final String typeFood = "растительная";


    public Herbivores(String name, String livingEnvironment, int speed) {
        super(name, livingEnvironment, speed);
    }

    public Herbivores(String name, int age, String livingEnvironment, int speed) {
        super(name, age, livingEnvironment, speed);

    }

    public String getTypeFood() {
        return typeFood;
    }

    public void graze() {
        System.out.println("я люблю траву, поэтому пасусь на лугу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(getLivingEnvironment(), that.getLivingEnvironment())
                && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeFood);
    }

    @Override
    public String toString() {
        return "Животное - " + getName() + ", возраст - " + getAge() + ", среда обитания - "
                + getLivingEnvironment() + ", тип еды - " + getTypeFood() +",\n"+
                "максимальная скорость движения - " + getSpeed() + ", " +
                getClass();
    }
}
