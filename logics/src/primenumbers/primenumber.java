package primenumbers;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5;
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
