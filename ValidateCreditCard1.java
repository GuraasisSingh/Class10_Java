 

/**
 * Validate Credit Card
 */
public class ValidateCreditCard1
{    
    String ccn;//cnn is the instancevariable that stores the credit card number that is to be validated

    public ValidateCreditCard1(String s)
    {
       ccn=s;
    }

    public void set(String s)
    {
        ccn=s;
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
        int t=0;
        for(x=0;x>=ccn.length()-1;x+=2)
        {
            char c = ccn.charAt(x);
            x = Integer.parseInt(c+"");//Converting to integer datatype
            x*=2;
            x = (x%10) + (x/10);
            t+=x;           
            System.out.println("t "+t);
        }//used to store the first sum by using mod 10 algorithm.
        return t;
    }

    public int sumCreditCard2()//Taking the local variable s to store credit card number in sumCreditCard  method which uses the mod 10 algorithm and returns the second sum 
    {
        int x;
        int t=0;
        for(x=0;x>=ccn.length()-1;x+=2)
        {
            char c = ccn.charAt(x);
            x = Integer.parseInt(c+"");//Converting to integer datatype
            t+=x;
            System.out.println("t "+t);
        }//used to store the second sum by using mod 10 algorithm.
        return t;
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

    public void mii()
    {
        String c=ccn.substring(0,1);
        int n=Integer.parseInt(c);        
        String s="";
        switch(n)
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
        }
        System.out.println("MII "+s);
    }

    public void iin()
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
            System.out.println("IIN "+s1);
    }

    public void accno()
    {
        String s = ccn.substring(6,ccn.length()-1);
        System.out.println("Account Number "+s);
    }

    public void chkDigit()
    {
        long n=Long.parseLong(ccn);
        long cd=n%10;
        System.out.println("Check Digit "+cd);
    }
    
    public void finalcheck()
    {
        long c=addSumCreditCard()%10;
        if(c==0)
            System.out.println(ccn+" is an valid card number");
        else
        {
            System.out.println(ccn+" is an invalid card number");
            System.out.println("Check Digit should have been"+(10-c));
            System.exit(0);
        }
    }

    public static void main()
    {
        ValidateCreditCard1 cc1 =new ValidateCreditCard1("5451155446518842");
        cc1.set("5451155446518842");
        cc1.chkLength();
        cc1.sumCreditCard1();
        cc1.sumCreditCard2();
        cc1.chkDivisibility();
        cc1.finalcheck();
        cc1.mii();
        cc1.iin();
        cc1.accno();
        cc1.chkDigit();
        
    }
}