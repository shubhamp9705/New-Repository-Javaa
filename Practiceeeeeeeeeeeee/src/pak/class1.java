package pak;
import java.util.Scanner;
public class class1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number-");
		int no1 = s.nextInt();
		int no2 = s.nextInt();
		//int no1=4,no2=6;
		int hcf=0;
		int sm=Math.min(no1, no2);
		for(int i=2; i<=sm; i++)
		{
			if(no1%i==0 && no2%i==0)
			{
				hcf=i;
			}
		}
		System.out.println(hcf);
		
		int lcm = 0;
		int d = 0;
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
				if(no1*i==no2*j && d==0)
				{
					lcm=no1*i;
					d=d+1;
				}
			}
		}
		System.out.println(lcm);
	}

}
