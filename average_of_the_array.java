import java.util.Scanner;
class max
{
    public static void main(String arg[])
    {   int t=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
         ar[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            t=t+ar[i];
        }
        float av=(float)t/n;
        System.out.format("%.2f",av);   
        
    }
}