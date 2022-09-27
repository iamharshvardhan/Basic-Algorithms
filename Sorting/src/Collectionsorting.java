import java.util.*;

public class Collectionsorting {
    
    public static void collectionsorting() {
        List<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(17);
        arr1.add(1);
        arr1.add(35);
        arr1.add(2);
        arr1.add(1172);
        arr1.add(4);
        arr1.add(25);
        arr1.add(530);
        System.out.println(arr1);

        Collections.sort(arr1, Comparator.naturalOrder());  // ascending order
        System.out.println(arr1);

        Collections.sort(arr1, Comparator.reverseOrder());  // descending order
        System.out.println(arr1);
    }
}
