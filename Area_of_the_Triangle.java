import java.util.Scanner;
class ar
{
    public static void main(String args[])
    {   
        float a,b,c;
        double s,ar;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(a+b+c)/2;
        ar=Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
        System.out.format("%.2f",ar);
    }
}