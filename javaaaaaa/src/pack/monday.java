package pack;

public class monday {

	public static void main(String[] args) {
		String a = "shubhamlahupatil";
//		String reser="";
		int d=0;
		int len= a.length();
		for(int i=0; i<len; i++)
		{
			d=0;
			for(int j=0; j<len; j++)
			{
				if(j<i && a.charAt(i)==a.charAt(j))
				{
					break;
				}
				if(a.charAt(i)==a.charAt(j))
				{
					d++;
				}
				
			}
			if(d>0)
			{
				System.out.println(a.charAt(i)+" "+d);
			}
		}
		
		
	
//		String Words[]= a.split(" ");
//		String ReverserWords="";
//		int len = Words.length;
//		
//		for(int i=len-1; i>=0; i--)
//		{
//			ReverserWords=ReverserWords+Words[i]+" ";
//		}
//		System.out.println(ReverserWords);
		
//		String Words[]=a.split(" ");
//		int len = Words.length;
//		for(int j=0; j<len; j++)
//		{
//			String word = Words[j];
//			String revword = "";
//			int len2=word.length();
//			for(int i=len2-1; i>=0; i--)
//			{
//				revword=revword+word.charAt(i);
//			}
//			reser= reser+revword+" ";
//		}
//		System.out.println(reser);
		
		
		
//		for(int i=len-1; i>=0; i--)
//		{
//			reser=reser+Words[i]+" ";
//		}
//		System.out.println(reser);
		
		
		
//		for(int j=0; j<len; j++)
//		{
//			String word= Words[j];
//			String RevWord="";
//			int len2= word.length();
//			for(int i=len2-1; i>=0; i--)
//			{
//				RevWord = RevWord+a.charAt(i);
//			}
//			ReverserWords=ReverserWords+RevWord+" ";
//		}
//		System.out.println(ReverserWords);
		
		
		System.out.println("Hello");
		
		
		
	}

}
