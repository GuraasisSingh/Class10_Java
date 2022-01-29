public class Strings
{
    public static void stringConversion()
    {
        String s="abcdefghij";
        String t="";
        boolean change=false;
        for(int x=0;x<s.length();x++)
        {
            char c = s.charAt(x);
            if(change == false)
            {
                if("AEIOUaeiou".contains(c+""))
                change=true;
                t+=c;                
            }
            else
            {
                t+='x';
                change=false;                
            }
        }
        System.out.println(t);
    }
}
