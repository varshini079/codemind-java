import java.util.Scanner;
class Temp
{
    public static void main(String args[])
    { int f,c;
      Scanner sc=new Scanner(System.in);
      c=sc.nextInt();
      f=(c*(c-1))/2;
      System.out.println(f);
      sc.close();
        
    }
}