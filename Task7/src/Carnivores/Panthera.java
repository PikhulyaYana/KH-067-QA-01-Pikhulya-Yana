package Carnivores;

public class Panthera extends BigCats implements BigCatsFam {
    public Panthera(String name, int averageAge, int averageWeight) {
        super(name, averageAge, averageWeight);
    }

    @Override
    public void voice() {
        System.out.println("Panthera roars like: ffrrraaauuu!");
    }

    @Override
    public void description() {
        System.out.println("I'm a Big cat and I come from cat-like carnivores." + " " + getDifference());
    }

    @Override
    public void subspecies() {
        System.out.println("My family consists of Panther,Neofelis and Uncia.");
    }

    @Override
    public void structureOfThroat() {
        System.out.println("The structure of my throat allows me to roar.");
    }
}

