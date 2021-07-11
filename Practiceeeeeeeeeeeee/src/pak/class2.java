package pak;
import java.util.Scanner;
public class class2 {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the no");
//		int n1=s.nextInt();
		String a = "Shubham Lahu Patil";
		String words[]=a.split(" ");
		String revstring="";
		
		for(int i=0; i<words.length; i++)
		{
			String word=words[i];
			String revword="";
			
			for(int j=word.length()-1; j>=0; j--)
			{
				revword=revword+word.charAt(j);
				
			}
			revstring=revstring+revword+" ";
			
		}
		System.out.println(revstring);
		
		
		
		
		
		
	}

}
