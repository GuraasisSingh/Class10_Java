
/**
 * Finding how many times a DNA sequence occurs in another DNA Sequence
 */
public class A1Q3
{
    public static void main()
    {
        String s="AGAGTCGTAGCTTAC";
        String g="AG";
        int x, a=s.length(),b=g.length(),ctr=0;
        for(x=0;x<a-b;x++)
        {
            String c = s.substring(x,x+b);
            if(g.equals(c))
            ctr++;
        }
        System.out.println("The DNA sequence "+g+" occurs "+ctr+" times in the DNA Sequence "+s);
    }
}
