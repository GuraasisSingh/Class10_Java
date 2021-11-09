class CompuAssign7
{
    /*Computer Applications – Assignment 07
    To be submitted by 09.06.2021
    Q1.
    Input an email address. Display the personal name, subdomain and domain
    rskoura@gmail.com should be broken into rskoura, gmail, com
    rskoura.personal@yahoo.co.in should be broken into rskoura.personal, yahoo, co.in
     */
}
class CompuAssign7_1
{
    static void main()
    {
        String s = "rskoura@gmail.com";
        int atPos = s.indexOf('@'); // position of the @ sign
        String s1 = s.substring(0,atPos);
        String t = s.substring(atPos+1); // The string AFTER the @ sign
        int dotPos = t.indexOf('.');
        String s2 = t.substring(0,dotPos);
        String s3 = t.substring(dotPos+1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);}
}
/*Q2.
Input a String. Display the words which are special words (they start and end with the same letter).
*/
class CompuAssign7_2
{
    static void main()
    {
        String s = "";
        int a = s.length();
        if(s.charAt(0) == s.charAt(a-1))
            System.out.println("Special Word");
        else
            System.out.println("Not a special Word");
        }
    }
/*Q3.
Check whether a password contained in a string is a strong password. A password is strong when all
the following conditions are true.
1. It should have at least 8 letters
2. It should have at least one special character (#$%^&@ allowed)
3. It should have at least one uppercase letter
4. It should have at least one lowercase letter
5. It should have at least one digit*/
class CompuAssign7_3
{
    static void main()
    {
        String s = "";
        int a = s.length();
        if(a < 8) {
            System.out.println("Not a strong password");
        } else {
            int x, ctrSp = 0, ctrUp = 0, ctrLw = 0, ctrDg = 0;
            String splChars = "#$%^&@";
            for(x = 0; x <a; x++) {
                char c = s.charAt(x);
                if(splChars.contains(c+""))
                    ctrSp++;
                else
                if(c >= 'a' && c <= 'z')
                    ctrLw++;
                else
                if(c >= 'A' && c <= 'Z')
                    ctrUp++;
                else
                if(c >= '0' && c <= '9')
                    ctrDg++;
            }
            if(ctrDg > 0 && ctrLw > 0 && ctrSp > 0 && ctrUp > 0)
                System.out.println("Strong password");
            else
                System.out.println("Not a strong password");
        }
    }
}
/*Q4.
Take a String. Find the number of vowels in the string
*/
class CompuAssign7_4
{
    static void main()
    {
        String s = "";
        int x, a = s.length(), ctrVw = 0;
        String vowels = "AEIOUaeiou";
        for(x = 0; x < a; x++) {
            char c = s.charAt(x);
            if(vowels.contains(c+""))
                ctrVw++;
        }
        System.out.println("The number of vowels in this string: " + ctrVw);
    }
}
/*Q5.
Take a String. Find the number of each vowel in the string
*/
class CompuAssign7_5
{
    static void main()
    {
        String s = "";
        int x, a = s.length(), ctrA = 0, ctrE = 0, ctrI = 0, ctrO = 0, ctrU = 0;
        for(x = 0; x < a; x++) {
            char c = s.charAt(x);
            if(c == 'a' || c == 'A')
                ctrA++;
            else
            if(c == 'e' || c == 'E')
                ctrE++;
            else
            if(c == 'i' || c == 'I')
                ctrI++;
            else
            if(c == 'o' || c == 'O')
                ctrO++;
            else
            if(c == 'u' || c == 'U')
                ctrU++;
        }
        System.out.println("The number of A's in this string: " + ctrA);
        System.out.println("The number of E's in this string: " + ctrE);
        System.out.println("The number of I's in this string: " + ctrI);
        System.out.println("The number of O's in this string: " + ctrO);
        System.out.println("The number of U's in this string: " + ctrU);
    }
}