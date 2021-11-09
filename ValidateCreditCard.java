import java.io.*;
class ValidateCreditCard
{    
    private String ccn;  // cnn is the instance variable that stores the credit card number that is to be validated
    public void set()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Credit Card Number to be Validated : ");
        ccn=br.readLine();
        String t=""; // To check whether there are alphabets in the string and remove them
        int x;
        for(x = 0;x<cardLen();x++)
        {
            char c=ccn.charAt(x);
            if(c>='0' && c<='9')
            {
                t+=c;
            }
        }
        ccn=t;
    }    
    public int cardLen()
    {
        return ccn.length();
    }
    public ValidateCreditCard()
    {
        ccn="";
    }    
    public int sumCreditCard1()//method to take out the sum of numbers in odd places using mod10algorithm
    {
        int x,sum1=0;
        for(int i =cardLen()-2;i>=0;i=i-2)
        {
            char c = ccn.charAt(i);
            x = 2*(Integer.parseInt(c+""));  
            if(x>10)
                x=x-9;
            sum1+=x;
        }
        return sum1;
    }
    public int sumCreditCard2() //method to take out the sum of the numbers at even places       
    {
        int x,sum2=0;
        for(int i=cardLen()-1;i>=0;i=i-2)
        {
           char c = ccn.charAt(i);
            x = Integer.parseInt(c+"");
            sum2+=x;
        }
        return sum2;
    }
    public String mii()
    {
        char c=ccn.charAt(0);
        String s="";
        switch(c)
        {
            case '1':
            case '2':
            s="Airlines";
            break;

            case '3':
            s="Travel";
            break;

            case '4':
            case '5':
            s="Banking and Financial";
            break;

            case '6':
            s="Merchandising and Banking / Financial";
            break;
            case '7':
            s = "Petroleum";
            break;

            case '8':
            s="Healthcare,Telecommunications";
            break;

            case '9':
            case '0':
            s="Unknown";
            break;

        }        
        return s;
    }
    public String iin()
    {
        String s=ccn.substring(0,6);
        String s1;
        if(s.startsWith("34")==true || s.startsWith("37")==true)
            s1="Amex";
        else if(s.startsWith("4")==true)
            s1="Visa";
        else if(s.startsWith("51")==true || s.startsWith("52")==true || s.startsWith("53")==true ||s.startsWith("54")==true || s.startsWith("55")==true)
            s1="MasterCard";
        else if(s.startsWith("6011")==true || s.startsWith("644")==true || s.startsWith("65")==true)
            s1="Discover";
        else
            s1="Unknown";        
        return s1;
    }
    public String accNo()
    {
        String acn = ccn.substring(6,cardLen()-1);
        return acn;
    }
    public char chkDigit()
    {
        char c=ccn.charAt(cardLen()-1);
        return c;
    }
    public int addSumChk()
    {
        int addSum=(sumCreditCard1()+sumCreditCard2())%10;
        return addSum;
    }
    public boolean finalChk()
    {
        if(addSumChk()==0)
        return true;
        else 
        return false;
    }
    public boolean lenChk()
    {
        if((cardLen()>=12 && cardLen()<=19))
        return true;
        else
        return false;
    }
    public void show()
    {   
        if(lenChk())
        {
            if(finalChk())
            {   
             System.out.println("The Credit Card is Valid" );
             System.out.println("The Major Industry Identifier(MII) = "+mii());
             System.out.println("The Issuer Identificartion Number(IIN) = " +iin());
             System.out.println("The Account Number = " +accNo());
             System.out.println("The Check digit = "+chkDigit());           
            }
            else
            System.out.println("Invalid Card Number.The check digit should have been "+(10-(addSumChk())));
        }
        else 
        System.out.println("Invalid Card Number. ");
    }
    public static void main() throws IOException
    {   
        ValidateCreditCard cc1=new ValidateCreditCard();
        cc1.set();
        cc1.show();       
    }
}