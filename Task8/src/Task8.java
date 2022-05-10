import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task8 {

    static void sortList(List<String> stringList) {
        System.out.println(stringList);
    }

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("APPLE");
        fruits.add("Pear");
        fruits.add("figs");
        fruits.add("Lemon");
        fruits.add("watermelon");
        fruits.add("Apricot");
        fruits.add("grapes");
        fruits.add("Banana");
        Collections.sort(fruits, String.CASE_INSENSITIVE_ORDER);

        sortList(fruits);
    }

}
