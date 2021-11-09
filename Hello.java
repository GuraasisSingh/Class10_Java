
//how to count HELLO
public class Hello
{
   static int n=1234;
   static void main()
   {
       System.out.print("This is my "+ n);
       int t= (n%100)/10;
       int u = n%10;
       if(t==1)
         System.out.print("th");
        else if(u==1)
         System.out.print("st");
         else if(u==2)
         System.out.print("nd");
         else if(u==3)
         System.out.print("rd");
         else
         System.out.print("th");
          System.out.print(" hello to you");
   }
}
