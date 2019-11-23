
package yeuiyi;
import java.util.*;
public class Yeuiyi {

    public static void main(String[] args) {
       boolean succ = false;
        System.out.print("Enter two Integer: ");
        Scanner input = new Scanner(System.in);
        while (!succ)
        {
            try
            {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(a + " + " + b + " = " + (a + b));
                succ = true;
            }
            catch (java.util.InputMismatchException ex)
            {
                System.out.print("Try again. Enter two Integer: ");
            }
            input.nextLine();
        }

    }
    
}
