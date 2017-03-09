import java.util.Scanner;
public class Assignment6_4 
{
    public static void main(String[] args)
    {
        int a[]=new int[10];
        int i,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 array elements in an ascending order:");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("Enter element to be searched:");
        x=sc.nextInt();
        
        
        Assignment6_4 obj=new Assignment6_4();
        
        
    
        obj.binarysearch(a,x);
    }
    
    
    
    void binarysearch(int[] a,int x)
    {
        int low,mid,high,i;
        low=0;
        high=9;
        while(low<high)
        {
            mid=(low+high)/2;
            if(a[mid]==x)
            {
                System.out.println("Element found at "+(mid+1)+" position in an array");
               System.exit(0);
            }
            else if(x>a[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        System.out.println("Element is not found in an array");
    }
}
