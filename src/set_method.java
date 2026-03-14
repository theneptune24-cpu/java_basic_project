import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class set_method {
    public static void main(String[] args){

        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        System.out.println("Set: " + set);
        System.out.println("Contains C: " + set.contains("C"));
        System.out.println("Size of set: " + set.size());

        // set algebra
        Set<String> b = new HashSet<>(List.of("A","B"));

        Set<String> union = new HashSet<>(set);
        union.addAll(b);
        System.out.println("Union: " + union);

        Set<String> intersection = new HashSet<>(set);
        intersection.retainAll(b);
        System.out.println("Intersection: " + intersection);

        Set<String> difference = new HashSet<>(set);
        difference.removeAll(b);
        System.out.println("Difference: " + difference);
    }
}
