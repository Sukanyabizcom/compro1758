
package th.ac.nu.student.u54341758.compro.ch02;

public class AssignmentOperator {
    public static void main(String[] args) {
    int x, y, z;
    x = y = z = 1;
    System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    x = (y = (z = z + 1) + 1) + 1;
    System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    x = (y = 1) + (z = 1);
    System.out.println("x = " + x + ", y = " + y + ", z = " + z);
}
 }

