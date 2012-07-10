
package th.ac.nu.student.u54341758.compro.ch02;

public class overflow {
   public static void main (String [] args){
       int oneThousand = 1000;
       int oneMillion = 1000 * oneThousand;
       int oneBillion = 1000 * oneMillion;
       System.out.println(3 * oneBillion);
   }
}
