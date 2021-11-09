public class A1Q6

{   
    int d,m,y,x,z;
    A1Q6()
    {   
        d=1;
        m=1;
        y=1900;
    }
   A1Q6( int a,int b, int c)
    {
        boolean ck= isValid(a, b, c);
        if (ck== true)
        {
        d=a;
        m=b;
        y=c;
       }
       else
       {
           d=1;
           m=1;
           y=1900;
        }
        
    }
    void set(int a, int b,int c)
    {
        boolean ck= isValid(a, b, c);
        if (ck== true)
        {
            d=a;
            m=b;
            y=c;
        }
    }
    boolean isValid(int a, int b, int c)
    {
        if(c>0 || b>1 || b<12)
        {
          if((b==1 || b<8 || b==3 || b==5 || b==7 || b==10 || b==12) &&(a<=31))
          {
           return true;
          }
          else
          if((c%4==0 && b==2 && a==29)||(b==2 && a>28))
           {
           return true;
          }
          else
          if((b==4 || b==6 || b==9 || b==11)&&(a<=30))
          {  
              return true;
          } 
        }
        else
        return false;
        return true;
    }
    void show()
    {
        System.out.println(d+"-"+m+"-"+y);
    }
    void nextDate()
       {
          if(m==12 && d==31)
           {
              m=1;
              d=1;
              y++;
             }
            else
            if((m==1 || m<8 || m==3 || m==5 || m==7 || m==10) &&(d==31))
          {
           m++;
           d++;
          }
          else
          if((y%4==0 && m==2 && d==29)||(m==2 && d==28))
           {
           m++;
           d++;
          }
          else
          if((m==4 || m==6 || m==9 || m==11)&&(d<=30))
          {  
           m++;
           d++;
          } 
           else
          {
           d++;
          }
        }
        int getMonth()
        {
            System.out.println(m);
            return m;
            
        }
        int getDate()
        { System.out.println(d);
            return d;
           
        }
        int getYear()
        {System.out.println(y);
            return y;
            
        }
        public static void main()
        {   A1Q6 dt1= new A1Q6();
            dt1.show();
            dt1.set(31,1,2020);
            dt1.show();
           A1Q6 dt2= new A1Q6(31,12,2021);
            dt2.show();
            dt2.nextDate();
            int mm= dt2.getMonth();
            int dd= dt2.getDate();
            int yy= dt2.getYear();
            dt2.show();
        }
    }