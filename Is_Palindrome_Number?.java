import java.util.Scanner;
class palin
{   public static int Pal(int n)
    { int d=0,r;
       int s=n;
      while(n!=0)
      { r=n%10;
        d=10*d+r;
        n=n/10;
      }
      if(d==s)
      return(2);
      else
      return(1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(25000>=n)
        System.out.print(Pal(n));
        else
        System.out.print(Pal(n));
    }
}