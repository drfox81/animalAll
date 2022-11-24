public class Main {
    public static void main(String[] args) {

        Herbivores horse = new Herbivores("Лошадь", "степи", 55);
        Herbivores gazelle = new Herbivores("Газель", "полупыстыни", 70);
        Herbivores giraffe = new Herbivores("Жираф", "пустыни", 20);

        Predators hyena = new Predators("Гиена", 10, "полупустыня", 60);
        Predators tiger = new Predators("Тигр", 12, "полупустыня", 60);
        Predators bear = new Predators("Медведь", 5, "лес", 50);

        Amphibians frog = new Amphibians("Лягушка", 2,"болото");
        Amphibians grassSnake = new Amphibians("Уж пресноводный", "болото");

        NotFlying peacock=new NotFlying("Павлин",5,"лес");
        NotFlying penguin=new NotFlying("Павлин","Антарктика");
        NotFlying dodo=new NotFlying("Додо","лес");

        Flying seagull=new Flying("Чайка","море");
        Flying albatros=new Flying("Альбатрос",5,"море");
        Flying falcon=new Flying("Сокол",6,"степь");

        seagull.fly();
        seagull.eat();
        seagull.sleep();
        seagull.move();
        seagull.hanting();
        System.out.println(seagull.getTypeMovement());
        System.out.println(seagull.getLivingEnvironment());

        System.out.println(peacock.equals(penguin));
        System.out.println(frog.toString());
        System.out.println(seagull.toString());
        System.out.println(peacock.toString());
        System.out.println(horse.toString());
        System.out.println(hyena.toString());
        System.out.println(hyena.getSpeed());


    }
}