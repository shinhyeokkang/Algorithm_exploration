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
	static int[] C; // �� ������ ũ��
	static int[] S; // 
	static int[][] dp; // x���� y������ ����ũ�� ���� �ּҰ��� ����
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ ���̽� �ݺ� Ƚ��		
		
		for(int i=0;i<T;i++) {// �׽�Ʈ ���̽� �ݺ� ����
			int K = Integer.parseInt(br.readLine()); // �Ҽ��� �� �� 
			
			C = new int[K+1];
			S = new int[K+1];
			dp = new int[K+1][K+1];
			
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1;j<=K;j++) { // �Ҽ� �� �� ��ŭ �ݺ� 
				int num = Integer.parseInt(st.nextToken()); // �� ������ ũ��
				
				C[j] = num;
				S[j] = S[j-1] + C[j];
				
				for(int l=1; l<=K;l++) {
					dp[j][l] = MAX; // ��� ���ϱ� ������ ��츦 MAX�� �ʱ�ȭ
				}
			}
			int sum = mergeFile(1,K); // ������, ���� : ���������� �������� ���� �ּҺ�� ����
		
			bw.write(sum+"\n");
		
		}
		
		br.close();
		bw.flush();
		bw.close();
}

	private static int mergeFile(int start, int end) {
		// TODO Auto-generated method stub
		if(start >= end){ // ���� 1���� ���� ����� 0
			dp[start][end] = 0;
			
			return dp[start][end];
		}
		if(start + 1 == end){ // �� ������ �ܼ� ��
			dp[start][end] = C[start] + C[end];
			
			return dp[start][end];
		}
		if(dp[start][end] < MAX){ // �̹� ���� �ּҰ��� �����Ѵٸ� �״�� ���
			return dp[start][end];
		}
		int min;
		for(int k=start;k<end;k++) {
			min = mergeFile(start, k) + mergeFile(k+1, end) + S[end] - S[start-1];
			
			if(min<dp[start][end]) { // k �������� ���� ���ο� ���� ���� ������ �۴ٸ�,
				dp[start][end] = min;
			
			}
			
		}
		
		return dp[start][end];
	}
		
	}
	
