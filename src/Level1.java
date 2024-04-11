public class Level1 {
    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        if (H1 < H2 || W1 < W2) return false;

        String[] words = S2.split(" ");

        for (String word : words) {
            if (S1.contains(word)) continue;
            else return false;
        }
        return true;
    }
}

