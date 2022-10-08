import java.util.Scanner;
class r
{
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
      int c=0;
      int n=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      for(int j=0;j<n;j++)
      {if(a[j]%2!=0)
        c=c+1;
      }
      if(c<3)
      System.out.print("YES");
      else
      System.out.print("NO");
        
    }
}