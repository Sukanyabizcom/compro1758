
package th.ac.nu.student.u54341758.compro.ch02;
import java.util.Scanner;

public class Volume2 {
    public static void main(String [] args){
        final double BOTTLE_VOLUME = 2;
        final double LITER_PER_OUNCE = 0.0296;
        final double CAN_VOLUME = 12 * LITER_PER_OUNCE;
        System.out.print("Please enter the number of bottles: ");
        Scanner in = new Scanner(System.in);
        int bottles = in.nextInt();
        double totalVolume = bottles * BOTTLE_VOLUME;
        System.out.print("Please enter the number of cans: ");
        int cans = in.nextInt();
        double additionalVolume = cans * CAN_VOLUME;
        totalVolume = totalVolume + additionalVolume;
        System.out.print("Total volume: ");
        System.out.println(totalVolume);
    }
}
