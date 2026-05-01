import java.util.*;

public class SubsetsExample {

    public static void main(String[] args) {
        int[] arr = {1, 2};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, 0, new ArrayList<>(), result);

        System.out.println(result);
    }

    static void backtrack(int[] arr, int index,
                          List<Integer> current,
                          List<List<Integer>> result) {

        if (index == arr.length) {
            result.add(new ArrayList<>(current)); // copy
            return;
        }

        // INCLUDE
        current.add(arr[index]);
        backtrack(arr, index + 1, current, result);

        // UNDO (Backtrack)
        current.remove(current.size() - 1);

        // EXCLUDE
        backtrack(arr, index + 1, current, result);
    }
}
