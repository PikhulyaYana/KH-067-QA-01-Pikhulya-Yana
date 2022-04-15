import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        String name = "What is your name?";
        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();
        String address = "Where do you live, " + inputName + "?";
        System.out.println(address);
        String inputAddress = sc.nextLine();
        System.out.println(inputName + " lives in " + inputAddress + " :)");
    }
}


// There's one more variant of this task below:

//import java.util.Scanner;
//
//public class FirstClass {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = sc.nextLine();
//        System.out.println("Where do you live, " + name + "?");
//        String address = sc.nextLine();
//        System.out.println(name + " lives in " + address + " :)");
//    }
//}

