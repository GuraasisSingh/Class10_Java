
/**
 * Write a program to take an array and find the sum of the first half of the array and sum of the second half of the array.
 * e.g. if the array is {1,2,3,4,5,6} then the sum of the first half is 1+2+3=6 and the sum of the second half is 4+5+6=15
 * If the number of elements in the array is odd,then the middle element goes to the first half.
 */
public class CompuAssign8
{
    public static void main()
    {
        int n[]={1,2,3,4,5,6,7},m= n.length,h,sum1=0,sum2=0;
        if (m%2==0)
        h=m/2;
        else
        h=(m/2)+1;
        for(int i=0;i<h;i++)
        {
            sum1+=n[i];
        }
        for(int j=h;j<m;j++)
        {
            sum2+=n[j];
        }
        System.out.println("The sum of first half is :"+sum1);
        System.out.println("The sum of second half is :"+sum2);
    }
}
