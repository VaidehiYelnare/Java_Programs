import java.util.*;


class CountVowels
{
	String str;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a string ");
	    str=sc.nextLine();
	}
	
	 void countingvowels()
	{
		int num_of_vowels=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				num_of_vowels++;
			}
		}
		System.out.println(" Number of vowels occuring in the string are:- " +num_of_vowels);
	}
	
	void countingeachvowel()
	{
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		
		int acount=0;
		int ecount=0;
		int icount=0;
		int ocount=0;
		int ucount=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='A')
			{
				acount=acount+1;
			}
			if(ch=='e'||ch=='E')
			{
				ecount=ecount+1;
			}
			if(ch=='i'||ch=='I')
			{
				icount=icount+1;
			}
			if(ch=='o'||ch=='O')
			{
				ocount=ocount+1;
			}
			if(ch=='u'||ch=='U')
			{
				ucount=ucount+1;
			}		
		}
		
		hm.put('a',acount);//equivalent to getCount() in cpp
	    hm.put('e',ecount);
		hm.put('i',icount);
		hm.put('o',ocount);
		hm.put('u',ucount);
		 List keys = new ArrayList(hm.keySet());
		  Collections.sort(keys);
		 
		for (int i = 0; i < keys.size(); i++) {
			System.out.println(keys.get(i)+" "+hm.get(keys.get(i)));
		}
	  }//end of function
}//end of class

class TestCountVowels
{
	public static void main(String[]args)
	{
		CountVowels obj=new CountVowels();
	    obj.accept();
		obj.countingvowels();
		obj.countingeachvowel();
	}		
}