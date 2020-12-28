package baek_4344;

import java.util.Scanner;

public class overAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		for(int i=0;i<c;i++) { // 테스트 케이스의 개수 C번 만큼 반복
			int n = sc.nextInt();
			int[] scorelist = new int[n];
			int sum = 0;
			
			for(int j=0;j<n;j++) {// 각 테스트 케이스 별 학생수 N번 만큼 반복
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
			
			double result = (double)count/n; // int간의 계산 결과를 double로 반드시 캐스팅해야 data loss가 생기지 않는다.
			System.out.printf("%.3f",result*100); // %.3f = f:실수데이터를, 소수점 아래 3자리수까지 나타내라는 뜻
			System.out.println("%");
		}

	}

}
