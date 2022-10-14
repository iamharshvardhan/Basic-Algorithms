import java.util.*;

public class Quicksort {

    public static Integer paritition(ArrayList<Integer> arraylist, int low, int high) {
        int pivot = arraylist.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arraylist.get(i) <= pivot) { i++; }
            while (arraylist.get(j) > pivot) { j--; }
            if (i < j) {
                int temp = arraylist.get(i);
                arraylist.set(i, arraylist.get(j));
                arraylist.set(j, temp);
            }
        }
        int temp = arraylist.get(low);
        arraylist.set(low, arraylist.get(j));
        arraylist.set(j, temp);
        return j;
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> arraylist, int low, int high) {
        if (low < high) {
            int pivot = paritition(arraylist, low, high);
            sort(arraylist, low, pivot - 1);
            sort(arraylist, pivot + 1, high);
        }
        return arraylist;
    }

    public static void quicksort() {
        ArrayList<Integer> qsort = new ArrayList<Integer>();
        qsort.add(55);
        qsort.add(7);
        qsort.add(202);
        qsort.add(1);
        qsort.add(795);
        qsort.add(23110);
        qsort.add(30);
        qsort.add(121);
        System.out.println(qsort);
        
        int n = qsort.size();
        sort(qsort, 0, n - 1);
        System.out.println(qsort);
    }
}
