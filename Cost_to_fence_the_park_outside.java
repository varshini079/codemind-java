import java.util.Scanner;
class max
{
    public static void main(String arg[])
    {   Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int w=sc.nextInt();
        int c=sc.nextInt();
        int t=(l+(2*w))*(b+(2*w))-(l*b);
        System.out.print(t*c);
    }
}