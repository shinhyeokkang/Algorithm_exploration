package baek_11022;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i=1;i<=count;i++) {
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();//띄어쓰기당 한 인풋으로 받음
			int sum = num1+num2;
			System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + sum);//여기서 바로 num1+num2 해버리면 1+2=12 이런식으로 문자열의 합으로 표현됨
		}
	

	}

}
