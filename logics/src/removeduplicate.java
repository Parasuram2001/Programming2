
public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="malayalam";
		for(int i=0;i<str.length();i++)
		{
			boolean flag=true;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					flag=false;
					break;
				}
			}
		}
		for(int j=0;j<str.length();j++)
		{
			System.out.println(str);
		}

	}

}
