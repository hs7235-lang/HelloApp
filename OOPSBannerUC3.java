public class OOPSBannerUC3 {

    public static void printLetter(String[] letter) {
        for (String line : letter) {
            System.out.println(line);
        }
        System.out.println(); // Space between letters
    }

    public static void main(String[] args) {

        // Define each letter as a String array
        String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };

        String[] P = {
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
        };

        String[] S = {
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };

        // Print the banner letters in sequence: O O P S
        printLetter(O);
        printLetter(O);
        printLetter(P);
        printLetter(S);
    }
}