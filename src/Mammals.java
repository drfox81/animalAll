public abstract class Mammals extends Animal {

    private String livingEnvironment;
    private int speed;

    public Mammals(String name, String livingEnvironment, int speed) {
        super(name);
        setLivingEnvironment(livingEnvironment);
        if (speed <= 0) {
            this.speed = Math.abs(speed);
        } else {
            this.speed = speed;
        }
    }

    public Mammals(String name, int age, String livingEnvironment, int speed) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
        if (speed <= 0) {
            this.speed = Math.abs(speed);
        } else {
            this.speed = speed;
        }
    }

    public void walk() {
        System.out.println("гуляю");
    }

    @Override
    public void eat() {
        System.out.println("я млекопитающий ,я люблю траву, пошел кушать");
    }

    @Override
    public void move() {
        System.out.println("пошел поброжу по миру");
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

    public int getSpeed() {
        return speed;
    }

}
