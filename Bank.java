
//Understanding a banking system
// main function is accessing the private vault of the bank
class Bank
{
    private int vault;
    public void deposit(int n)
    {
       vault+=n;
    }
    public void withdraw(int n)
    {
        vault-=n;
    }
    public void show()
    {
        System.out.println(vault);
    }
    public static void main()
    {
        Bank sbi = new Bank();
        Bank pnb = new Bank();
        sbi.deposit(1000);
        pnb.deposit(800);
        sbi.withdraw(400);
        pnb.withdraw(300);
        sbi.show();
        pnb.show();
    }
}