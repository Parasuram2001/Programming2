package task;
import java.util.Scanner;
public class strreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=1;
		while(no!=0)
		{
		System.out.println("enter the string you want to convert: ");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		}

	}

}
