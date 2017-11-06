import java.util.Scanner;

class StarRight3
{
	public static void main(String[]args)
	{
		int i,j;
		System.out.println(" Enter the string :- ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int length = str.length();
		String stra="";
		for(i=1;i<=length;i++)
		{
			stra=" "+stra;
		}
		
		//System.out.print(stra);
		
		//length -1 = 5 ; 
		
		for(j=1;j<=length;j++)
		{
			System.out.print(stra.substring(0,length-j));
			System.out.print(str.substring(0,j));
			
			System.out.println();
		}
		for(int k=1;k<=(length-1);k++) 
		{
				System.out.print(str.substring(k));
				System.out.println();
		}
		
		/*for(i=length-1;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println(str.substring(j));
			}
		}		
		for(i=1;i<=length-1;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(str.substring(j));
			}
			System.out.println();
		}*/

	}
}