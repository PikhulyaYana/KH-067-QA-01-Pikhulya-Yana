import java.util.Scanner;

public class FourthClass {
    public static void main(String[] args) {
        System.out.println("Please enter 4 words separated by commas.");
        Scanner sc = new Scanner(System.in);
        String inputWords = "";
        while (true) {
            inputWords = sc.nextLine();
            if (inputWords.isEmpty()) {
                System.out.println("Input words");
            } else {
                String[] words = inputWords.split(",");
                while (true) {
                    System.out.println("Choose what do you want to do next and enter the number \n1 - maximum length\n2 - start with\n3 - end with\n4 - contains\n0 exit\n");
                    if (sc.hasNextInt()) {
                        int num = sc.nextInt();
                        sc.nextLine();
                        switch (num) {
                            case 1:
                                System.out.println("Please enter max quantity of letters for words you want to see.");
                                int qntLetters = sc.nextInt();

                                for (String word : words) {
                                    if (word.length() <= qntLetters) {
                                        System.out.println("Result: " + word);
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Please enter first letters of words you want to see.");
                                String firstLetters = sc.nextLine();
                                for (String word : words) {
                                    if (word.startsWith(firstLetters)) {
                                        System.out.println("Result: " + word);
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Please enter last letters of words you want to see.");
                                String lastLetters = sc.nextLine();
                                for (String word : words) {
                                    if (word.endsWith(lastLetters)) {
                                        System.out.println("Result: " + word);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Please enter letters which words should contain.");
                                String containLetters = sc.nextLine();
                                for (String word : words) {
                                    if (word.contains(containLetters)) {
                                        System.out.println("Result: " + word);
                                    }
                                }
                                break;
                            case 0:
                                System.out.println("You're leaving.");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Your input isn't correct.");
                                break;
                        }

                    }
                }
            }
        }
    }
}

