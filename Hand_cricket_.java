import java.util.*;
class Hand_cricket_
{
    static void main()
    {
        Scanner s= new Scanner(System.in);
        int p1=0,c=0;
        Hand_cricket_ o= new Hand_cricket_();
        System.out.println("Enter to 1 to bat or 2 to ball");
        int choice =s.nextInt();
        switch(choice)
        {
            case 1:
            p1=o.bat();
            c=o.bowl();
            break;
            case 2:
            c=o.bowl();
            p1=o.bat();
            break;
        }
        if(c>p1)
           System.out.println("YOU LOOSE");
        else if(p1>c)
           System.out.println("VICTORY");
        else if(p1==c)
           System.out.println("IT'S A DRAW");
    }
    int bowl()
    {
        Scanner s= new Scanner(System.in);
        int sc=0,p=0;
        while(sc>-1)
        {
         System.out.print("Your bowled number: ");
         p=s.nextInt();
         if(p>10 || p<0)
         {
             System.out.println("You broke the rule you loose");
             System.exit(0);
         }
         int c=(int)(Math.random()*10);
         System.out.println("opponent bated number: "+c);
         if (c==p)
         {
            System.out.println("You bold the opponent");
            break;
         }
          else
          sc+=c;
        }
        System.out.println("opponent scored : "+sc);
        return sc;
    }
    int bat()
    {
        Scanner s= new Scanner(System.in);
        int sc=0,p=0;
        while(sc>-1)
        {
         System.out.print("Your bated number: ");
         p=s.nextInt();
         if(p>10 || p<0)
         {
             System.out.println("You broke the rule you are out");
             break;
         }
         int c=(int)(Math.random()*10);
         System.out.println("opponent bowled number: "+c);
         if (c==p)
         {
            System.out.println("You are out");
            break;
         }
          else
          sc+=p;
        }
        System.out.println("You scored : "+sc);
        return sc;
    }
}