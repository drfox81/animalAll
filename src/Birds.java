public abstract class Birds extends Animal {
    private String livingEnvironment;
    public Birds(String name, String livingEnvironment) {
        super(name);
        setLivingEnvironment(livingEnvironment);
    }

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }




    public void hanting() {
        System.out.println("выхожу на охоту");
    }

    @Override
    public void eat() {
        System.out.println("кушаю!");
    }

    @Override
    public void move() {
        System.out.println("передвигаюсь по туда сюда");
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


}
