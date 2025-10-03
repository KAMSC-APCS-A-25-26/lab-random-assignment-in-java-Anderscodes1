import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Unseeded Die 1: " + ((int)(Math.random() * 6 + 1)));
        System.out.println("Unseeded Die 2: " + ((int)(Math.random() * 6 + 1)));
        System.out.println("Unseeded Die 3: " + ((int)(Math.random() * 6 + 1)));

        Random rand1 = new Random(923764);
        System.out.println("Seeded Die: " + ((rand1.nextInt(6) + 1)));
    }
}
