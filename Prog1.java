import java.util.Random;

public class Prog1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt((9 - 1) + 1) + 1;
        double pi = Math.PI;
        System.out.printf("%.2f\n", Math.pow(pi,randomNum));
        int randomNum2 = rand.nextInt((14 - 3) + 1) + 3;
        System.out.printf("%.2f", Math.pow(pi,randomNum2));
    }
}
