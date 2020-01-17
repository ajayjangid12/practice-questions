import java.util.*;  
public class anagram {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String a;
      String b;
      int al,bl;
      a=sc.nextLine();
      String c=a.toLowerCase();
      b=sc.nextLine();
      String d=b.toLowerCase();
      al=c.length();
      bl=d.length();
      if(al==bl)
      {int sum1=0;
      int sum2=0;
    	  for(int i=0;i<al;i++)
    	  {
    	     sum1=sum1+c.charAt(i) ;
    	     sum2=sum2+d.charAt(i) ; 
    	  }
    	  if(sum1==sum2)
    	  {
    		  System.out.println("Anagram");
    	  }
    	  else
          {
        	  System.out.println("Not anagram");
          }

      }
      else
      {
    	  System.out.println("Not anagram");
      }

	}

}
