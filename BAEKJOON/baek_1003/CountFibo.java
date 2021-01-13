package baek_1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class CountFibo {

	static Integer[][] dp= new Integer[41][2]; // 각 숫자별 0과 1 호출갯수를 세기위한 2차원 행렬 생성
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		dp[0][0] = 1; //0에는 0이 1번 호출
		dp[0][1] = 0; //0에는 1이 0번 호출
		dp[1][0] = 0; //1에는 0이 0번 호출
		dp[1][1] = 1; //1에는 1이 1번 호출
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int cnt = Integer.parseInt(s);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<cnt;i++) {
			
			String c = br.readLine();
			int ic = Integer.parseInt(c);
			
			fiboListing(ic);
			sb.append(dp[ic][0]+" "+dp[ic][1]).append("\n");
			

		}
		System.out.println(sb);


	}
	
	static Integer[] fiboListing(int n){ 
		
		if(dp[n][0] == null || dp[n][1] == null) {//숫자가 0이나 1이 아닐때
			dp[n][0] = fiboListing(n-1)[0] + fiboListing(n-2)[0];//n에 포함된 0의 갯수는 n-1과 n-2에 포함된 0의 갯수의 합
			dp[n][1] = fiboListing(n-1)[1] + fiboListing(n-2)[1];// 아이디어는 생각이 났으나 2차원 배열을 이렇게 쓸수 있다는걸 몰라서 레퍼런스를 참고했다...공부하자
		}
		return dp[n];
	}

}
