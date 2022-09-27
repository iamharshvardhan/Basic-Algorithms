import java.util.*;

public class Mergesort {

    // public static void conquer(List<Integer> arraylist, int sI, int mid, int eI) {
    //     List<Integer> sortedList = new ArrayList<>();

    //     int id1 = sI;
    //     int id2 = mid + 1;
    //     int x = 0;

    //     while (id1 <= mid && id2 <= eI) {
    //         if (arraylist.get(id1) <= arraylist.get(id2)) {
    //             sortedList.set(x, arraylist.get(id1));
    //             x++;
    //             id1++;
    //         } else {
    //             sortedList.set(x, arraylist.get(id2));
    //             x++;
    //             id2++;
    //         }
    //     }
    //     while (id1 <= mid) {
    //         sortedList.set(x++, arraylist.get(id1++));
    //     }

    //     while (id2 <= eI) {
    //         sortedList.set(x++, arraylist.get(id2++));
    //     }

    //     for (int i = 0, j = sI; i < sortedList.size(); i++, j++) {
    //         arraylist.set(j, sortedList.get(i));
    //     }
    // }

    public static void conquer(ArrayList<Integer> arraylist, int low, int mid, int high) {
        ArrayList<Integer> sortedList = new ArrayList<>();
        int i = low;
        int j = mid + 1;
        int k = low;

        while (j <= mid && j <= high) {
            if (arraylist.get(i) < arraylist.get(j)) {
                sortedList.set(k, arraylist.get(i));
                i++;
            } else {
                sortedList.set(k, arraylist.get(j));
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= high) {
                sortedList.set(k, arraylist.get(j));
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                sortedList.set(k, arraylist.get(i));
                i++;
                k++;
            }
        }
        for (k = low; k <= high; k++) {
            arraylist.set(k, sortedList.get(k));
        }
    }
    
    public static void divide(ArrayList<Integer> arraylist, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            divide(arraylist, low, mid);
            divide(arraylist, mid + 1, high);
            conquer(arraylist, low, mid, high);
        }
    }

    public static void mergesort() {
        ArrayList<Integer> msort = new ArrayList<>();
        msort.add(55);
        msort.add(7);
        msort.add(22);
        msort.add(1);
        msort.add(79);
        msort.add(7132);
        msort.add(30);
        msort.add(121);
        System.out.println(msort);

        int n = msort.size();
        System.out.println(msort);
        divide(msort, 0, n - 1);
        System.out.println(msort);
    }
}
