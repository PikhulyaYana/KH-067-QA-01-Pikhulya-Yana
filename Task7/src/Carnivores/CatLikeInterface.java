package Carnivores;

public interface CatLikeInterface {
    default void classification() {
        System.out.println("I'm a mammal in the order Carnivora.");
    }

    void habitat();

    void food();

}
