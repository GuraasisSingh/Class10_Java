
public class ValidateCard
{
    String ccn;
    public ValidateCard()
    {
        
    }
    public ValidateCard(String s)
    {
         String t=""; 
        int x;
        for(x = 0;x<s.length();x++)
        {
            char c=s.charAt(x);
            if(c>='0' && c<='9')
            {
                t+=c;
            }
        }
        ccn=t; 
    }
    public void set(String s)
    {
        String t=""; 
        int x;
        for(x = 0;x<s.length();x++)
        {
            char c=s.charAt(x);
            if(c>='0' && c<='9')
            {
                t+=c;
            }
        }
        ccn=t;
    }
     public  boolean chkLength()
    {
        if(ccn.length()>=12 && ccn.length()<=19)
            return true;
        else
            return false;
    }
    public void sumCreditCard1()
    {
        int x;
        String t="";
        for(x=ccn.length()-2;x>=0;x-=2)
        {
            char c = ccn.charAt(x);
            x = Integer.parseInt(c+"");//Converting to integer datatype
            x*=2;
            x = (x%10) + (x/10);
            t+=x;
        }
        int sum1=Integer.parseInt(t);//used to store the first sum by using mod 10 algorithm.
        System.out.println(sum1);
    }
    public void show()
    {
         System.out.println(ccn);
    }
    public static void main()
    {
      ValidateCard cc1= new ValidateCard();
      cc1.set("4 0 1 2 8 8 8 8 8 8 8 8 1 8 8 1");
      cc1.show();
      cc1.sumCreditCard1();
      //ValidateCreditCard cc2= new ValidateCreditCard("454 6 65 4 57 6  76 2 8 1");
      //cc2.show();
    }      
}
