package task;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enrer the String: ");
		String a=sc.nextLine();
		String reverse=" ";
		for(int i=a.length()-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
		}
		System.out.print(reverse);
		
			

	}

}
