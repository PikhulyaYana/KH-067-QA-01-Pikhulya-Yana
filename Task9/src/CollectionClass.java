import java.util.*;

public class CollectionClass {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        System.out.println(animals.isEmpty());
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        animals.add("dog");
        System.out.println(animals.size());
        animals.remove(1);
        System.out.println(animals);
        System.out.println(animals.contains("Dog"));
        System.out.println(animals.get(1));
        animals.set(0,"lion");
        System.out.println(animals);
        animals.clear();
        System.out.println(animals);
        System.out.println("-------&-------");

        Set<String> setAnimals = new HashSet<>();
        setAnimals.add("cat");
        setAnimals.add("dog");
        setAnimals.add("rabbit");
        setAnimals.add("lion");
        System.out.println(setAnimals);
        System.out.println(setAnimals.contains("tiger"));
        setAnimals.remove("rabbit");
        System.out.println(setAnimals);
        setAnimals.clear();
        System.out.println(setAnimals.isEmpty());
        System.out.println(setAnimals.size());
        System.out.println("-------&-------");

        Queue<String> animalsQueue = new ArrayDeque<>();
        animalsQueue.add("cat");
        animalsQueue.add("dog");
        animalsQueue.offer("rabbit");
        animalsQueue.offer("lion");
        System.out.println(animalsQueue);
        System.out.println(animalsQueue.element());
        animalsQueue.remove();
        System.out.println(animalsQueue);
        System.out.println(animalsQueue.peek());
        animalsQueue.clear();
        System.out.println(animalsQueue.poll());
        System.out.println("-------&-------");

        Map<String, String> mapAnimals = new HashMap<>();
        System.out.println(mapAnimals.isEmpty());
        mapAnimals.put("cat", "milk");
        mapAnimals.put("dog", "pedigree");
        mapAnimals.put("rabbit", "carrot");
        mapAnimals.put("lion", "meat");
        System.out.println(mapAnimals.size());
        System.out.println(mapAnimals.get("cat"));
        System.out.println(mapAnimals.get("cow"));
        System.out.println(mapAnimals.remove("rabbit"));
        System.out.println(mapAnimals.remove("dog","pedigree"));
        System.out.println(mapAnimals);
        System.out.println(mapAnimals.containsKey("lion"));
        System.out.println(mapAnimals.containsValue("banana"));
        Set<String> strings = mapAnimals.keySet();
        System.out.println(strings);
        Collection<String> strings1 = mapAnimals.values();
        System.out.println(strings1);
    }
}
