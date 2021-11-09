import java.util.*;
public class CompuAssign5
{
    /*
    St. Stephen’s School – Assignment 05
    COMPUTER APPLICATIONS
    16.06.2021 to 19.05.2021
     */
}
/*Q1.
Write a program for following specification:
Class name – Student
Data members :
Name, Hindi marks, English marks, Maths marks, Computer marks, average, grade.
Member methods:
Student( ) : constructor to initialize data members Name , Hindi marks, English
marks, maths marks, computer marks.
void accept( ) : to accept name and marks in 3 subjects given.
void calcavg( ): to calculate and store the grade according to following slab:
Average marks Grade
>=90 A++
>=75 <90 A
>=60 <75 B
< 60 C
void display(): display all the instance variables.
now write the main method to create the object of the class and call the above
methods.
Answer: The variables marked in RED are instance variables*/
class CompuAssign5_Student {
    private String name, grade;
    private int hin, eng, mat, comp;
    private float avg;
    public CompuAssign5_Student() { // Only using name, grade, all others will become zero
        name = "";
        grade = "";
    }

    public CompuAssign5_Student(String n, int h, int e, int m, int c) {
        name = n;
        hin = h;
        eng = e;
        mat = m;
        comp = c;
    }

    void accept() {
        // create a Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // take input from the user and store in local variables
        System.out.print("Please enter name: ");
        String n = sc.nextLine();
        System.out.print("Please enter Hindi marks: ");
        int h = sc.nextInt();
        System.out.print("Please enter English marks: ");
        int e = sc.nextInt();
        System.out.print("Please enter Maths marks: ");
        int m = sc.nextInt();
        System.out.print("Please enter Computer marks: ");
        int c = sc.nextInt();
        // pass the values of the local variables to the instance variables
        name = n;
        hin = h;
        eng = e;
        mat = m;
        comp = c;
    }

    void calcavg() {
        // calculate the average and store in a local variable
        float a = (hin + eng + mat + comp) / 4.0f;
        // pass this value to the instance variable
        avg = a;
        // Find what the grade should be
        String g = "";
        if(a >= 90) // You can use avg also here
            g = "A++";
        else
        if(a >= 75)
            g = "A";
        else
        if(a >= 60)
            g = "B";
        else
            g = "C";
        // now pass the value to the instance variable
        grade = g;
    }

    void display() {
        System.out.print("Name: " + name);
        System.out.print("Hindi marks: " + hin);
        System.out.print("English marks: " + eng);
        System.out.print("Maths marks: " + mat);
        System.out.print("Computer marks: " + comp);
        System.out.print("Average: " + avg);
        System.out.print("Grade: " + grade);
    }

    public static void main() {
        CompuAssign5_Student s = new CompuAssign5_Student();
        s.accept();
        s.calcavg();
        s.display();
        Student t = new Student("Amit", 87, 78, 68, 97);
        t.calcavg();
        t.display();
    }
}
/*Q2.
Write a program to create a class called Student
Instance variables:
rollno integer
name String
subject String
marks float
Methods:
Default Constructor: Should display - “An object has been created.”
Parameterised constructor: should pass the values of the formal arguments to the
instance variables. Marks should be from 0 to 100. If the marks are <0 or > 100, then
store -1 in the marks.
show(): should display the values of the instance variables with proper messages. It
should also display the grade obtained by the student. The grade should be
calculated using the following table:
0 to <40 “Failed”
40 to <60 “Passed”
60 to <90 “Credit”
90 to 100 “Excellent”
If the marks are -1, display “Error in marks”
Write the main() which performs the following tasks:
a. Create an object ob1 of Student class.
b. Create an object ob2 of Student class and pass it values 1011, “Rajesh”,
“English”, 98
c. Display the contents of ob1 (using show()).
d. Display the contents of ob2 (using show()).
Answer: The variables marked in RED are instance variables*/
class CompuAssign5_Student1 {
    private int rollno;
    private String name, subject;
    private float marks;

    public CompuAssign5_Student1() {
        System.out.println("An object has been created");
    }

    public CompuAssign5_Student1(int r, String n, String s, float m) {
        rollno = r;
        name = n;
        subject = s;
        if(m >= 0 && m <= 100)
            marks = m;
        else
            marks = -1;
    }

    public void show() {
        System.out.println("Roll number: "+ rollno);
        System.out.println("Name: "+ name);
        System.out.println("Subject: "+ subject);
        if(marks == -1)
            System.out.println("Error in Marks");
        else {
            System.out.println("Marks: "+ marks);
            if(marks < 40)
                System.out.println("Failed");
            else if(marks < 60)
                System.out.println("Failed");
            else if(marks < 90)
                System.out.println("Credit");
            else
                System.out.println("Excellent");
        }
    }

    public static void main() 
    {
        CompuAssign5_Student1 ob1 = new CompuAssign5_Student1();
        CompuAssign5_Student1 ob2 = new CompuAssign5_Student1(1011, "Rajesh", "English", 98);
        ob1.show();
        ob2.show();
    }
}

