package task;

public class stringReveverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="kanak";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		

	}

}
