import java.io.*;
import java.util.*;

public class CountWords 
{
    public static void main (String args[]) throws IOException 
	{  	
	  try
	  {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the name of the file");
	   String filename=sc.nextLine();
	   Scanner input=new Scanner(new File(filename));
	   
	   TreeMap<String,Integer> wc=new TreeMap<String,Integer>();
	   while(input.hasNext())//iteration has more elements
	   {
		   String nextword=input.next();//next() returns next element	
		   
		   /*if object contains key means word increment the value 
		     if object doesnt contain key till file ends put the value 
			 of key as 1*/
		   if(wc.containsKey(nextword))
		   {
			   wc.put(nextword,wc.get(nextword)+1);//obj.put(key,value)
		   }
		   else
		   {
			   wc.put(nextword,1);
		   }
	   }//end of while
	   
	   System.out.print(" Occurences of words:- ");
	   
	   for(String word:wc.keySet())//returns key in ascending order
	   {
		   int count;
		   count = wc.get(word);	   
		  System.out.println("\n"+count+"\t"+word);
	   }
	  }//end of try
	  
	  catch(FileNotFoundException e)
	  {
		  System.out.println(" File not found ");
	  }
    }
}


/*
     C:\Vaidehi\javaprgm\InterviewPrep>java CountWords
Enter the name of the file
randomtext.txt
 Occurences of words:-
1       jyoti

1       rajesh

3       rohit

4       tanaya

1       vaidehi
*/