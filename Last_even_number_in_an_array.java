import java.util.Scanner;
class Array
{   public static boolean arr(int n)
    { 
      if(n%2==0)
      return(true);
      else
      return(false);
    }
    public static void main(String args[])
    {  int c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        for(int j=n-1;j<n;j--)
        {if(arr(ar[j]))
        {System.out.print(ar[j]);
         break;
        }
        }
        
    }
}