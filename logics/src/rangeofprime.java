import java.util.Scanner;
public class rangeofprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int no=sc.nextInt();
		int count=0;
		for(int j=2;j<15;j++)
		{
		boolean flag=true;
		for(int i=2;i<j;i++)
		{
			if(j%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag&&j>=2&&j<=13)
		{
			System.out.println("it is a prime no "+j);
			if(j>2&&j<13)
			count++;
		}
//		else {
//			System.out.println("it is not a primeno "+j);
//		}

	}
		System.out.println("count of prime number is "+count);

}
}
