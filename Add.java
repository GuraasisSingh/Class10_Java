//ADDing using diferent methods
public class Add
{
    static void main()
    {
        add(3,7);
              }
    static void add(int a,int b)
     {
          int c=a+b;
          System.out.println(c);
     }
    static void mainer()
    {
        int g= adder(3,27);
        System.out.println(g);
        int h= adder(5,2)+adder(3,4);
        int i=adder(adder(1,2),adder(3,4));
        System.out.println(h);
        System.out.println(i);
    }
    static int adder(int a,int b)
    {
        int c=a+b;
        return c;
    }
}
