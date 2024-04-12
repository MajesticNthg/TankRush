import java.util.ArrayList;
import java.util.List;

public class Level1 {
    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        if (H1 < H2 || W1 < W2) return false;

        ArrayList<String> tanks = new ArrayList<>(List.of(S2.split(" ")));
        String[] art = S1.split(" ");

        int x = 0;
        int y = 0;
        int endIndex = 0;
        for (x = 0; x < H1; x++){
            StringBuilder stringArt = new StringBuilder();
            stringArt.insert(0, art[x]);
            int startIndex = 0;
            while ((startIndex = stringArt.indexOf(tanks.get(y), startIndex)) != -1) {
                endIndex = startIndex + H2;
                if (coincidence(H1, H2, x, startIndex, y, art, tanks)) return true;
                else {
                    startIndex = endIndex;
                }
            }
        }

        return false;
    }

    public static boolean coincidence (int H1, int H2, int x, int startIndex, int y, String[] art,  ArrayList<String> tanks) {
        if (x + H2 > H1) return false;
        for (int z = x; z <= H2; z++, y++) {
            StringBuilder string = new StringBuilder();
            string.insert(0, art[z]);
            string.delete(0, startIndex);
            if (string.toString().contains(tanks.get(y)) && string.toString().indexOf(tanks.get(y)) == 0) continue;
            else
                return false;
            }
        return true;
        }
}


