public class Revision
{
   /*static void numSystem()
   {
       int x=2_3_4;//ignores underscore
       System.out.println(x);
       x=0x23;
       System.out.println(x);
       x=0b1101;
       System.out.println(x);
       x=0123;
       System.out.println(x);
       double d= 0.0d;
       d=0.0f;
       //long g= 2.3f; throws error
       //1 byte= 8 bits
       //1 short =16 bits or 2 bytes
       //1 char= 16 bits or 2 bytes
       //1 int = 32 bits or 4 bytes
       //1 long = 64 bits or 8 bytes
       //1 float =32 bits or 4 bytes
       //1 double = 64 bits or 8 bytes
       //1 boolean = 1 bit as usage but storage of 1 byte or 8 bits
       //Precedence
       //higher to lower
       //String>double>float>long>int>short>byte
    }*/
    
   public static void show()
   {
       String a=new String("java");
       String b=new String("java");
       System.out.println(a);
       System.out.println(b);
       b="Java";
       System.out.println(b);
       a=b;
       System.out.println(a);
   }
   public static void stringMethods()
   {
       //1. int length()
       //         0123456789->zero based index.
       String s= "Chandigarh";
       int l = s.length();
       System.out.println(l);
       //2. char charAt(int n)
       char c =s.charAt(4);
       System.out.println(c);
       //3. int indexOf(char c)
       int n= s.indexOf('g');
       System.out.println(n);
       //4. int indexOf(String s)
       n= s.indexOf("garh");
       System.out.println(n);
       //5. int lastIndexOf(char c)
       n=s.lastIndexOf('a');
       System.out.println(n);
       //6. int lastIndexOf(String s)
       n=s.lastIndexOf("an");
       System.out.println(n);
       //7. String substring(int beginIndex, int endIndex) // goes from beginIndex and ends before endndex
       String str = s.substring(1,5);
       System.out.println(str);
       //8. String substring(int beginIndex) // goes from beginIndex till ends 
       str = s.substring(1);
       System.out.println(str);
       //9.  String replace(char oldChar, char newChar)
       str = s.replace('a','o');
       System.out.println(str);
       //10. boolean startsWith(String str)
       boolean b= s.startsWith("Chan");
       System.out.println(b);
       //11. boolean startsWithIgnoreCase(String str)
       //b= s.startsWithIgnoreCase("ChaN");
       // System.out.println(b);
       //12. boolean endsWith(String str)
       b= s.endsWith("garh");
       System.out.println(b);
       //13. boolean startsWith(String str)
       //b= s.endsWithIgnoreCase("GaRh");
       //System.out.println(b);
       //14. boolean contains(String s)
       b= s.contains("hand");
       System.out.println(b);
       //15. String valueOf(all numeric types)
       float f= 3.696f;
       String val =String.valueOf(f);
       System.out.println(val);
       int num=1234;
       val=String.valueOf(num);
       System.out.println(val);
       //16. String trim()
       String tr =" apple   mango   ";
       String t=tr.trim();
       System.out.println(t);
       //17. String toLowerCase();
       str="BIoLogY";
       str= str.toLowerCase();
       System.out.println(str);
       //18. String toUpperCase();
       str= str.toUpperCase();
       System.out.println(str);
       //19. String concat(String s)
       str=str.concat(" is Very easy");
       System.out.println(str);
       //20. boolean equals(String  s)
       b="Hi".equals("Hi");
        System.out.println(b);
        //21. boolean equalsIgnoreCase(String s)
       b="hi".equalsIgnoreCase("HI"); 
       System.out.println(b);
   }
   static void compareToMethod()
   {
     //22. int compareTo(String str)
     char c ='A';
     System.out.println(c);
     int x = c;
     System.out.println(x);
     c++;
     System.out.println(c);
     System.out.println("Apple".compareTo("Apple"));
     System.out.println("Apple".compareTo("Apricot"));//returns length difference in -
     System.out.println("Apricot".compareTo("Apple"));//returns length difference in +
     System.out.println("Apple".compareTo("Applets"));
     System.out.println("a".compareTo("A"));//Difference between a small letter and a capital letter is +32
     System.out.println("A".compareTo("a"));//Difference between a capital letter and a small letter is -32
     System.out.println("b".compareTo("B"));//Difference between a small letter and a capital letter is +32
     /**
      * if(a.comparesTo(b)> 0) -> a>b
      * if(a.comparesTo(b)< 0) -> a<b
      * if(a.comparesTo(b)>=0) -> a>=b
      * if(a.comparesTo(b)<=0) -> a<=b
      * if(a.comparesTo(b)==0) -> a==b
      * if(a.comparesTo(b)!=0) -> a!=b
      */
     //23. int compareToIgnoreCase(String s)
     System.out.println("Apple".compareToIgnoreCase("APPLE"));
   }
}
/*
import java.io.*;
Q1. Find whether a number input by the user is Positive - even or odd, Negative - even or odd.
Q2. Display the suffix st, rd, nd, th depending on a number (single digit) input by the user
9 -> 9th
3 -> 3rd
2 -> 2nd
Q3. Input a number.
If the number is divisible by 3 display Fizz
If the number is divisible by 5 display Buzz
If the number is divisible by 3 and 5 display FizzBuzz
otherwise display the number
Q4. Input a number. Find whether the number is a perfect number. (A perfect number is one
which is equal to the sum of its factors.
E.g.
# 6 (sum of factors is 1 + 2 + 3 = 6).
# 28 sof is 1 + 2 + 4 + 14 = 28
Q5. Display the numbers 0 to 9 along with a suffix.
0 – 0th
1 – 1st
2 – 2nd
3 – 3rd
4 – 4th
.
.
9 – 9th


public class ExamRevision
{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    public void q1() throws IOException
    {
        System.out.println("Enter a number");
        int number = Integer.parseInt(br.readLine());
        if (number>0)
        {
            System.out.println("Positive");
            if (number%2==0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
        else
        if(number<0)
        {
            System.out.println("Negative");
            if (number%2==0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
        else
            System.out.println("Zero");
    }

    public void q2() throws IOException
    {
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        if (n==1)
            System.out.println(n+"st");
        else
        if (n==2)
            System.out.println(n+"nd");
        else
        if (n==3)
            System.out.println(n+"rd");
        else
            System.out.println(n+"th");
    }

    public void q4() throws IOException 
    {
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        int sum =0;
        for (int x=1;x<=n/2;x++)
        {
            if (n%x==0)
                sum+=x;
        }
        if(sum==n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }

    public void q5() throws IOException
    {
        int u;
        for(u=0;u<=9;u++)
        {
            if (u==1)
                System.out.println(u+"st");
            else
            if (u==2)
                System.out.println(u+"nd");
            else
            if (u==3)
                System.out.println(u+"rd");
            else
                System.out.println(u+"th");
        }
    }

    public static void main() throws IOException
    {
        ExamRevision er=new ExamRevision();
        er.q1();
        er.q2();
        er.q4();
        er.q5();
    }
}

*/