package NewOne;

import java.util.Locale;
//Kindly remove commentline one by one and use it
//there may be mistakes so sorry in advance..


/*
//with duplicates
public class Practice {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4};
		int b[]= {3,4,5,6};
		int c[]=  new int [a.length+b.length];
		for(int i=0; i<a.length;i++)
		{
			c[i]= a[i];
		}
		int times=0;
		for(int j=0;j<b.length;j++)
		{
		int count=0; 
		   for(int k=0;k<c.length;k++)
		 { 
           if(c[k]==b[j])
           {
        	   count++;
           }
		 }
           if(count==0)
           {
        	   c[a.length+times]=b[j];
        	   times++;
           }
		}	   
		for(int l=0;l<c.length;l++)
		{
			System.out.println(c[l]);
		}

	
	}
}*/
	
/*
//2D ARRAY
class Practice
{
	static int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
    public static void main(String args[])
    {
     for(int row=0;row<arr.length;row++)
     {
    	 for(int col=0;col<arr.length;col++)
    	 {
    		 System.out.print(arr[row][col]+" ");
    	 }
    	 System.out.println(" ");
     }
    }
} */


/*
//2x3 cannot be printed without arr[row].length inside loop  
class Practice
{
	static int arr[][]= {{1,2,3},{4,5,6}};
    public static void main(String args[])
    {
     for(int row=0;row<arr.length;row++)
     {
    	 for(int col=0;col<arr[row].length;col++)
    	 {
    		 System.out.print(arr[row][col]+" ");
    	 }
    	 System.out.println(" ");
     }
    }
}
*/


/*
//Summation of two arrays and saving it in a new array with matrix pattern
class Practice
{
	static int a[][]= {{1,1,1},{1,1,1},{1,1,1}};
    static int b[][]= {{3,3,3},{3,3,3},{3,3,3}};
    static int c[][]= new int[3][3];
	public static void main(String args[])
    {
     for(int row=0;row<a.length;row++)
     {
    	 for(int col=0;col<b[row].length;col++)
    	 {
    		 System.out.print(c[row][col]=a[row][col]+b[row][col]);
    	 }
    	 System.out.println(" ");
     }
     System.out.println(c.length);
    }
}
*/




/*
//Transpose and checking 
class Practice
{
	static int a[][]= {{0,7,0},{7,0,7},{0,7,0}};
	static int b[][]= new int [3][3];
	public static void main(String args[])
    {
		boolean flag = true;
		//Transposing A's rows and col into B's col and rows
		//And checking A index values = B
     for(int row=0;row<a.length;row++)
     {
    	 
    	 for(int col=0;col<b[row].length;col++)
    	 {
    		 b[row][col]=a[col][row];
    		 
    		 if(a[row][col]==b[row][col]) 
    		 {
    			 flag = true;
    		 }
    		 else
    		 {
    			 flag = false;
    			 break;
    		 }
    	 }
    	 
     }
     //For printing this checked - pattern
     for(int row=0;row<a.length;row++)
     {
    	 for(int col=0;col<b[row].length;col++)
    	 {
    		 System.out.print(b[row][col]=a[col][row]);
    	 }
    	 System.out.println(" ");
     }
     if(flag)
     {
    	 System.out.print("The given pattern is a transporse");
     }
     else
     {
    	 System.out.print("The given pattern is a not a transporse");     
    }
    }
} */




/*
//Subtraction of two arrays and saving it in a new array with matrix pattern
class Practice
{
	static int a[][]= {{1,1,1},{1,1,1},{1,1,1}};
  static int b[][]= {{3,3,3},{3,3,3},{3,3,3}};
  static int c[][]= new int[3][3];
	public static void main(String args[])
  {
   for(int row=0;row<a.length;row++)
   {
  	 for(int col=0;col<b[row].length;col++)
  	 {
  		 System.out.print(c[row][col]=b[row][col]-a[row][col]);
  	 }
  	 System.out.println(" ");
   }
  }
} */


/*
class Practice //Summation of N numbers 
{
	public static void main (String args[])
	{
		int n=5;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		
	}

}*/



/*
class Practice //Product of N numbers 
{
	public static void main (String args[])
	{
		int n=5;
		int product=1;
		for(int i=1;i<=n;i++)
		{
		  product = product*i; 
			
		}
		System.out.println(product);
		
	}

} */


/*
class Practice 
{
	public static void main (String args[])
	{
		int n=10;
		for(int i=1;i<=n;i++)
		{
		  if(n%i==0)
		  {
			  System.out.println(i);
		  }
		  else
		  {
		  
		  }
			
		}
	
		
	}

} */

/*
class Practice //Counting the number of factors for the given number 
{
	public static void main (String args[])
	{
		int n=10;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
		  if(n%i==0)
		  {
			  sum=sum+i;
		  }
		  else
		  {

		  }
			
		}
		System.out.println(sum);
        		
	}

} */

/*
//String char based
class Practice
{
	static byte a[]= {'1','2','3','4'}; //Single quotation is must
	public static void main(String args[])
	{	 
		
		String obj =new String(a);		
		System.out.println(obj);

	}
	
}
*/


/*
class Practice
{
	//static String a[]= {"Halogen"};
	public static void main(String args[])
	{	
	
	 //Commonly a string object is created
		String  obj = new String("yagapriyan");
		
		char charAt = obj.charAt(4);
	    int indexOf = obj.indexOf('y');	
	    int lastIndexOf = obj.lastIndexOf('y');	
	    boolean empty = obj.isEmpty();
	    String upperCase = obj.toUpperCase();
	    int length = obj.length();
	    String lowerCase = obj.toLowerCase();
	    String replace = obj.replace('i','a');
	    String replaceAll = obj.replaceAll("yagapriyan", "Thenmozhi");
	    char[] charArray = obj.toCharArray();
	    
	 //Brings index positioned value			
		System.out.println(charAt);
	 //Brings index value of the letter placed first
		System.out.println(indexOf);
	 //Brings index value of the letter placed last
		System.out.println(lastIndexOf);
	 //Brings the string inside object as capital 
		System.out.println(upperCase);
   	 //Brings
		System.out.println(lowerCase);
	 //Brings the total length of the string
		System.out.println(length);
	 //Bring true if the length is 0 until it gives false
		System.out.println(empty);
	 //Replace first letter in arg is replaced with 2nd letter arg
		System.out.println(replace);
	//Replaces all with new one
		System.out.println(replaceAll);
	//string into char array - if printed in loop each letter gets printed individually
		System.out.println(charArray);
	//	
	}
	
}
*/


/*
//Practice programs

//Pro1
class Practice
{

    void method1()
	{
     String A = "Java";
     String B = " Programming Language";
     String C =A+B;
     System.out.println(C);	
	}
    
//Pro2-Comparing two strings and finding equal string
	  void method2()
	  {
	    String a = "india";
		String b = "INDIA";
		String c = "india";
		String d = "india";
		
	 String obj = new String(a);
	 String obj1 = new String(b);
	 String obj2 = new String(c);
	 String obj3 = new String(d);
	 
     boolean equals = obj.equals(a);
	 System.out.println(equals);
	}
	  
	  //Pro5 Uppercase
	  void method3()
	  {
		  
		  //String A= "abcdefghijkl";
		  String obj = new String("abcedfghijl");
		 String Upper = obj.toUpperCase();
		  System.out.println(Upper);
	  }*/
	  
//	  class Practice
//	  {
//	  //pro6 One upper one lower
//	  public static void main(String[] args)
//		
//	  {
//		  String Y= "abcdefghijkl";
//		  int count=0;
//		  
//		  for(int i=1;i<=12;i++)
//		  {
//			  if(i%2==0)
//			  {
//				  count++;
//			  }
//			  else;
//		  
//		 if (count==0)
//		  {
//			  String obj = new String(Y);
//			  System.out.println(obj.toUpperCase());
//
//		  }
//		  }
//		  
//		  
//	     }
//	  }
//	  
	































