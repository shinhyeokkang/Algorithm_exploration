package baek_11066;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MergingFiles {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int MAX = Integer.MAX_VALUE;
	static int[] C; // 각 파일의 크기
	static int[] S; // 
	static int[][] dp; // x부터 y까지의 파일크기 합의 최소값을 저장
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 반복 횟수		
		
		for(int i=0;i<T;i++) {// 테스트 케이스 반복 시작
			int K = Integer.parseInt(br.readLine()); // 소설의 장 수 
			
			C = new int[K+1];
			S = new int[K+1];
			dp = new int[K+1][K+1];
			
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1;j<=K;j++) { // 소설 장 수 만큼 반복 
				int num = Integer.parseInt(st.nextToken()); // 각 파일의 크기
				
				C[j] = num;
				S[j] = S[j-1] + C[j];
				
				for(int l=1; l<=K;l++) {
					dp[j][l] = MAX; // 모든 더하기 조합의 경우를 MAX로 초기화
				}
			}
			int sum = mergeFile(1,K); // 시작점, 끝점 : 시작점부터 끝점까지 합의 최소비용 도출
		
			bw.write(sum+"\n");
		
		}
		
		br.close();
		bw.flush();
		bw.close();
}

	private static int mergeFile(int start, int end) {
		// TODO Auto-generated method stub
		if(start >= end){ // 갯수 1개의 합의 비용은 0
			dp[start][end] = 0;
			
			return dp[start][end];
		}
		if(start + 1 == end){ // 두 파일의 단순 합
			dp[start][end] = C[start] + C[end];
			
			return dp[start][end];
		}
		if(dp[start][end] < MAX){ // 이미 계산된 최소값이 존재한다면 그대로 출력
			return dp[start][end];
		}
		int min;
		for(int k=start;k<end;k++) {
			min = mergeFile(start, k) + mergeFile(k+1, end) + S[end] - S[start-1];
			
			if(min<dp[start][end]) { // k 기준으로 가른 새로운 합이 원래 값보다 작다면,
				dp[start][end] = min;
			
			}
			
		}
		
		return dp[start][end];
	}
		
	}
	
