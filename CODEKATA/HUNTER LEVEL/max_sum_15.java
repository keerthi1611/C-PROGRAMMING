import java.util.*;
class max 
{
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n,i;
	    n=sc.nextInt();
	    int sum=0;
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(i=0;i<n;i++)
	    {
	     sum+=a[i];   
	    }
	    System.out.print(sum);
	}
}
