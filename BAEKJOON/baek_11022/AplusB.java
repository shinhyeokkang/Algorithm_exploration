package baek_11022;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i=1;i<=count;i++) {
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();//����� �� ��ǲ���� ����
			int sum = num1+num2;
			System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + sum);//���⼭ �ٷ� num1+num2 �ع����� 1+2=12 �̷������� ���ڿ��� ������ ǥ����
		}
	

	}

}
