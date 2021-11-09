
public class CompuAssign4
{/*
    Computer Applications.
    Assignment 04. 9.05.2021 to 12.05.2021
    Answer Key
    In the Java programming language, the keyword static indicates that the particular
    member belongs to a type itself, rather than to an instance of that type. This means
    that only one instance of that static member is created which is shared across all
    instances of the class.

     */

}
//Consider the following class:
class CompuAssign4_1 
{
    private int num1 = 10;
    private static int num2 = 20;
    public static void main()
    {
        Demo d = new Demo();
        Demo e = new Demo();
    }
}
/*Q1. When the main() is executed:
a. How many copies of num1 will be created? Two
b. How many copies of num2 will be created? One
c. What will be the value of num1 which belongs to the object d? 10
d. What will be the value of num1 which belongs to the object e? 10
e. What will be the value of num2? Which object does it belong to? 20, None*/
/*Q2. What is the basic purpose of method overloading?
Methods performing a similar task but in a different manner are given the same name,
different signatures. This makes it easier for programmers to remember.*/
/*Q3. Create a class containing the following overloaded methods
double area(int) -> circle
int area(int, int) -> rectangle
int area(int, int, int) -> triangle
Create a main() that uses these methods*/
class CompuAssign4_Overload 
{
    public static double area(int r) 
    {
        return Math.PI * Math.pow(r,2);
    }

    public static int area(int l, int b) 
    {
        return l * b;
    }

    public static double area(int a, int b, int c) 
    {
        int s = a + b + c;
        double ar = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        return ar;
    }

    public static void main() 
    {
        double cArea = area(10);
        System.out.println("The area of the circle is " + cArea);
        int rArea = area(10,20);
        System.out.println("The area of the rectangle is " + rArea);
        double tArea = area(10,20,30);
        System.out.println("The area of the triangle is " + tArea);
    }
}
/*Consider the following overloaded methods
A. callMe(int)
B. callMe(float)
Q4. Which method is called when the following calls are made?
a. callMe(100); A
b. callMe(212L); B
c. callMe(2.3f); B
d. callMe(3.0); error
You may have to write a program to understand what is actually going to happen. Please write your
program, if you do so*/
