
/** Demo d;//reference created
 * new Demo();//object created
 * Demo() is contructor ->building objects
 * Contructor characteristics:-
 * 1.It is a method 
 * 2.Has the same as the class name
 * 3.Has no return type, not even void 
 * 4. It is automatically executed when object is to be created
 * 5.If you dont create a constructor, java provides one(default constructor)
 * 6.It can be overloaded.
 * 7.If you create an overloaded constructor,java doesn't provide the default one.
 * 8.Do? It creates objects and perform any initial task.
 *      
All instance variables should be private and non-static
All methods should be public and non-static
constructors should be public and non-static
main() should be public and static

Can a method be private?
Yes, when it is not supposed to be visible to outside world

Can a constructor be private?
Yes.

Should a constructor be private?
No.
 */
public class Constructors
{
    public static int snum=100;
    public int inum=10;
    public static void main()
    {
        System.out.println(snum);
        Constructors c = new Constructors();
        System.out.println(c.inum);
    }
    public class Demo
    {
        private int num;
        public void set(int n)
        {
            num=n;
        }

        public void show()
        {
            System.out.println(num);
        }

        public void main()
        {
            Demo a=new Demo();
            Demo b=new Demo();
            a.show();
            a.set(11);
            b.set(16);
        }

    }
    class Student {
        private int rollno;
        private String studentName;
        private float marks;

        public void set(int r, String s, float m) 
        {
            rollno = r;
            studentName = s;
            marks = m;
        }

        public void show() 
        {
            System.out.println(rollno);
            System.out.println(studentName);
            System.out.println(marks);
        }

        public Student()
        {

        }

        Student(int r, String s, float m)
        {
            rollno = r;
            studentName = s;
            marks = m;
        }

        public void main()
        {
            Student a = new Student();             //a -> 0, "", 0.0
            a.set(1011, "Rajesh", 93);            //a -> 1011, "Rajesh", 93.0
            Student b = new Student();            //b -> 0, "", 0.0    
            b.set(1012, "Amit", 92);            //b -> 1012, "Amit", 92.0
            a.show();
            b.show();
            Student c = new Student(1013, "Pulkit", 99);
            c.show();
        }
    }
}
