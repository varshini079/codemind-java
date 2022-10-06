import java.util.Scanner;
class Array
{   
    public static void main(String args[])
    {   int c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        int k=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            if(ar[j]==k)
            c=c+1;
        }
        System.out.print(c);
        
    }
}