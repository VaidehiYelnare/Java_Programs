import java.util.*;

class CountVowels1
{
    static int x;
	private int count;
	private char vowel;

	static int getX() 
	{
		System.out.println("In getX()");
		System.out.println("value of x = "+x);
		return x;
	}
	int getCountData()
	{
		return count;
	}
	
	char getVowelData()
	{
		return vowel;
	}
	
	void setCountData(int cnt)
	{		
		count=cnt;
		x= x+1;
	}
	
	void setVowelData(char vwl)
	{
		vowel=vwl;
	}
}

class TestCV
{
	public static void main(String[]args)
	{
		System.out.println("In main()"+CountVowels1.getX());
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a string ");
		str=sc.nextLine();
		
		CountVowels1 obja=new CountVowels1();
		CountVowels1 obje=new CountVowels1();
		CountVowels1 obji=new CountVowels1();
		CountVowels1 objo=new CountVowels1();
		CountVowels1 obju=new CountVowels1();
		
		obja.setVowelData('a');
		obje.setVowelData('e');
		obji.setVowelData('i');
		objo.setVowelData('o');
		obju.setVowelData('u');
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='a' || ch=='A')
			{
				obja.setCountData(obja.getCountData()+1);
			}
			if(ch=='e' || ch=='E')
			{
				obje.setCountData(obje.getCountData()+1);
			}
			if(ch=='i' || ch=='I')
			{
				obji.setCountData(obji.getCountData()+1);
			}
			if(ch=='o' || ch=='O')
			{
				objo.setCountData(objo.getCountData()+1);
			}
			if(ch=='u' || ch=='U')
			{
				obju.setCountData(obju.getCountData()+1);
			}
		}
		
		System.out.println(" Vowel:- "+obja.getVowelData()+"\n Count:- "+obja.getCountData()+"\n");
		System.out.println(" Vowel:- "+obje.getVowelData()+"\n Count:- "+obje.getCountData()+"\n");
		System.out.println(" Vowel:- "+obji.getVowelData()+"\n Count:- "+obji.getCountData()+"\n");
		System.out.println(" Vowel:- "+objo.getVowelData()+"\n Count:- "+objo.getCountData()+"\n");
		System.out.println(" Vowel:- "+obju.getVowelData()+"\n Count:- "+obju.getCountData()+"\n");
		System.out.println("X:- "+obja.getX()+"\n XX:- "+obje.getX()+"\n XXX:- "+CountVowels1.getX());
	}//end of main	
}