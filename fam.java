import java.util.List;
import java.util.LinkedList;

public class fam {
    private static record Parent(String name, List<String> offspring) {};
    private static List<Parent> parents = new LinkedList<>();
    private static List<String> females = new LinkedList<>();

    private static boolean isSibling(String one, String two) {
        for (Parent parent : parents) {
            if (parent.offspring.contains(one)  &&
                parent.offspring.contains(two) && 
                !one.equals(two)) {
                return(true);
            }
        }
        return (false);
    }
    public static void main (String... args) {
        List<String> spawn = new LinkedList<>();
        spawn.add("mike");
        spawn.add("steve");
        spawn.add("brenda");
        parents.add(new Parent("dave", spawn));

        females.add("brenda");

        System.out.println(isSibling("mike", "steve"));
        System.out.println(isSibling("mike", "brenda"));
        System.out.println(isSibling("mike", "bob"));
        System.out.println(isSibling("mike", "mike"));
    }
}
