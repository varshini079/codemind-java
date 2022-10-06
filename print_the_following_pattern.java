import java.util.Scanner;
class max
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=n;i>=1;i--)
         {  
             for(int j=1;j<=i;j++)
         {
             System.out.print(j);
         }
         System.out.println( );
             
         }
    }
}