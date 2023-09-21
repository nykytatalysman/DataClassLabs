import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashTreeImplementation {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Kay");
        hs.add("Jay");
        hs.add("May");
        hs.add("Fay");
        hs.add("May");

        // Display names using an iterator
        System.out.println("HashSet contents:");
        Iterator<String> hsIterator = hs.iterator();
        while (hsIterator.hasNext()) {
            System.out.println(hsIterator.next());
        }


        TreeSet<String> ts = new TreeSet<>();
        ts.add("Kay");
        ts.add("Jay");
        ts.add("May");
        ts.add("Fay");
        ts.add("May");

        // Display names using an iterator
        System.out.println("\nTreeSet contents:");
        Iterator<String> tsIterator = ts.iterator();
        while (tsIterator.hasNext()) {
            System.out.println(tsIterator.next());
        }
    }
}