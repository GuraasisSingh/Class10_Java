
/**
 * Finding how many times a base occurs in a string
 */
public class A1Q1
{
   public static void main()
   {
     String s = "AGAGTCGTAGCTTAC";
     char i ='A';
     int x, a=s.length(), ctr=0;
     for(x=0; x<a;x++)
     {
         char c= s.charAt(x);
         if(i==c)
         ctr++;
     }
     System.out.println("The base "+i+" occurs "+ctr);
   }
}
