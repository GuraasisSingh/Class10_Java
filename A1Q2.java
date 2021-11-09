
/**
 * Finding how many times each base exists in the DNA String
 */
public class A1Q2
{
    public static void main()
    {
        String s ="AGAGTCGTAGCTTAC";
        int x, a=s.length(),ctr1=0,ctr2=0,ctr3=0,ctr4=0;
        for(x=0;x<a;x++)
        {
            char c =s.charAt(x);
            if(c=='A')
            ctr1++;
            else
            if(c=='G')
            ctr2++;
            else 
            if(c=='T')
            ctr3++;
            else
            if(c=='C')
            ctr4++;            
        }
        System.out.println("The base 'A' occurs "+ctr1+" in the DNA String");
        System.out.println("The base 'T' occurs "+ctr3+" in the DNA String");
        System.out.println("The base 'G' occurs "+ctr2+" in the DNA String");
        System.out.println("The base 'C' occurs "+ctr4+" in the DNA String");
    }
}
