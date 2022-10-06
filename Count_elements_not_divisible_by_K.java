import java.util.Scanner;
class max
{
    public static void main(String arg[])
    {   Scanner sc=new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
         ar[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        { if(ar[i]%k!=0)
            c=c+1;
        }
        System.out.print(c);
    }
}