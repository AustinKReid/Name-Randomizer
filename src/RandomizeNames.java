import java.util.*;

public class RandomizeNames {
    public static void main(String[] args) {
        int count = 0;
        List<String> names = Arrays.asList("name1", "name2");

        Collections.shuffle(names);

        System.out.println("Randomized Names:");
        for (String name : names) {
            count++;
            System.out.println(count + ". " + name);
        }
    }
}
