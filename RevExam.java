
/**
 *1 byte =8 bits (0,1)
 *1 short = 16 bits (12)
 *1 int = 32 bits(176)
 *1 float =32bits(2.6f)
 *1 long = 64 bits(176L)
 *1 double = 64 bits(2.5)
 *1 char = 16 bits('A')
 *1 boolean =8bits(uses 1 bit only)(true or false)
 *Precedence:
 *String>double>float>long>int>short>byte
 *
 *int x=23; ->decimal number system
 *x=0x23; ->hexadecimal system
 *x=0b10110; -> binary system
 *x=01234; ->octal number system
 *
 *int d =12,345,678,901 xxxxxErrorxxxxx
 *int d= 12_345_678_901 Acceptable
 *
 *
 *Operators::
 *Arithmetic:+,-,*,/,%[All unary a++,a--, binary a+b,a-b and ternary opertors a>b?5:6(condition?value1:value2)]
 *Comparison Operators: >,<,>=,<=,==,!=
 *Logical Operators: && ,!,||
 *Assignment Operators: =,+=,-=,*=,/=,%=
 *
 *Input:
 *By Scanner:-
import java.util.*; or import java.util.Scanner;
public class Input_By_Scanner
{
    public static void Input_By_Scanner()
    {
        int n;
        String name;
        char c;
        float d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.println("Enter a name");
        name =sc.nextLine();
        System.out.println("Enter a character");
        c=sc.next().charAt(0);
        System.out.println("Enter a decimal");
        d=sc.nextFloat();
    }
}
 *By Buffered Reader:
import java.io.*;
public class Input_By_BufferedReader
{
    public static void Input_By_BufferedReader()throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter name");
       String name= br.readLine();
       System.out.println("Enter number");
       int n = Integer.parseInt(br.readLine());
       System.out.println("Enter decimal");
       float d= Float.parseFloat(br.readLine());
       System.out.println("Enter character");
       char c= (char)br.read(); or br.readLine().charAt(0);
    }
}
if (condition)
{
    Statement1
}
else
{
    Statement2
}

Method definition:
void main ()
{
    
}
1.return type
2.name
3.arguments(values passed to methods)
4.body{}




 */
public class RevExam
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class RevExam
     */
    public RevExam()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
