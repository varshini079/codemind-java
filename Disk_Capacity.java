import java.util.Scanner;
class disk
{
    public static void main(String args[])
    {
        int x,y,z,t;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        System.out.print(x*y*z*512*2);
    }
}