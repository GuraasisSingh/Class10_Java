import java.util.Scanner;
/**
 * Array is collection of data of same type.
 * int g[](creates a referece in the memory)=new int[4];(allocates memory to the reference)
 * This creates a blank array.
 * int g[]={2,5,4,3,2};
 * This creates an array with values
 * Acessing the elements of an array:
 * int m[]=new int[5];
 * m[3]=6;
 * m[0]=4;
 * System.out.println(m[0]);//4
 * Length of an array -> m.length
 * Display an Array:
 * for(int x=0;x<n.length;x++)
 *   System.out.println(n[x]);
 */
public class Array
{
    static Scanner sc=new Scanner(System.in);
    public static void sumArray()
    {
        int n[]=new int[3],sum=0;
        
        for(int x=0;x<n.length;x++){
            System.out.println("Enter a number:");
            n[x]=sc.nextInt();            
        }
        for(int x=0;x<n.length;x++){
            sum+=n[x];
        }
        System.out.println(sum);
    }
    public static void highestInArray()
    {
        int n[]=new int[10];        
        for(int x=0;x<n.length;x++){
            System.out.println("Enter a number:");
            n[x]=sc.nextInt();            
        }
        int g =n[0];        
        for(int x=0;x<n.length;x++){
            if(n[x]>g)
            g=n[x];
        }
        System.out.println(g);
    }
    public static void highestOddAndEven(){
        int m[]={1,2,3,4,5,6,7,8,9,10};
        int hev=1,hod=2;
        for(int x=0;x<m.length;x++){
            if(m[x]%2==0){
                if(hev==1 || m[x]>hev)
                hev=m[x];
            }
            else{
                if(hod==2 || m[x]>hod)
                hod=m[x];               
            }
        }
        if(hev == 1)
        System.out.println("Even Number not found");
        else
        System.out.println(hev);
        if(hod == 1)
        System.out.println("Odd Number not found");
        else
        System.out.println(hod);
    }
    public static void firstEvenNum(){
        int m[]={1,3,5,7,9};
        int ev=1;
        for(int x=0;x<m.length;x++){
            if(m[x]%2==0)
            {
                ev=m[x];
                break;
            }
        }
        if(ev==1)
        System.out.println("Even Number not found");
        else
        System.out.println(ev);
        
    }
    public static void stringStartsWith()
    {
        String names[]=new String[10];
        for(int x=0;x<names.length;x++){
            System.out.println("Enter a name:");
            names[x]=sc.next();
        }
        for(int x=0;x<names.length;x++){
            if(names[x].startsWith("gur"))
            System.out.println(names[x]);
        }        
    }
    public static void oddSumArray()
    {
        int n[]=new int[10],sum=0;        
        for(int x=0;x<n.length;x++){
            System.out.println("Enter a number:");
            n[x]=sc.nextInt();            
        }
        for(int x=0;x<n.length;x++){
            if(n[x]%2==1)
            sum+=n[x];
        }
        System.out.println(sum);
    }
    /**
     * Write a program to take an array and find the sum of the first half of the array and sum of the second half of the array.
     * e.g. if the array is {1,2,3,4,5,6} then the sum of the first half is 1+2+3=6 and the sum of the second half is 4+5+6=15
     * If the number of elements in the array is odd,then the middle element goes to the first half.
     */
    //A more efficient way
     public static void sumInHalves()
    {
        int n[]={1,2,3,4,5,6,7},m=n.length,h=m/2,sum1=0,sum2=0;
        if (m%2==1)
        h++;
        for(int i=0;i<m;i++)
        {
            if(i<h)
            sum1+=n[i];
            else
            sum2+=n[i];
        }
        System.out.println("The sum of first half is :"+sum1);
        System.out.println("The sum of second half is :"+sum2);
    }
    // Linear / Sequential Search-> used in unsorted data like newspaper ,magazine etc.
    public static void linearSearch()
    {
        int m[]={1,2,3,4,5,6,7,8,9,10},n=7;
        boolean found = false;
        for(int x=0;x<m.length;x++)
        {
            if(m[x]==n)
            {
                found=true;
                break;
            }
        }
        if(found)
        System.out.println("Found!");
        else
        System.out.println("Not Found!");
    }
    public static void stringLinearSearch()
    {
        String m[]={"Alpha","Beta","Gamma","Delta","Omicron"},n="Delta";
        boolean found = false;
        for(int x=0;x<m.length;x++)
        {
            if(m[x].equals(n))
            {
                found=true;
                break;
            }
        }
        if(found)
        System.out.println("Found!");
        else
        System.out.println("Not Found!");
    }
    // Binary Search -> used in sorted data like a phone directory or a dictionary  
    public static void binarySearch()
    {
        int m[]={5,38,49,73,76,79,86,89,92,95},n=89,lo=0,hi=m.length-1,mid;
        boolean found=false;
        while(lo<=hi)
        {
            mid=(lo+hi)/2;
            if(m[mid]==n)
            {
                found=true;
                break;
            }
            else
            if(n>m[mid])
            lo=mid+1;
            else
            hi=mid-1;
        }
        if (found)
        System.out.println("Found");
        else
        System.out.println("Not Found!");
    }
    public static void stringBinarySearch()
    {
        String m[]={"Apple","Banana","Guava","Kiwi","Pomegranate","Watermelon"},n="Kiwi";
        int lo=0,hi=m.length-1,mid;
        boolean found=false;
        while(lo<=hi)
        {
            mid=(lo+hi)/2;
            if(m[mid].equals(n))
            {
                found=true;
                break;
            }
            else
            if(n.compareTo(m[mid])>0)
            lo=mid+1;
            else
            hi=mid-1;
        }
        if (found)
        System.out.println("Found");
        else
        System.out.println("Not Found!");
    }
    public static void arrayCopy()
    //System.arraycopy(object source_arr,int source pos, object dest_arr, int desPos, int length)->  makes copy of an arry
    {
        int m[]={0,1,2,3,4},n[]=new int[m.length];
        System.arraycopy(m,0,n,0,5);
        for(int x=0;x<n.length;x++)
          System.out.println(n[x]);
    }
    public static void additionalElement()
    //System.arraycopy(object source_arr,int source pos, object dest_arr, int desPos, int length)->  makes copy of an arry
    {
        int m[]={0,1,2,3,4},n[]=new int[m.length+1];
        System.arraycopy(m,0,n,0,5);
        m=n;
        for(int x=0;x<m.length;x++)
          System.out.println(m[x]);
    }
    public static void findUnique()
    {
        int m[]={1,2,3,4,5},n[]={2,4,6,8,10};
        for(int x=0;x<m.length;x++)
        {
            boolean found =false;
            for(int y=0;y<n.length;y++)
            {
                if(m[x]==n[y])
                {
                    found=true;
                    break;
                }
            }
            if(found==false)
            System.out.println(m[x]);
        }
    }
    public static void findCommon()
    {
        int m[]={1,2,3,4,5},n[]={2,4,6,8,10};
        for(int x=0;x<m.length;x++)
        {
            boolean found =false;
            for(int y=0;y<n.length;y++)
            {
                if(m[x]==n[y])
                {
                    System.out.println(m[x]);
                }
            }            
        }
    }
    public static void findUnion()
    {
        int m[]={1,2,3,4,5},n[]={2,4,6,8,10};
        for(int x=0;x<n.length;x++)
          System.out.println(n[x]);
        for(int x=0;x<m.length;x++)
        {
            boolean found =false;
            for(int y=0;y<n.length;y++)
            {
                if(m[x]==n[y])
                {
                    found=true;
                    break;
                }
            }
            if(found==false)
            System.out.println(m[x]);
        }
    }
}




