import java.util.Scanner;
class div
{
    public static void main(String args[])
    {   float a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=a*b;
        System.out.format("%.2f",c);
        sc.close();
    }
}