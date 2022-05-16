package Carnivores;

public class Main {
    public static void main(String[] args) {
        Panthera panthera1 = new Panthera("Nona", 22, 300);
        panthera1.aboutMe();
        panthera1.description();
        panthera1.classification();
        panthera1.habitat();
        panthera1.food();
        panthera1.spotsOnHair();
        panthera1.subspecies();
        panthera1.structureOfThroat();
        panthera1.voice();
        System.out.println("&");
        DomesticCat domesticCat1 = new DomesticCat("Archi", 5, 4);
        domesticCat1.aboutMe();
        domesticCat1.description();
        domesticCat1.voice();
    }
}
