package primenumbers;

public class notaprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=1;j<=20;j++)
		{
		int no=j;
		boolean flag=true;
		for (int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		if (flag==false)
		{
			System.out.println(no+" is not a prime number");
		}
		}
}
}
