package Carnivores;

public class BigCats extends CatLike implements CatLikeInterface {

    public BigCats(String name, int averageAge, int averageWeight) {
        super(name, averageAge, averageWeight);
    }

    public void description() {
        System.out.println("I'm a Big cat and I come from cat-like carnivores.");
    }

    public void voice() {
        System.out.println("I can roar: rrrrr!");
    }

    @Override
    public void habitat() {
        System.out.println("I live all over the world in the desert, mountains, forests.");
    }

    @Override
    public void food() {
        System.out.println("I like meat.");
    }
}
