import java.util.*;

public class Collectionsearch {

    public void collectionsearch() {
        List<Integer> CBsearch = new ArrayList<>();
        CBsearch.add(55);
        CBsearch.add(7);
        CBsearch.add(22);
        CBsearch.add(1);
        CBsearch.add(79);
        CBsearch.add(2700);
        CBsearch.add(30);
        System.out.println(CBsearch);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter element to search: ");
            int elementToSearch = scanner.nextInt();
            scanner.close();

            int elePosition = Collections.binarySearch(CBsearch, elementToSearch);

            if (elePosition >= 0) {
                System.out.println("Position of Element: " + (elePosition + 1));
            } else {
                System.out.println("Entered Element Not Present!");
            }
        }
    }
}
