import java.util.*;
class CompuAssign1
{
  /*  Computer Applications Assignment 1.
Answer Key
Uploaded April 10, 2021
To be submitted on or before April 12, 2021*/

}
//Q1. Find whether a number input by the user is Positive - even or odd, Negative - even or odd.
class CompuAssign1_Q1
 {
   public static void main() 
   {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     if(n > 0){
     System.out.println("Positive");
       if(n % 2 == 0)
    System.out.println("Even");
   else
   System.out.println("Odd");
   } else
   if(n < 0)
    {
    System.out.println("Negative");
    if(n % 2 == 0)
      System.out.println("Even");
   else
    System.out.println("Odd");
   } else {
   System.out.println("Zero");
   }
   }
}
/*Q2. Display the suffix st, rd, nd, th depending on a number (single digit) input by the user
9 -> 9th
3 -> 3rd
2 -> 2nd*/
class CompuAssign1_Q2 
{
   public static void main() 
   {
    Scanner sc = new Scanner(System.in);
    int u = sc.nextInt();
    System.out.print(u);
     if(u == 1)
    System.out.print("st");
     else
    if(u == 2)
    System.out.print("nd");
     else
    if(u == 3)
   System.out.print("rd");
    else
    System.out.print("th");
   }
}
/*Q3. Input a number.
If the number is divisible by 3 display Fizz
If the number is divisible by 5 display Buzz
If the number is divisible by 3 and 5 display FizzBuzz
otherwise display the number*/
class CompuAssign1_Q3
{
  public static void main()
  {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n % 3 == 0 && n % 5 == 0)
     System.out.print("FizzBuzz");
    else
     if (n % 3 == 0)
     System.out.print("Fizz");
     else
     if (n % 5 == 0)
     System.out.print("Buzz");
     else
    System.out.print(n);
  }
}
/*Q4. Input a number. Find whether the number is a perfect number. (A perfect number is one
which is equal to the sum of its factors.
E.g.
# 6 (sum of factors is 1 + 2 + 3 = 6).
# 28 sof is 1 + 2 + 4 + 14 = 28.*/
class CompuAssign1_Q4 
{
 public static void main()
 {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int x, sum = 0;
  for(x = 1; x <= n/2; x++) 
  {
   if(n % x == 0)
   sum += x;
  }
   if(sum == n)
   System.out.println("Perfect Number");
   else
   System.out.println("Not a Perfect Number");
 }
}
/*Q5. Display the numbers 0 to 9 along with a suffix.
0 – 0th
1 – 1st
2 – 2nd
3 – 3rd
4 – 4th
.
.
9 – 9th*/
class CompuAssign1_Q5 
{
  public static void main() 
 {
  int u;
   for(u = 0; u <= 9; u++)
   {
    System.out.print(u);
   if(u == 1)
    System.out.print("st");
    else
    if(u == 2)
     System.out.print("nd");
    else
    if(u == 3)
     System.out.print("rd");
     else
   System.out.print("th");
  }
 }
}