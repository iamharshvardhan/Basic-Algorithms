import java.util.*;

public class Selectionsort {
    
    public static void selectionsort() {
        List<Integer> slsort = new ArrayList<>();
        slsort.add(55);
        slsort.add(7);
        slsort.add(22);
        slsort.add(1);
        slsort.add(79);
        slsort.add(7034);
        slsort.add(30);
        System.out.println(slsort);

        // Ascending order
        for (int i = 0; i < slsort.size() - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < slsort.size(); j++) {
                if (slsort.get(smallest) > slsort.get(j)) {
                    smallest = j;
                }
            }
            int temp = slsort.get(smallest);
            slsort.set(smallest, slsort.get(i));
            slsort.set(i, temp);
        }
        System.out.println(slsort);

        // Descending order
        for (int i1 = 0; i1 < slsort.size() - 1; i1++) {
            int smallest1 = i1;
            for (int j1 = i1 + 1; j1 < slsort.size(); j1++) {
                if (slsort.get(smallest1) < slsort.get(j1)) {
                    smallest1 = j1;
                }
            }
            int temp = slsort.get(smallest1);
            slsort.set(smallest1, slsort.get(i1));
            slsort.set(i1, temp);
        }
        System.out.println(slsort);
    }
}
