import java.util.Scanner;
class Temp
{
    public static void main(String args[])
    { double f,c;
      Scanner sc=new Scanner(System.in);
      c=sc.nextFloat();
      f=32+(c*(1.8));
      System.out.format("%.2f",f);
      sc.close();
        
    }
}