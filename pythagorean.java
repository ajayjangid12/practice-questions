import java.util.*;  
public class abcd {

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
    	  int sum=arr[i]*arr[i];
    	  for(int k=i+1;k<n-1;k++)
    	  {
    		  sum=sum+arr[k]*arr[k];
    		  for(int l=k+1;l<n;l++)
    		  {  
    	  if(sum==arr[l]*arr[l])
    	  {
    		  flag=1;
    	  }
    	  else {
    		  continue;
    	  }
    		  }
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
