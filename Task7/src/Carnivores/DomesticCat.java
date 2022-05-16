package Carnivores;

public class DomesticCat extends LittleCats {
    public DomesticCat(String name, int averageAge, int averageWeight) {
        super(name, averageAge, averageWeight);
    }

    @Override
    public void voice() {
        System.out.println("Domestic cats can purr and meow)))");
    }

    @Override
    public void description() {
        System.out.println("I'm a little cat and I come from cat-like carnivores.");
    }
}

