import java.util.*;

public class RandomizeNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("", "");

        Collections.shuffle(names);

        System.out.println("Randomized Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
