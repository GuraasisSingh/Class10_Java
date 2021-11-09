
public class CompuAssign3
{
   /*
    Computer Applications
    Assignment 3 – Answer Key
    01.05.2021 to 05.05.2021
    */
}
//Q1.
//What will be the output of the following program, when the main() is executed?
class CompuAssign3_Q1 
{
   public static void main() 
   {
     int m = 10;
     System.out.println(m);
    callMe(m++);
    System.out.println(m);
   }
   public static void callMe(int n)
   {
    System.out.println(n);
   }
}
/**
 10
 10
 11
*/
//Q2.
//What will be the output of the following program, when the main() is executed?
class CompuAssign3_Q2 
{
    public static void main() 
    {
     int m = 10;
     m = callMe(m);
     System.out.println(m);
     m = callMe(m);
     System.out.println(m);
    }
    public static int callMe(int n)
    {
    return n+1;
    }
}
/**
10
11
*/
//Q3. Create a method called pythagorus() that takes two int arguments a and b and returns the result
//of the formula
//a2 + b2 + 2*a*b
//Also create the main() that uses this method (passes values to this method and displays the returned
//value).
class CompuAssign3_Q3 
{
  public static void main() 
  {
  int m = 10, n = 20, p;
  p = pythagorus(m,n);
  System.out.println("The result is " + p);
  }
   public static int pythagorus(int a, int b) {
   return a*a + b*b + 2*a*b;
  }
}
//Q4. Create a method sum() that takes two int arguments a and b, and returns the sum of all
//numbers from a to b.
//Also create the main() that uses this method (passes values to this method and displays the returned
//value).
class CompuAssign3_Q4 
{
  public static void main() 
   {
    int m = 10, n = 20, p;
    p = sum(m,n);
    System.out.println("The sum of numbers is " + p);
   }
   public static int sum(int a, int b) {
   int s = 0, x;
    if(a > b) 
    { // swap a and b if a is the larger
    int t = a;
    a = b;
    b = t;
   }
   for(x = 1; x <= b; x++) 
     s += x;
    
   return s;
  }
}
//Q5. Create a method isEven() that takes one int argument a, and returns true of the a is even,
//otherwise returns false.
class CompuAssign3_Q5 
{
   public static void main() 
   {
    int m = 10;
    boolean p;
    p = isEven(m);
    System.out.println("The result is " + p);
   }
   public static boolean isEven(int a) 
   {
    if(a % 2 == 0)
    return true;
     else
    return false;
    }
}
//Q6. Create a method fizzBuzz() that takes one int argument a, and displays the following:
//If a is divisible by 3, display Fizz
//Otherwise If a is divisible by 5, display Buzz
//Otherwise If a is divisible by 3 and 5, display FizzBuzz
//Otherwise display a
class CompuAssign3_Q6 
{
   public static void main() 
   {
    int m = 10;
    fizzBuzz(m);
   }
   public static void fizzBuzz(int a) 
   {
    if(a % 3 == 0 && a % 5 == 0)
    System.out.println("FizzBuzz");
    else
    if(a % 3 == 0)
    System.out.println("Fizz");
    else
    if(a % 5 == 0)
    System.out.println("Buzz");
    else
    System.out.println(a);
   }
}
