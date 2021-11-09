import java.util.*;
class BankAccount
 {
    private int acNo;
    private String name;
    private float bal;

    public void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("acno");
        int a = sc.nextInt();
        System.out.println("name");
        sc.nextLine();
        String n = sc.nextLine();
        System.out.println("Balance");
        float b = sc.nextFloat();
        acNo = a;
        name = n;
        bal = b;
    }
    
    public BankAccount() 
    {
  
    
    }
    public BankAccount(int a, String s, float b) 
    {
        acNo = a;
        name = s;
        bal = b;
    }
    //set(int, String, float) -> pass values of arguments to the fields
    
    public void set(int a, String s, float b)
    {
        acNo = a;
        name = s;
        bal = b;
    }
    
    //deposit(float) -> add the value to balance if it is +ve
    
    public void deposit(float d) 
    {
        if(d > 0)
            bal += d;
    }
    
    //withdraw(float) -> subtract value from the balance if it is +ve and is <= the balance
    
    public void withdraw(float w) 
    {
        if(w > 0 && w <= bal)
            bal -= w;
    }
    
    public void show() 
    {
        System.out.println("Account number: " + acNo);
        System.out.println("Name: " + name);
        System.out.println("Current Balance: " + bal);
    }
    
    public static void main() 
    {
        BankAccount a = new BankAccount();
        a.show();
        BankAccount c = new BankAccount(123456,"Naresh", 1000);
        c.show();               // 1000
        c.deposit(500);         // 1500
        c.show();
        c.withdraw(400);        // 1100
        c.show();
        c.deposit(-200);        // 1100
        c.show();
        c.withdraw(1500);       // 1100
        c.show();
        c.withdraw(100);        // 1000
        c.show();
    } 
}