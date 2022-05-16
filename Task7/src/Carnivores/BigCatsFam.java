package Carnivores;

public interface BigCatsFam {
    default void spotsOnHair() {
        System.out.println("My distinctive feature is different-shaped spots on hair.");
    }

    void subspecies();

    void structureOfThroat();

    String DIFFERENCE = "I'm a wild animal and can't live like a pet at home.";

    default String getDifference() {
        return DIFFERENCE;
    }

}
