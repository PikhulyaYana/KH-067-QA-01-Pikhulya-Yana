package Carnivores;

public class Main {
    public static void main(String[] args) {
        Panthera panthera1 = new Panthera("Nona", 22, 300);
        panthera1.description();
        System.out.println(panthera1.aboutMe());
        panthera1.voice();

        DomesticCat domesticCat1 = new DomesticCat("Archi", 5, 4);
        domesticCat1.description();
        System.out.println(domesticCat1.aboutMe());
        domesticCat1.voice();
    }
}