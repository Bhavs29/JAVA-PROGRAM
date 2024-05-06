import java.io.Console;
class read
{
public static void main(String args[])
{
Console c=System.console();
System.out.println("Enter your name");
String n=c.readLine();
System.out.println("enter your password:");
char[] ch=c.readPassword();
String pass=String.valueOf(ch);
System.out.println(n);
System.out.println(password is:"+pass);
}
}