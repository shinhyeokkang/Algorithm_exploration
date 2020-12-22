package BOJ;
import java.util.Scanner;

public class Nine_nine{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		Scanner sc = new Scanner(System.in); //스캐너구문은 외워두기
		//System.out.println("Please type the number: ");
		num = sc.nextInt();
		
		for(int i=1;i<10;i++){
			int res = num*i; 
			System.out.println(num + " * " + i + " = " + res);
		}
	}
}
