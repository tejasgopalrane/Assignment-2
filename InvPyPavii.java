class InvPyPavii {
public static void main(String args[])
{

int rows=9;
System.out.println("");
	for (int i=rows; i>=1; i--)
	{
 	 for (int j=0; j<=rows-i; j++)
	{
 	 System.out.print(" ");
  	}
 	int count=0;
	while(count != (2*i-1))
	{
  		System.out.print(i+"");  
		count++;  
	}                                               
	System.out.println();
	}
                                                   
    }
 }