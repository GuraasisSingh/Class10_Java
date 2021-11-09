import java.util.*;
class HaraasisKaur
{
    static void main()
    {
       int c;
       float ans=0.0f;
       float ans1=0.0f;
       float x;
       float n;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1 to add, 2 to subtract, 3 to multiply and 4 to divide");
       c =sc.nextInt();
       System.out.println("Enter two numbers");
        x=sc.nextFloat();
        n=sc.nextFloat();
       switch (c)
       {
           case 1:
           ans= x+n;
           break;
           case 2:
           ans= x-n;
           break;
           case 3:
           ans= x*n;
           break;
           case 4:
           ans= x/n;
           ans1=x%n;
           System.out.println("Remainder="+ans1);
           break;
           default:
           System.out.println("Enter number between 1 to 4");

        }
       System.out.println("Answer="+ans);
    }
}
           