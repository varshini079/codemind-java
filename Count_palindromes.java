import java.util.Scanner;
class palin
{   public static boolean Pal(int n)
    { int d=0,r;
       int s=n;
      while(n>0)
      { r=n%10;
        d=10*d+r;
        n=n/10;
      }
      if(d==s)
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
        for(int j=0;j<n;j++)
        if(Pal(ar[j]))
        c=c+1;
        System.out.print(c);
        
    }
}