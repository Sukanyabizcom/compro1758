
package th.ac.nu.student.u54341758.compro.ch02;

public class IntegerRage {
    public static void main(String[] args) {
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    System.out.println("Overflow:");
    System.out.println(max); 
    System.out.println(max + 1);
    System.out.println(max + 2);
    System.out.println("Unceerflow:");
    System.out.println(min);
    System.out.println(max - 1);
    System.out.println(max - 2); 
}
}

