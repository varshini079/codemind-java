import java.util.Scanner;
class max
{
    public static void main(String arg[])
    {   Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=0;
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
         ar[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            t=t+ar[i];
        }
        int c=0;
        float av=(float)t/n;
        int q=(int)av;
        
        for(int i=0;i<n;i++)
        {
            if(ar[i]==q)
            { System.out.print("True");
                break;
            }
            else
            c=c+1;
        }
        if(c==n)
        System.out.print("False");
    
    }
}