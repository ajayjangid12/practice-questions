import java.util.*;  
public class pythagorean {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t,n;
      t=sc.nextInt();
      for(int j=0;j<t;j++)
      {
      n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      
      Arrays.sort(arr);
      int flag=0;
      for(int i=0;i<n-2;i++)
      {
    	  int sum=arr[i]*arr[i]+arr[i+1]*arr[i+1];
    	  if(sum==arr[i+2]*arr[i+2])
    	  {
    		  flag=1;
    	  }
    	  else {
    		  continue;
    	  }
      }
      if(flag==1)
      {
    	  System.out.println("Yes");
      }
      else {
    	  System.out.println("No");
      }
      }
	
	
	}

}
