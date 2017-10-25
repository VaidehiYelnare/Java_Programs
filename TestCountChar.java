import java.util.*;

class TestCountChar
{
	public static void main(String[]args)
	{	
		int i,j;
		String str;
		
		int[] occurencesmall=new int[26];
		int[] occurencebig=new int[26];	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		
		System.out.println(" String is:- "+str);
		
		char[]ch=str.toCharArray();
		
		for(i=0;i<ch.length;i++)
		{
			char smallch=str.charAt(i);
			int sch=smallch;
			
			if(sch>=97 && sch<=122)
			{
				//System.out.println(" in if ");
				occurencesmall[sch-97]++;
			}
		}
		
		for(j=0;j<ch.length;j++)
		{
			char bigch=str.charAt(j);
			int bch=bigch;
			
			if(bigch>=65 && bigch<=90)
			{
				occurencebig[bigch-65]++;
			}
		}
		
		
		for(i=0;i<26;i++)
		{
			if(occurencesmall[i]!=0)
			{			
				System.out.println(" Character:- "+(char)(i+97)+"  Count:- "+occurencesmall[i]+"\n");
			}
		}
		
		for(j=0;j<26;j++)
		{
			if(occurencebig[j]!=0)
			{
				System.out.println(" Character:- "+(char)(j+65)+"  Count:- "+occurencebig[j]+"\n");
			}
		}
	}
}
