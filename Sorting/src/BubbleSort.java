import java.util.*;

public class BubbleSort {
    
    public static void bubblesort() {
        List<Integer> bsort = new ArrayList<>();
        bsort.add(55);
        bsort.add(7);
        bsort.add(22);
        bsort.add(1);
        bsort.add(79);
        bsort.add(2700);
        bsort.add(30);
        System.out.println(bsort);

        // Ascending order
        boolean flag0 = false;
        int temp0;
        while(!flag0) {
            flag0 = true;
            for (int i = 0; i < bsort.size() - 1; i++) {
                if (bsort.get(i) > bsort.get(i + 1)) {
                    temp0 = bsort.get(i);
                    bsort.set(i, bsort.get(i + 1));
                    bsort.set(i + 1, temp0);
                    flag0 = false;
                }
            }
        }
        System.out.println(bsort);

        // Descendning order
        boolean flag1 = false;
        int temp1;
        while(!flag1) {
            flag1 = true;
            for (int i = 0; i < bsort.size() - 1; i++) {
                if (bsort.get(i) < bsort.get(i + 1)) {
                    temp1 = bsort.get(i);
                    bsort.set(i, bsort.get(i + 1));
                    bsort.set(i + 1, temp1);
                    flag1 = false;
                }
            }
        }
        System.out.println(bsort);
    }
}
