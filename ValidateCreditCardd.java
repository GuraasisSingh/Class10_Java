
/**
 * Validate Credit Card
 */
public class ValidateCreditCardd
{    
    private String ccn;//cnn is the instancevariable that stores the credit card number that is to be validated
    
    public ValidateCreditCardd(String s)
    {
        String t="";//Will be used as an accumalator which will only keep digits 
        int x;
        for(x = 0;x<s.length();x++)
        {
            char c=s.charAt(x);
            if(c>='0' && c<='9')
            {
                t+=x;
            }
        }
        ccn=t;
    }
     public ValidateCreditCardd()
    {
        
    }
     public void set(String s)
    {
        String t="";//Will be used as an accumalator which will only keep digits 
        int x;
        for(x = 0;x<s.length();x++)
        {
            char c=s.charAt(x);
            if(c>='0' && c<='9')
            {
                t+=x;
            }
        }
        ccn=t;
    }
   
    public  boolean chkLength()//This method checks whether the length of the credit  card number is valid or not
    {
        if(ccn.length()>=12 && ccn.length()<=19)
        return true;
        else
        return false;
    }
    public int sumCreditCard1()
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
        return sum1;
    }
    public int sumCreditCard2()//Taking the local variable s to store credit card number in sumCreditCard  method which uses the mod 10 algorithm and returns the second sum 
    {
        int x;
        String t="";
        for(x=ccn.length()-1;x>=0;x-=2)
        {
            char c = ccn.charAt(x);
            x = Integer.parseInt(c+"");//Converting to integer datatype
            t+=x;
        }
        int sum2=Integer.parseInt(t);//used to store the second sum by using mod 10 algorithm.
        return sum2;
    }
    public int addSumCreditCard()//used to add the values of sum of both sums of credit card by mod 10 algorithm. 
    {
        int a= sumCreditCard1();
        int b= sumCreditCard2();
        int c=a+b;
        return c;    
    }
    public boolean chkDivisibility()
    {
        int a=addSumCreditCard();
        int b=a%10;
        if(b==0)
        return true;
        else
         return false;
    }
    public String mii()
    {
        char c=ccn.charAt(0);
        String s;
        switch(c)
        {
            case 1:
            case 2:
             s="Airlines";
            break;
            case 3:
            s="Travel";
            break;
            case 4:
            case 5:
            s="Banking and Financial";
            break;
            case 6:
            s="Merchandising and Banking / Financial";
            break;
            case 7:
            s = "Petroleum";
            break;
            case 8:
            s="Healthcare,Telecommunications";
            break;
            case 9:
            case 0:
            s="Unknown";
            break;
            default:
            s="";
        }
         return s;        
    }
    public String iin()
    {
         String s=ccn.substring(0,6);
         String s1;
         if((s.substring(0,2).equals("34"))||(s.substring(0,2).equals("37")))
         s1="Amex";
         else if(s.substring(0,1).equals("4"))
         s1="Visa";
         else if(s.substring(0,2).equals("51")||s.substring(0,2).equals("52")||s.substring(0,2).equals("53")||s.substring(0,2).equals("54")||s.substring(0,2).equals("55"))
         s1="Mastercard";
         else if (s.substring(0,4).equals("6011")||s.substring(0,3).equals("644")||s.substring(0,2).equals("65"))
         s1="Discover";
         else 
         s1="Unknown";
         return s1;
    }
    public String accno()
    {
      String s = ccn.substring(6,ccn.length()-1);
      return s;
    }
    public char chkDigit()
    {
        char c=ccn.charAt(ccn.length()-1);
        return c;
    }
    public void show()
    {
        if((chkDivisibility())&&(chkLength()))
        {
            System.out.println("The Card Number is Valid");
            System.out.println("The Major Industry Identifier(MII) =" + mii());
            System.out.println("The Issuer Identificartion Number(IIN) =" + iin());
            System.out.println("The Account Number =" + accno());
            System.out.println("The Check Digit =" +chkDigit());      
        }
        else
        {
            int a=(addSumCreditCard())%10;
            int x=10-a;            
            System.out.println("Invalid Card Number. The check digit should have been "+ x);
        }     
    }
    public static void main()
    {
       ValidateCreditCardd cc1 =new ValidateCreditCardd();
       cc1.set("5451155446518842");
       cc1.chkLength();
       cc1.sumCreditCard1();
       cc1.sumCreditCard2();
       cc1.chkDivisibility();
       cc1.mii();
       cc1.iin();
       cc1.accno();
       cc1.chkDigit();
       cc1.show();
    }
}
