package Carnivores;

public class BigCats extends CatLike {

    public BigCats(String name, int averageAge, int averageWeight) {
        super(name, averageAge, averageWeight);
    }

    public void description() {
        System.out.println("I'm a Big cat and I come from cat-like carnivores.");
    }

    public void voice() {
        System.out.println("I can roar: rrrrr!");
    }
}
