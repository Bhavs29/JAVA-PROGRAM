import java.io.*;

clas Ternary
{
   public static void main(String[] args)
  {

    // variable declaration
    int n1 = 5, n2 = 10, res;

    System.out.println("first num: " + n1);
    System.out.println("fecond num: " + n2);

    // Performing Ternary operation
    res = (n1 > n2) ? (n1 + n2) : (n1 - n2);

    // Print the largest number 
    System.out.println("result = " + res);
   }
}