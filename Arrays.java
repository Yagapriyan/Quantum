/*
//Printing elements of array without duplicates
class Arrays
{
	public static void main (String args[]) 
	{
	int a[]= {1,2,3,4};
	int b[]= {3,4,5,6};
	int c[]= {a.length+b.length};
	
	
	for(int i=0;i<a.length;i++) //L1 assigning A
	{
		c[i]=a[i];
	}
	for(int j=0; j<b.length;j++) //L2-outer-assigning B without duplicates
	{ 
		int count=0; int times=0;
		for(int k=0;k<c.length;k++) //L3-inner-for checking duplicates
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
		for(int l=0; l<c.length;l++)
		{
	    System.out.println(c[l]);
		}
	
	}
}*/

/*
class Arrays
{
 public static void main (String args[])
{
 int circle=5;                  //IT 1 : {row 1, 4 col space,
 for(int i =1;i<=circle; i++)
 {
 for(int j=1;j<=circle-i;j++)
 {
  System.out.print(" ");
  }
 for(int k=1;k<=i;k++)
  {
  System.out.print("*");
  } 
System.out.println(" ");
 }

}
}
*/

class Arrays
{
 public static void main(String arg[])
 { 
  int n=100;
  for(int i=0;i<=n;i++)
  {
   int count=0;
   for(int j=1;j<=n;j++)
   {
    if(i%j==0)
    {
     count++;
    }
    
   }
   if (count==1 || count==2)
    {
     System.out.println(i);
     }
  }
 }
}






