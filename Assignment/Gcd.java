import java.util.*;
class Gcd
{
   public  int Gcd (int number1, int number2) {
      if (number2 == 0) {
         return number1;
      }
      return Gcd (number2, number1 % number2);
   }
}
public class main
{
   public static void main(String[] args) {
      int number_1 = 36;
      int number_2 = 24;
      Gcd gcdObject =  new Gcd();
      int gcd = gcdObject.Gcd(number_1, number_2);
      System.out.println("G.c.d of "+" "+number_1+" & "+number_2 +" is: "+gcd);
      int lcm = (number_1 * number_2) / gcd;
      System.out.println("L.C.M of "+" "+number_1+" & "+number_2 +" is: "+lcm);
   }
}