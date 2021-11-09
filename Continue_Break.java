
// Use of Break and continue statement
public class Continue_Break
{
    static void main()
     {
      int x;
      for(x=1;x<=10;x++)
      {
          if(x%2==1)
           continue;
           System.out.println(x);
           if(x>7)
           break;
       }
    }
    static void set()
    {
        int x;
        for(x=1;x<=5;x++)
        {
            System.out.println(x);
            if(x>2)
            break;
       }
       for(x=1;x<=5;x++)
       {
           if(x%2==0)
           {
               continue;
            }
           System.out.println(x);
        }
    }
}
