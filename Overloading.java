/**
 * Rules of overloading :
 * The method names have to be the same
 * The return type doesn't matter
 * The signatures(arguments) have to be different in terms of:
 * either 1.number of arguments:
 * add(int )
 * add(int ,int)
 * add(int ,int ,int)
 * or 2.types of arguments:
 * add(int , int)
 * add(long ,long)
 * or 3.order/arrangement of arguments:
 * add(int ,long)
 * add(long ,int)
 * example of not overloaded:
 * add(int a,int b)
 * add(int m,int n)
 */
public class Overloading
{
    public static void main()
    {
        add(10,20);
        add(10L,20L);
    }
    public static void add(int a, int b)
    {
        System.out.println("The int result is "+(a+b));
    }
    public static void add(long a, long b)
    {
        System.out.println("The long result is "+(a+b));
    }
}
