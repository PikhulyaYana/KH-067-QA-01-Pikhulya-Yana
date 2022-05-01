package Carnivores;

public class LittleCats extends CatLike {
    public LittleCats(String name, int averageAge, int averageWeight) {
        super(name, averageAge, averageWeight);
    }

    public void description() {
        System.out.println("I'm a little cat and I come from cat-like carnivores.");
    }

    public void voice() {
        System.out.println("Unfortunately can't roar. But I can purr)))");
    }
}
