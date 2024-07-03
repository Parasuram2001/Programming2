package task;

public class reversepalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="kanaka";
		String reverse="";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}

	}

}
