import java.util.Scanner;
public class HandCricket
{
    public static void main()
    {
        HandCricket hc = new HandCricket();
        int player,comp,ptoss,ctoss;
        int x=(int)Math.round(Math.random());
        if (x==0)
        {
            System.out.println("The Computer won the toss!");
            ctoss=(int)Math.round(Math.random());
            if (ctoss==0)
            {
                System.out.println("The Computer chose to bat!");
                player=hc.gaming("Computer","Player");
                comp=hc.gaming("Player","Computer");
            }
            else
            {
                System.out.println("The Computer chose to bowl!");
                player=hc.gaming("Player","Computer");
                comp=hc.gaming("Computer","Player");
            }
        }
        else
        {
            System.out.println("The Player won the toss!");
            Scanner sc =new Scanner(System.in);            
            do
            {
                System.out.println("Enter 0 to bat and 1 to bowl");
                ptoss=sc.nextInt();
            }
            while(ptoss<0 || ptoss>1);            
            if (ptoss==0)
            {
                System.out.println("The Player chose to bat!");
                player=hc.gaming("Player","Computer");
                comp=hc.gaming("Computer","Player");
            }
            else
            {
                System.out.println("The Player chose to bowl!");
                player=hc.gaming("Computer","Player");
                comp=hc.gaming("Player","Computer");
            }
        }
        if (player > comp)
        {
            System.out.println("The Player won the game.");
        }
        else 
        if(comp > player)
        {
            System.out.println("The Computer won the game.");
        }
        else
        {
            System.out.println("The game is a tie");
        }
    }
    public int gaming(String s, String s1)
    {
       Scanner game= new Scanner(System.in);
       int p1,p2,score=0;
       System.out.println("The "+s+" is batting and "+s1+" is bowling");
       while(true)
       {
            do
            {
                System.out.println("Enter throw from 1 to 10");
                p1=game.nextInt();                
            }
            while(p1<1 || p1>10); 
            p2=(int)(Math.random()*10);
            if (p2==0)
            p2=1;
            System.out.println("The Computer throwed number:"+p2);
            if(p2==p1)
            {
                System.out.println("The "+s+" is out!");
                break;
            }
            else if(s=="Player")
            score+=p1;
            
            else if(s=="Computer")
            score+=p2;            
            System.out.println(score);
       }
       System.out.println("The "+s+" scored "+score); 
       return score;
    }
}
