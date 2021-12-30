import java.util.*;
public class Hand_Cricket
{
    int total1,total2;
    String check;
    Boolean toss,toss2=true;

    public void toss()
    {
        System.out.println("Enter 1 or 2 for toss");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=(int)(2*Math.random()+1);
        Boolean b=false;
        String a="";
        if(m==n)
        {
            System.out.println("You have won the toss. Do you choose to bat or bowl (write 1 to bat and 2 to bowl)");
            a=sc.next();
            if(a=="1")
                b=true;
            else if(a=="2")
            {
                b=false;
                toss2=b;
                return;
            }
        }
        else
        {
            System.out.println("You lose the toss");   
            b=false;
        }
        check=a;
        toss=b;
    }
    public void losttoss()
    {
        int m;
        if(toss==false&&toss2!=false)
        {
            m=(int)(2*Math.random()+1);
            switch(m)
            {
                case 1:
                System.out.println("You will bowl first");
                toss=false;
                break;
                case 2:
                System.out.println("You will bat first");
                toss=true;
            }
        }
    }

    public void batting()
    {
        Scanner sc=new Scanner(System.in);
        int runs=0,btruns,bwruns;
        for(;;)
        {
            System.out.println("Enter a number from 1 to 10");
            btruns=sc.nextInt();
            bwruns=(int)(10*Math.random()+1);
            System.out.println("The other player scores "+ bwruns);
            if(btruns==bwruns)
            {
                System.out.println("You are out");
                break;
            }
            else if(btruns>10)
                continue;
            else
            {
                runs=runs+btruns;
            }
        }
        total1=runs;
        System.out.println("Target is "+(runs+1));
    }

    public void bowling()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Now it is the other player's turn to bat");
        int runs=0,btruns,bwruns;
        for(;;)
        {
            System.out.println("Enter a number from 1 to 10");
            bwruns=sc.nextInt();
            btruns=(int)(10*Math.random()+1);
            System.out.println("The other player scores"+ btruns);
            if(btruns==bwruns)
            {
                System.out.println("Wicket taken");
                break;
            }
            else if(btruns>10)
                continue;
            else if(runs>(total1+1)){
                break;}
            else
            {
                runs=runs+bwruns;
            }
        }
        total2=runs;

    }

    public void batting2()
    {
        Scanner sc=new Scanner(System.in);
        int runs=0,btruns,bwruns;
        for(;;)
        {
            System.out.println("Enter a number from 1 to 10");
            btruns=sc.nextInt();
            bwruns=(int)(10*Math.random()+1);
            System.out.println("The other player scores "+ bwruns);
            if(btruns==bwruns)
            {
                System.out.println("You are out");
                break;
            }
            else if(btruns>10)
                continue;
            else
            {
                runs=runs+btruns;
            }
        }
        total1=runs;
        System.out.println("Target is "+(runs+1));

    }

    public void bowling2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Now it is your turn to bat");
        int runs=0,btruns,bwruns;
        for(;;)
        {
            System.out.println("Enter a number from 1 to 10");
            bwruns=sc.nextInt();
            btruns=(int)(10*Math.random()+1);
            System.out.println("The other player scores "+ btruns);
            if(btruns==bwruns)
            {
                System.out.println("Wicket taken");
                break;
            }
            else if(btruns>10)
                continue;
            else if(runs>(total1+1)){
                break;}
            else
            {
                runs=runs+bwruns;
            }
        }
        total2=runs;
    }

    public static void main()
    {
        Hand_Cricket h=new Hand_Cricket();
        h.toss();
        if(h.toss=false)
        h.losttoss();
        
        if(h.toss==true)
        {
            
            h.batting();
            h.bowling();
            if(h.total1>h.total2)
                System.out.println("You win");
            else if(h.total1==h.total2)
                System.out.println("You draw");
            else
                System.out.println("You lose");
        }
        else 
        {
            
            h.batting2();
            h.bowling2();
            if(h.total1<h.total2)
                System.out.println("You lose");
            else if(h.total1==h.total2)
                System.out.println("You draw");
            else
                System.out.println("You win");
        }

    }
}