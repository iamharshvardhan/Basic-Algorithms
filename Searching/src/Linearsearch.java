import java.util.*;

public class Linearsearch {

    public void linearsearch() {
        List<Integer> Lsearch = new ArrayList<>();
        Lsearch.add(55);
        Lsearch.add(7);
        Lsearch.add(22);
        Lsearch.add(1);
        Lsearch.add(79);
        Lsearch.add(2700);
        Lsearch.add(30);
        System.out.println(Lsearch);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int elementToSearch = scanner.nextInt();
        int elePosition = 0;
        for (int i = 0; i < Lsearch.size(); i++) {
            if (elementToSearch == Lsearch.get(i)) {
                elePosition = i;
            }
        }
        if (elePosition <= 0) {
            System.out.println("Entered Element not Present!");
        } else {
            System.out.println("Position of Element: " + (elePosition + 1));
        }
        scanner.close();
    }
}
