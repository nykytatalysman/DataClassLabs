import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File file = new File(System.getProperty("user.home") + "/Desktop/hamlet.txt");
            Scanner scanner = new Scanner(file);
            Set<String> words = new TreeSet<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    words.add(word);
                }
            }
            scanner.close();
            for (String word : words) {
                System.out.println(word);
            }
            System.out.println("Number of unique words: " + words.size());
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}