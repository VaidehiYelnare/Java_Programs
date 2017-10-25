import java.util.*;
public class DeleteCharacter {
 
	public static void main(String[] args)
	{
	  System.out.println("Enter your String: ");
	  Scanner scanner = new Scanner(System.in);
	  String yourStr = scanner.nextLine(); 
	  System.out.println("Your String is " + yourStr);

	  System.out.println("Enter Delete character ");
	  Scanner sc = new Scanner(System.in);
	  char delChar = sc.next().charAt(0);
	 
	  String outputStr = "";
	   for (int i = 0; i < yourStr.length(); ++i) 
	   {
		 char ch = yourStr.charAt(i);
		 if(delChar !=  ch) 
		 {
		  outputStr = outputStr +ch ;
		 }
	   }

     System.out.println("Output String is " + outputStr);
	}

}