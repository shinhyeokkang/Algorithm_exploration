package baek_4344;

import java.util.Scanner;

public class overAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		for(int i=0;i<c;i++) { // �׽�Ʈ ���̽��� ���� C�� ��ŭ �ݺ�
			int n = sc.nextInt();
			int[] scorelist = new int[n];
			int sum = 0;
			
			for(int j=0;j<n;j++) {// �� �׽�Ʈ ���̽� �� �л��� N�� ��ŭ �ݺ�
				int score = sc.nextInt();
				scorelist[j] = score;
				sum = sum + score;
			}

			double average = sum/scorelist.length;
			int count=0;
			
			for(int k=0;k<n;k++) {
				if(scorelist[k]>average){
					count=count+1;
					}
			}
			
			double result = (double)count/n; // int���� ��� ����� double�� �ݵ�� ĳ�����ؾ� data loss�� ������ �ʴ´�.
			System.out.printf("%.3f",result*100); // %.3f = f:�Ǽ������͸�, �Ҽ��� �Ʒ� 3�ڸ������� ��Ÿ����� ��
			System.out.println("%");
		}

	}

}
