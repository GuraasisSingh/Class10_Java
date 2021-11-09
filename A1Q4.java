/**
 * Finding how many times a DNA sequence occurs in another DNA sequence either straight orreversed.
 */
public class A1Q4
{
    public static void main()
    {
         String s="AGAGTCGTAGCTTA";
         String g= "AG";
         int x,y,a = s.length(),b=g.length(),ctr=0;
         String t="";
         for(y=b-1;y>=0;y--)
         {
             char c=g.charAt(y);
             t+=c;
         }
         for(x=0;x<a-b;x++)
         {
             String c1=s.substring(x,x+b);
             if((g.equals(c1)||(t.equals(c1))))
             ctr++;         
             
         }
         System.out.println("The DNA sequence: "+g+" straight or its reversed "+t+" occur "+ctr+" times  in the DNA sequence "+s);
    }
}
