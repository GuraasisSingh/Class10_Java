import java.util.*;
public class A1Q5 //take input using scanner class
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check");
        String s =sc.nextLine().toUpperCase();
         int x, ctr=0, m=1;
         int a= s.length();
         for(x=0;x<a;x++)
         {
         char c= s.charAt(x);
         int e=a-m;
         char d= s.charAt(e);
         m++;
         if( c==d)
         ctr++;
         else
         break;
        }
        if(ctr>=1)
        System.out.println("Is a near Palindrome "+ctr);
        else
        System.out.println("Not a near palindrome"+ctr);
    }
}