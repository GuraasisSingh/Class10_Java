import java.util.Scanner;
public class GoldenGolfClubShoppe
{
    private int numgolf, pricegolf;
    public GoldenGolfClubShoppe(int price)
    {
        pricegolf=price;
    }
    public void add_GolfClubs(int num)
    {
        if (num>=0)
        numgolf+=num;
        else
        System.out.println("Enter a positive value");
    }
    public void remove_GolfClubs(int num)
    {
        if (num<=numgolf)
        numgolf-=num;
        else
        System.out.println("Enter a value less than or equal to current number of golf clubs.");
    }
    public void view_order()
    {
        System.out.println("You have "+numgolf+" Golf Clubs.");
        System.out.println("Golf Clubs cost Rs."+pricegolf+" each");
        System.out.println("Total cost is Rs. "+(numgolf*pricegolf));
    }
    public void checkout()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name= sc.nextLine();
        view_order();
        System.out.println("Thanks for your order,"+name+"!");
    }
    public static void main()
    {
        GoldenGolfClubShoppe gc = new GoldenGolfClubShoppe(4000);
        Scanner s = new Scanner(System.in);
        boolean bool=true;
        while(bool){
           int choice,add,remove; 
           System.out.print("1. Add Golf Clubs to Order\n2. Remove Golf Clubs from Order\n3. View Current Order\n4. Checkout\nPlease enter your choice:");
           choice=s.nextInt();
           switch(choice)
           {
            case 1:
            System.out.print("You have "+ gc.numgolf +" Golf Clubs. How many to add?");
            add=s.nextInt();
            gc.add_GolfClubs(add);
            break;
            case 2:
            System.out.print("You have "+ gc.numgolf +" Golf Clubs. How many to remove?");
            remove=s.nextInt();
            gc.remove_GolfClubs(remove);
            break;
            case 3:
            gc.view_order();
            break;
            case 4:               
            gc.checkout();
            bool=false;
            break;
            default:
            System.out.println("Please enter a valid choice");
           }
        }
    }
}