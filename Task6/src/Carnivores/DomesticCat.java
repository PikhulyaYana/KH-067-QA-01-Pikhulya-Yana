package Carnivores;

public class DomesticCat extends LittleCats {
    private String home;

    public DomesticCat(String name, int averageAge, int averageWeight) {
        super(name, averageAge, averageWeight);
    }

    public DomesticCat(String name, int averageAge, int averageWeight, String home) {
        super(name, averageAge, averageWeight);
        this.home = home;
    }

    public String getHome() {
        return "I live in a flat with my owner.";
    }

    @Override
    public void voice() {
        System.out.println("Domestic cats can purr and meow)))");
    }

    @Override
    public void description() {
        System.out.println("I'm a little cat and I come from cat-like carnivores." + " " + getHome());
    }
}
