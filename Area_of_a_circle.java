import java.util.Scanner;
class area
{
    public static void main(String args[])
   {
       int r;
       double i,a;
       Scanner sc=new Scanner(System.in);
       r=sc.nextInt();
       i=3.14*r*r;
       System.out.format("%.2f",i);
       sc.close();
   }
}