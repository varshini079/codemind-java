import java.util.Scanner;
class max
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
         ar[i]=sc.nextInt();
        int c=ar[0];
        for(int j=1;j<n;j++)
         {if(ar[j]>c)
         c=ar[j];
         }
         System.out.print(c);
    }
}