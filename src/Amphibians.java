import java.util.Objects;

public class Amphibians extends Animal {

    public Amphibians(String name, String livingEnvironment) {
        super(name);
        setLivingEnvironment(livingEnvironment);
    }

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    private String livingEnvironment;


    public void hanting() {
        System.out.println("вышел на охоту");
    }

    @Override
    public void eat() {
        System.out.println("Кушаю");
    }

    @Override
    public void move() {
        System.out.println("передвигаюсь по миру");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "не указана среда проживания";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(getLivingEnvironment(), that.getLivingEnvironment())
                && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Животное - " + getName() + ", возраст - " + getAge() + ", среда обитания - " + getLivingEnvironment() + ", " +
                getClass();

    }
}
