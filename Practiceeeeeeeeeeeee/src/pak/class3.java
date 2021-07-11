package pak;
import java.util.Scanner;
public class class3 {

	public static void main(String[] args) {

		String ipstring = "Shubham Lahu Patil";
		String words[]=ipstring.split(" ");
		String revstring="";
	
		int len=words.length;
		
		for(int i=0; i<len; i++) 
		{
			
			String word =words[i];
			String revword="";
			
			int len2=word.length();
			
			for(int j=len2-1; j>=0; j--)
			{
				revword=revword+word.charAt(j);
			}
			revstring=revstring+revword+" ";
			
		}
		System.out.println(revstring);
		
		
		
		
		
		
}
}
