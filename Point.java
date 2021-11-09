
/**

In Java, String is basically an object that represents sequence of char values. For Strings we can use
in built java classes - String, StringBuilder, StringBuffer. We only have String in our syllabus, so we will do that only.
How can we create String objects?
1. By using a String literal
String name = "Hello";
2. By using the new keyword
String name = new String("Hello");
Difference between the two?
The difference is how memory is allocated to the object.
We have got used to creating objects using the new keyword. So when we write
String name = new String("Hello");
Java creates a new object, stores "Hello" in it and passes the address of this object to the reference name. Simple.
Creation of the String object using String literal is more commonly used.
Let us see what happens when we write the statement:
String name = "Hello";
Java actually create a pool of String objects in memory - called String pool or String literal pool.
When you start a program, the pool is empty. When you create the first String (name) above, JVM (Java Virtual Machine) looks into the pool to check if "Hello" exists in the pool. It does not exist. So JVM creates one object "Hello" in the pool and passes its address to name (reference).
Suppose I write another line in my program
String yourName = "Hello";
JVM will again look inside the pool. It finds "Hello" there. It simply passes the address of "Hello" to yourName.
Let me create another statement
String greeting = "Hello";
Same thing happens. No new object is created. The address of "Hello" is passed to greeting also.
We can now see that all the 3 String references - name, yourName and greeting - are having the
address of the same object. If you display any of them, "Hello" will be displayed.
What is the benefit of this kind of allocation? It has been observed that Strings occupy quite a lot of memory. If in the above example, JVM had been creting different objects for the 3 Hellos, we would have been using up 3 times more memory.
String name = "Hello"; // First object created. Address goes to name
String yourName = "Hello"; // No object created. Address of the first passed
String greeting = "Hello"; // No object created. Address of the first passed
yourName = "Goodbye";
What happens now? As the pool does not have "Goodbye", a new object is created with "Goodbye" and address passed to yourName.
yourName was earlier pointing to "Hello", and is now pointing to "Goodbye".
The value of yourName has NOT changed. It has simply switched to another object. This property of Strings is called immutability (unchangeable). We say that Strings are immutable.
Example: String a;
a = "Apple"; a = "Mango"; a = "Grapes";
It appears that the value of a is changing from Apple to Mango to Grapes. Practically it shows the
changed values also. But internally, a was first pointing to an object "Apple", then the address
changed to that of "Mango". "Apple" did not change to "Mango". The reference of a changed from "Apple" to "Mango".
I will explain this in the class tomorrow. Do not worry.
We will be using a set of methods (all String class methods). The list of methods is given below:
String trim ()
String toLowerCase()
String toUpperCase()
int length( )
char charAt (int n)
int indexOf(char ch)
int lastIndexOf(char ch)
String concat(String str)
boolean equals (String str)
boolean equalsIgnoreCase(String str)
int compareTo(String str)
int compareToIgnoreCase(String str)
String replace (char oldChar,char newChar)
String substring (int beginIndex)
String substring (int beginIndex, int endIndex)
boolean startsWith(String str) boolean endsWith(String str)
String valueOf(all numeric types)
Here is something we will try out tomorrow:
Displaying the address of an object.
Demo a = new Demo(100);
System.out.println(a); // will display Demo@abc7845
// This means a is an object of Demo class and is located at address
// abc7845
String s = new String("one");
System.out.println(s); // will display one
System.out.println(System.identityHashCode(s));
// will display 1ae66
// means s is stored on memory location 1ae66

String

"" -> factual information Facts
"hot"
"cold"
"Rajinder"
"Chandigarh"
"9814098140"
9814098140
Non-numeric

String is an in-built class in Java
StringBuilder, StringBuffer        xxxx

A.
String a = new String("Hello");
a -> reference
new String("Hello"); -> object
B.
String b = "Hello";

Java uses a pool of Strings.

String a = "Java";
String b = "Java";

Methods to perform operations on Strings

double d = Math.pow(10,2);
Class Math
double pow(double, double); -> power of a to b
double ceil(double); -> higher int value than the arg passed

Class String
int length() -> the length of the string

String s = "Chandigarh";
int l = s.length();
SOP(l);     -> 10
s = "Mohali";
l = s.length();
SOP(l); -> 6
l = "Panchkula".length();
SOP(l); -> 9

Orphans XXXX

 */

public class Point
{

    private int x,y;
    public Point() 
    { 
        x = y = 0;
    }

    public Point(int m) 
    { 
        x = y = m; 
    }

    public Point(int m, int n) 
    {
        x = m; 
        y = n;
    }

    public void show() 
    { 
        System.out.println("x = " + x + " y = " + y); 
    }

    public void set(int m) 
    {
        x = y = m; 
    }

    public void set(int m, int n) 
    {
        x = m; y = n; 
    }

    public static void main() 
    {
        // 0,0
        Point p = new Point();
        // 5,5
        Point m = new Point(5);
        // 6,9
        Point n = new Point(6,9);
        // p -> 3,5
        p.set(3,5);
        // n -> 6,6
        n.set(6);
        n.show();    //-> 6,6
        p.show();    //-> 3,5
        m.show();    //-> 5,5
    }
}

//Point a = new Point();        Mem loc 101    -> 0,0
//a.show();                    Mem loc 101 -> 0,0
//a = new Point(3,4);            Mem loc 201 -> 3,4            
//a.show();                    Mem loc 201 -> 3,4

