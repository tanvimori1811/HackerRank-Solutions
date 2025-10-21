import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return canWinFrom(0, leap, game);
    }

    private static boolean canWinFrom(int i, int leap, int[] game) {
        if (i >= game.length) return true;
        if (i < 0 || game[i] != 0) return false;

        game[i] = 1;

        return canWinFrom(i + leap, leap, game)
            || canWinFrom(i + 1, leap, game)
            || canWinFrom(i - 1, leap, game);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int t = 0; t < q; t++) {
            int n = sc.nextInt();
            int leap = sc.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = sc.nextInt();
            }
            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }

        sc.close();
    }
}
