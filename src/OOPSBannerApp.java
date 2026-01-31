public class OOPSBannerApp {

    static void printBanner(String[] banner) {
        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        String[] banner = {
                " OOOOO  OOOOO  PPPPP  SSSSS ",
                "O     O O     O P    P S     ",
                "O     O O     O PPPPP   SSSS ",
                "O     O O     O P           S",
                " OOOOO  OOOOO  P       SSSSS "
        };

        printBanner(banner);
    }
}
