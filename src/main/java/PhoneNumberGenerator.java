import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        
        // area code
        int AH = rand.nextInt(8);
        int AT = rand.nextInt(8);
        int AO = rand.nextInt(8);
        int ac = AH * 100 + AT * 10 + AO;
        
        // exchange
        int e = rand.nextInt(743);
        
        // subscriber
        int s = rand.nextInt(1000);
        
        // output phone number
        System.out.print(ac + "-" + e + "-" + s);
    }
}
