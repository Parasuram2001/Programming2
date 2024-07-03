package primenumbers;

public class rangeprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=3;j<=100;j++)
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
		if (flag==true)
		{
			System.out.println(no+" prime number");
		}
		}

	}
}
