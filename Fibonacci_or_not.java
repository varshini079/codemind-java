import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
    {
       int n,a=0,b=1,c=0,i;
        Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       while(c<n)
       {
           c=a+b;
           a=b;
           b=c;
       }
       if(c==n)
       {
           System.out.println("True");
       }
       else
       {
           System.out.println("False");
       }    
    }
}