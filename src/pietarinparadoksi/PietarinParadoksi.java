package pietarinparadoksi;

import java.util.Random;

/**
 *
 * @author Lauri K
 */
public class PietarinParadoksi {

    private static long sum;

    public static void main(String[] args) {
        System.out.println(collector(10000000));
    }

    /*
    2^k ja rekursio; 2^20 = 1048576
     */
    public static int calc(int k) {
        int newk = k;
        if (chance()) {
            newk = calc((k * 2));
        }
        if (newk > 1048576) {
            return 1048576;
        } else {
            return newk;
        }
    }

    /*
    Kruuna vai klaava
     */
    public static boolean chance() {
        Random random = new Random();
        return (random.nextInt(2) <= 0.5);
    }

    /*
    Toisto
    */
    public static double collector(int repeated) {
        for (int i = 0; i < repeated; i++) {
            sum += calc(2);
        }
        return sum / repeated;
    }

}
