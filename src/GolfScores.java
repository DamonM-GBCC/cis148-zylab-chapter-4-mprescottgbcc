import java.util.Scanner;

public class GolfScores {


    public String golfScore(int strokes, int par) {

        if (par < 3 || par > 5) {
            return "Error";
        }
        else if (strokes == par - 2) {
            return "Eagle";
        }
        else if (strokes == par - 1) {
            return "Birdie";
        }
        else if (strokes == par) {
            return "Par";
        }
        else if (strokes == par + 1) {
            return "Bogey";
        }
        else {
            return "Error";
        }
    }


    public static void main(String[] args) {
        GolfScores score = new GolfScores();
        Scanner scnr = new Scanner(System.in);
        int par;
        int strokes;
        String name;

        strokes = scnr.nextInt();
        par = scnr.nextInt();

        name = score.golfScore(strokes, par);

        System.out.println(name);
    }
}
