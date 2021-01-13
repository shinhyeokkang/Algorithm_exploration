package baek_1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class CountFibo {

	static Integer[][] dp= new Integer[41][2]; // �� ���ں� 0�� 1 ȣ�ⰹ���� �������� 2���� ��� ����
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		dp[0][0] = 1; //0���� 0�� 1�� ȣ��
		dp[0][1] = 0; //0���� 1�� 0�� ȣ��
		dp[1][0] = 0; //1���� 0�� 0�� ȣ��
		dp[1][1] = 1; //1���� 1�� 1�� ȣ��
		
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
		
		if(dp[n][0] == null || dp[n][1] == null) {//���ڰ� 0�̳� 1�� �ƴҶ�
			dp[n][0] = fiboListing(n-1)[0] + fiboListing(n-2)[0];//n�� ���Ե� 0�� ������ n-1�� n-2�� ���Ե� 0�� ������ ��
			dp[n][1] = fiboListing(n-1)[1] + fiboListing(n-2)[1];// ���̵��� ������ ������ 2���� �迭�� �̷��� ���� �ִٴ°� ���� ���۷����� �����ߴ�...��������
		}
		return dp[n];
	}

}
