import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name) {
        this(name,0);
    }

    public Animal(String name, int age) {
        setName(name);
        if (age <= 0) {
            this.age = Math.abs(age);
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "Неизвестный";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("Засыпаю");
    }
    public abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
