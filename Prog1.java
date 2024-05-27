import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Prog1 {
    public static void main(String[] args) {
        // Create a RandomGenerator instance
        RandomGenerator randomGenerator = RandomGeneratorFactory.of("L32X64MixRandom").create();
        int randomNum = randomGenerator.nextInt(1, 9);
        double pi = Math.PI;

        System.out.printf("%.2f\n", Math.pow(pi,randomNum));
        int randomNum2 = randomGenerator.nextInt(3, 14);
        System.out.printf("%.2f", Math.pow(pi,randomNum2));
    }
}
