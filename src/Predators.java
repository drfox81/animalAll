import java.util.Objects;

public class Predators extends Mammals {

    private final String typeFood="животного происхождения";


    public Predators(String name, String livingEnvironment, int speed) {
        super(name, livingEnvironment, speed);
    }

    public Predators(String name, int age, String livingEnvironment, int speed) {
        super(name, age, livingEnvironment, speed);
    }

    public String getTypeFood() {
        return typeFood;
    }


    public void hanting() {
        System.out.println("я люблю мясо!!! иду на охоту");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predators predators = (Predators) o;
        return Objects.equals(getLivingEnvironment(),predators.getLivingEnvironment())
                && Objects.equals(getName(), predators.getName());
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
