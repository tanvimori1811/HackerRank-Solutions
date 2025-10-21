import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxUnique = 0;

        for (int i = 0; i < N; i++) {
            if (freqMap.containsKey(arr[i])) {
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            } else {
                freqMap.put(arr[i], 1);
            }

            if (i >= M) {
                int removeElem = arr[i - M];
                int count = freqMap.get(removeElem) - 1;
                if (count == 0) {
                    freqMap.remove(removeElem);
                } else {
                    freqMap.put(removeElem, count);
                }
            }

            if (i >= M - 1) {
                maxUnique = Math.max(maxUnique, freqMap.size());
            }
        }

        System.out.println(maxUnique);
        scanner.close();
    }
}
