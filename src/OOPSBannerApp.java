import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static Map<String, String[]> banners = new HashMap<>();

    static {
        banners.put("OOPS", new String[]{
                " OOOOO  OOOOO  PPPPP  SSSSS ",
                "O     O O     O P    P S     ",
                "O     O O     O PPPPP   SSSS ",
                "O     O O     O P           S",
                " OOOOO  OOOOO  P       SSSSS "
        });
    }

    static void printBanner(String key) {
        for (String line : banners.get(key)) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}
