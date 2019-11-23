
package quotienwithexception.java;
import java.util.*;
public class QuotienWithExceptionJava {
    public static int quoient(int number1 , int number2){
        if(number2==0)  /*number2为零，在这里抛出一个异常 */
            throw new ArithmeticException("Disvor cannot be zero");
            return number1 / number2;
        }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter two integer :");
       int number1 = input.nextInt();
       int number2 = input.nextInt();
       try{
           int result = quoient(number1,number2); /*main函数调用quoient,如果quoient方法遇到一个异常，它就会抛出一个异常给它的调用者，就是catch块处理该异常*/
           System.out.println(number1 + " / " + number2 +  " is " +  result );
       }
       catch(ArithmeticException ex){
           System.out.println("Exception : an integer"+ "cannot be divied by zero");
       }
       System.out.println("Execution continues....");
    }
    
}
