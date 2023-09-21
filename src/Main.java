import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addLast("Kay");
        ll.addLast("Jay");
        ll.addLast("May");
        ll.addLast("Fay");

        ListIterator<String> llIterator = ll.listIterator();

        while (llIterator.hasNext()) {
            String name = llIterator.next();
            if (name.equals("May")) {
                llIterator.add("Ray");
            } else if (name.equals("Jay")) {
                llIterator.remove();
            }
        }

        System.out.println("LinkedList contents: " + ll);
        System.out.println("Names from the beginning of the list:");
        llIterator = ll.listIterator();
        while (llIterator.hasNext()) {
            System.out.println(llIterator.next());
        }
        System.out.println("\nNames from the end of the list:");
        while (llIterator.hasPrevious()) {
            System.out.println(llIterator.previous());
        }

        ll.addLast("Kay");
        System.out.println("\nLinkedList contents with duplicates: " + ll);
        System.out.println("Names from the beginning of the list with duplicates:");
        llIterator = ll.listIterator();
        while (llIterator.hasNext()) {
            System.out.println(llIterator.next());
        }
    }
}