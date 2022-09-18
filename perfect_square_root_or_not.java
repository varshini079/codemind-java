import java.util.Scanner;
class square
{
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        int n,i;
        double t;
        n=sc.nextInt();
        t=Math.pow(n,0.5);
        if((float) t -(int)t>0)
        System.out.println("False");
        else
        System.out.println("True");
    }
}