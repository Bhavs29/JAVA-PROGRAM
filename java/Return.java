import java.io.*;
class Return
{
static int sum(int x,int y)
{
int sum=0;
sum=x+y;
return sum;
}
public static void main(String[] args)
{ 
int s=sum(2,3);
System.out.println(s);
}
}