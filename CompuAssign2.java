import java.util.Scanner;
public class CompuAssign2
{
    /*
     * St. Stephen's School, Chandigarh
     Computer Applications. Class 10. Assignment 2.
     To be submitted on or before 28.Apr.2021
    1. Name the primitive data types
     a. having the size of 4 bytes -> int, float
     c. cannot be used with any arithmetic operator -> boolean
     d. is/are non-numeric -> boolean
     e. Number ending with F -> float
    2. True/False
     a. % can be used with fractions
     b. !(true && false) returns true -> true
     c. break statement written in an if takes control out of the if. -> false
     d. if can be used inside switch. -> true
     e. switch can be used inside an if. -> true
     f. continue in a switch takes control back to the header -> false (cannot be used)
     g. x++; and ++x; are the same -> true
     h. int * float results in float -> true
     j. 2.456 is a float value -> false
    3. What is the result of the following:
     a. 10 < 3 || 3 < 10 -> true
     b. 10 <= 10 -> true
     c. x++ > x (x has a value of 10) -> false
     d. 4 > 2 ? 6 + 3 : 4 - 1 -> 9
     e. 27 > 27 + 1 -> false
     */
}
/*4. Write a program to input principle amount, yearly rate of interest and number of years.
a. Calculate the compound interest payable at the end of the term. The amount is
compounded yearly.
b. Calculate the simple interest payable at the end of the term.*/

class CompuAssign2_Test 
{
 public static void main()
 {
   float p, r, t;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Principle amount");
   p = sc.nextFloat();
   System.out.println("Enter rate of interest");
   r = sc.nextFloat();
   System.out.println("Enter number of years");
   t = sc.nextFloat();
   float si = p * r * t / 100;
   System.out.println("Simple Interest: " + si);
   double ci = (p * Math.pow((1 + r / 100),t)) - p;
   System.out.println("Compound Interest: ");
   System.out.printf("%.2f", ci); // displays ci with up to 2 decimal places
 }
}
/*5. Write a program to input principle amount, yearly rate of interest and number of years.
Calculate and display the final amount payable at the end of each year. The amount is
compounded yearly.
The programs are to be written in the main(). No arguments.*/

class CompuAssign2_Test1 
{
 public static void main() 
 {
   float p, r;
   int t;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Principle amount");
   p = sc.nextFloat();
   System.out.println("Enter rate of interest");
    r = sc.nextFloat();
    System.out.println("Enter number of years");
    t = sc.nextInt();
    for(int x = 1; x <= t; x++) 
   {
     float ir = p * r / 100;
     p = p + ir;
     System.out.println("Payable at the end of year " + x + " is " + p);
   }
 }
}
/*Trial Run:
Enter Principle amount
1000
Enter rate of interest
10
Enter number of years
3
Payable at the end of year 1 is 1100.0
Payable at the end of year 2 is 1210.0
Payable at the end of year 3 is 1331.0*/
 /**
 * Limiting number of decimal places:
  class Test 
 {
   public static void main()
  {
    float fval = 2.3456f;
   System.out.printf("The value of fval is %.2f", fval);
   }
 }
  Output:
  The value of fval is 2.35
  Explanation:
  %.2f is called a formatter
  .2 indicates 2 decimal places are to be displayed
  f indicates floating point number is going to be displayed. (float or double)
 */
