package task;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="kanak";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println(reverse+" given string is palindrome");
		}
		else {
			System.out.println(reverse+" given string is not palindrome ");
		}
		

	}
}
