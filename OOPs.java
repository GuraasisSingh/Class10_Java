
//accesing a private variable
public class OOPs
{
    private int num; //instance variable
    public void set(int n) //local variable
    {
         num=n;
    }
    public void show()
    {
        System.out.println(num);
    }
    public void main()
    {
        OOPs o = new OOPs();//o and p are invoking objects
        OOPs p = new OOPs();
        o.set(10);
        o.set(15);
        p.set(3);
        o.show();
        p.show();
    }
}
