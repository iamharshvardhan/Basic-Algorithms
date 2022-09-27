import java.util.*;

public class Binarysearch {

    public static Integer searchRecursive(List<Integer> arraylist, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (key == arraylist.get(mid)) {
            return mid + 1;
        } else if (key > arraylist.get(mid)) {
            return searchRecursive(arraylist, key, mid + 1, high);
        } else {
            return searchRecursive(arraylist, key, low, mid);
        }
    }

    public static Integer searchIterative(List<Integer> arraylist, int key) {
        int low = 0, high = arraylist.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arraylist.get(mid) == key) {
                return mid + 1;
            } else if (key > arraylist.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    public void binarysearch() {
        List<Integer> Bsearch = new ArrayList<>();;
        Bsearch.add(505);
        Bsearch.add(7);
        Bsearch.add(252);
        Bsearch.add(1);
        Bsearch.add(709);
        Bsearch.add(3430);
        Bsearch.add(30);

        Collections.sort(Bsearch, Comparator.naturalOrder());
        System.out.println(Bsearch);

        // Iterative Binary Searching
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the element to search: ");
            int elementToSearch = scanner.nextInt();
            scanner.close();

            int position = searchIterative(Bsearch, elementToSearch);
            if (position > 0) {
                System.out.println("Element found at position: " + position);
            } else {
                System.out.println("Element not found");
            }
        }

        // Recursive Binary Searching
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the element to search: ");
            int elementToSearch = scanner.nextInt();
            scanner.close();

            int n = Bsearch.size() - 1;
            int position = searchRecursive(Bsearch, elementToSearch, 0, n);
            if (position > 0) {
                System.out.println("Element found at position: " + position);
            } else {
                System.out.println("Element not found");
            }
        }
    }
}
