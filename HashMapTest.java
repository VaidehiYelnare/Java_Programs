import java.util.*;

class HashMapTest
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a string ");
		String str=sc.nextLine();
		
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		
		int acount=0;
		int ecount=0;
		int icount=0;
		int ocount=0;
		int ucount=0;
		//count=count+1;
		
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
		
		hm.put('a',acount);
	    hm.put('e',ecount);
		hm.put('i',icount);
		hm.put('o',ocount);
		hm.put('u',ucount);
	
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}