
package lotteryusingstring;
        import java.util.*;
public class LotteryUsingString {
    public static void main(String[] args) {
      String lottery = "" + (int)(Math.random() *10) +(int)(Math.random() *10);
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your lottery pick (two digits) :");
      String guess = input.nextLine();
      char lotteryDigits1 = lottery.charAt(0);
      char lotteryDigits2 = lottery.charAt(1);
      char guessDigit1 = guess.charAt(0);
      char guessDigit2 = guess.charAt(1);
      System.out.println("The lottery number is " + lottery);
      if(guess.equals(lottery))
          System.out.println("Exact match :you win 20000RMB");
      else if(guessDigit2 == lotteryDigits1 && guessDigit1 == lotteryDigits2 )
          System.out.println("Match all digits: you win 10000RMB");
      else if(guessDigit1 == lotteryDigits1 ||guessDigit1 == lotteryDigits2 || guessDigit2 == lotteryDigits1 || guessDigit2 == lotteryDigits2 )
          System.out.println("Match one digits : you win 200RMB");
      else
          System.out.println("sorry,no match,welcome to try again!");    
    }
    
}
