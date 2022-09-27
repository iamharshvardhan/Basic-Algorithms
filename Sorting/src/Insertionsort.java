import java.util.*;

public class Insertionsort {
    
    public static void insertionsort() {
        List<Integer> isort = new ArrayList<>();
        isort.add(55);
        isort.add(7);
        isort.add(22);
        isort.add(1);
        isort.add(79);
        isort.add(1500);
        isort.add(30);
        System.out.println(isort);

        // Ascending order
        for (int i = 0; i < isort.size(); i++) {
            int current = isort.get(i);
            int j = i - 1;
            while(j >= 0 && current < isort.get(j)) {
                isort.set(j + 1, isort.get(j));
                j--;
            }
            isort.set(j + 1, current);
        }
        System.out.println(isort);

        // Descending order
        for (int i = 0; i < isort.size(); i++) {
            int current = isort.get(i);
            int j = i - 1;
            while(j >= 0 && current > isort.get(j)) {
                isort.set(j + 1, isort.get(j));
                j--;
            }
            isort.set(j + 1, current);
        }
        System.out.println(isort);
    }
}
