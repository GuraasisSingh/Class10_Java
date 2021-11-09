import java.util.*;
class project
{
    String cardno;
    String mii,iin,accountno;
    long ctr=0,checkdigit;
    static void main()
    {
        project p=new project();
        p.input();
        p.checkno();
        p.chkvalidp1();
        p.chkvalidp2();
        p.finalcheck();
        p.findmii();
        p.findiin();
        p.accountno();
        p.checkdigit();
    }

    void input()
    {
        System.out.println("Enter your card number");
        Scanner sc=new Scanner(System.in);
        cardno=sc.nextLine();
    }

    void checkno()
    {
        int a=cardno.length();
        if(a<=12||a>=19)
            System.out.println(cardno+" is an invalid card number");
        else
            return;
        System.exit(0);
    }

    void findmii()
    {
        mii=cardno.substring(0,1);
        int f=Integer.parseInt(mii);
        switch(f)
        {
            case 1:
            case 2:
            System.out.println("MII is Airlines");
            break;
            case 3:
            System.out.println("MII is Travel");
            break;
            case 4:
            case 5:
            System.out.println("MII is Banking and Financial");
            break;
            case 6:
            System.out.println("MII is Merchandising and Banking/Financial");
            break;
            case 7:
            System.out.println("MII is Petroleum");
            break;
            case 8:
            System.out.println("MII is Healthcare, Telecommunications");
            break;
            default:
            System.out.println("MII is Unknown"); 
        }
    }

    void findiin()
    {
        iin=cardno.substring(0,6);
        int e=Integer.parseInt(iin);
        if((e>=340000&&e<=349999)||(e>=370000&&e<=379999))
            System.out.println("IIN is Amex");
        else if(e>=400000&&e<=499999)
            System.out.println("IIN is Visa");
        else if((e>=510000&&e<=559999))
            System.out.println("IIN is MasterCard");
        else if((e>=601100&&e<=601199)||(e>=644000&&e<=644999)||(e>=650000&&e<=659999))
            System.out.println("IIN is Discover");
        else
            System.out.println("IIN is Unknown");
    }

    void checkdigit()
    {
        long g=Long.parseLong(cardno);
        checkdigit=g%10;
        System.out.println("Check Digit is "+checkdigit);
    }

    void accountno()
    {
        accountno=cardno.substring(6,cardno.length()-1);
        System.out.println("Account Number is "+accountno);
    }

    void chkvalidp1()
    {
        long h=Long.parseLong(cardno),i=cardno.length();
        String j;
        int k,l=1,m=0,n=0;
        for(int x=(int)(i-2);x>=0;x-=2)
        {
            j=cardno.substring(x,x+1);
            k=Integer.parseInt(j);
            l=k*2;
            if(l>=10)
            {
                while(l>=10)
                {
                    m=l%10;
                    l=l/10;
                }
                n=m+l;
                ctr=ctr+n;
            }
            else
                ctr=ctr+l;
        }
    }

    void chkvalidp2()
    {
        long h=Long.parseLong(cardno),i=cardno.length();
        String j;
        int k,l=1,m=0,n=0;
        for(int x=(int)(i-1);x>=0;x-=2)
        {
            j=cardno.substring(x,x+1);
            k=Integer.parseInt(j);
            ctr=ctr+k;
        }
    }

    void finalcheck()
    {
        if(ctr%10==0)
            System.out.println(cardno+" is an valid card number");
        else
            System.out.println(cardno+" is an invalid card number");
    }
}