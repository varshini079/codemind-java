import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        float x,y;
        float d;
        Scanner sc=new Scanner(System.in);
        x=sc.nextFloat();
        y=sc.nextFloat();
        d=(x+y)/2;
        System.out.format("%.4f",d);
    }
}