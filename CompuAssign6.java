import java.util.Scanner;
public class CompuAssign6
{
    /*
     * St. Stephen’s School – Assignment 06
    COMPUTER APPLICATIONS
    21.05.2021 to 26.05.2021 – Answer Key

     */
}
/*Q1.
Define a class Salary described as below :
Data Members: Name, Address, Phone, Subject Specialisation, Monthly Salary,
Income Tax.
Member methods:
(i) To input the details of a teacher including the monthly salary.
(ii) To display the details of the teacher.
(iii) To compute the annual Income Tax as 5% of the annual salary
above Rs. 1,75,000/-.
Write a main method to create object of a class and perform the
following tasks.
Create an object t1 of Salary class
Input values from the user into t1
Compute Income Tax for t1
Display t1
Please follow these rules every time you do a class type program:
1. Accept or Input means taking input from the user. DO NOT input any
computable data (Income Tax, in this case). The computing of Income
Tax is done in point (iii).
2. All Data members/fields/instance variables should be private and
non-static
3. Create only the variables enumerated here. Not one less. Not one
more.
4. All methods should be public and non-static
5. The main() method should be public and static.
6. Use proper naming conventions for all components 
 */
class CompuAssign6_Salary {
    String name, phone, subspl;
    // phone is taken as String. It might contain a number starting with zero or
    //have hypens in it. It is ok if you have taken it as long
    float mntSal, iTax;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter name: ");
        name = sc.nextLine(); // the entered data is directly stored in theinstance variable
        phone = "";
        subspl = "";
        mntSal = 0;
        //iTax is not input
    }

    public void display() {
        // All instance variables will be displayed here
        System.out.println("Name: " + name);
        System.out.println("Income tax: " + iTax);
    }

    public void computeITax() {
        float yrSal = mntSal * 12;
        if(mntSal > 175000)
            iTax = iTax + iTax * 5 / 100;
        else
            iTax = 0;
    }

    public static void main() {
        CompuAssign6_Salary t1 = new CompuAssign6_Salary();
        t1.input();
        t1.computeITax();
        t1.display();
    }
}
/*
 * Q2.
String questions:
1. Store the following string in a String object s:
He yelled, "Hurry up."
String s = "He yelled, \"Hurry up.\" ";
// use \ back slash here (not / forward slash)
// All escape sequences start with \
Q3.
String s1 = "Bioinformatics";
Perform the following actions on s1:
1. Find and display the position of the first occurrence of i
System.out.println(s1.indexOf('i'));
2. Find and display the position of the last occurrence of i
System.out.println(s1.lastIndexOf('i'));
3. Find and display the character at position 9.
System.out.println(s1.charAt(9));
4. Extract and display "form" from this String
System.out.println(s1.substring(5,9));
5. Extract and display "inform" from this String
System.out.println(s1.substring(3,9));
6. Extract and display "informatics" from this String
System.out.println(s1.substring(3,14));
System.out.println(s1.substring(3,s1.length()));
System.out.println(s1.substring(3)); // best option
7. Extract and display the two halves of s1
System.out.println(s1.substring(0,s1.length()/2) +
s1.substring(s1.length()/2));
8. Extract and display the string between the first and the last i
System.out.println(s1.substring(s1.substring(s1.indeOf('i')+1,s1.lastIndexOf('
i')));
System.out.println(s1.substring(s1.substring(1,12)));
9. Find whether 'g' exists in s1
if(s1.charAt('g') != -1)
10. Extract string starting from the 2nd character to the 2nd last character in s1.
System.out.println(s1.substring(1,s1.length()-1));
 */