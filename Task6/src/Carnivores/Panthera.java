package Carnivores;

public class Panthera extends CatLike {
    public Panthera(String name, int averageAge, int averageWeight) {
        super(name, averageAge, averageWeight);
    }

    @Override
    public void voice() {
        System.out.println("Panthera roars like: ffrrraaauuu!");
    }

    @Override
    public void description() {
        System.out.println("I'm a Big cat and I come from cat-like carnivores.");
    }
}

