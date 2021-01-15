package baek_11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		String x = st.nextToken();
		String y = st.nextToken();
		int n = Integer.parseInt(x);// int�� ����ȯ
		int k = Integer.parseInt(y);
		
		int[] coinlist = new int[n]; // �� ���� ���� ����

		for(int i=0;i<n;i++) { // ���� ���� �Է�
			String coin = br.readLine();
			coinlist[i] = Integer.parseInt(coin); // �迭�� ���� ���� ������������ ����
			}
		br.close();
		int[] countlist = greedy(k,coinlist);
	
		//StringBuilder sb =new StringBuilder();
		
		int sum = 0;
		for(int j=0;j<n;j++) {
			sum = sum + countlist[j];
			
			//sb.append(coinlist[j]+"����: "+countlist[j]+"\n");
		}
		System.out.println(sum); 
		
	}
	public static int[] greedy(int k, int[] coinlist) {
		int[] countlist = new int[coinlist.length]; // ���� ���� �� ���� ���� ����
		
		int left = k; // ���� �������� ���� ��
		
			for(int i=coinlist.length-1;i>=0;i--) { // ū ���κ��� ���� ���� ���α��� 
					while(coinlist[i]<=left&&left>0) { // ex) 1000������ 4200������ ������ 
						countlist[i]++; //1000���� ī��Ʈ +1
						left = left - coinlist[i]; // 4200 - 1000 = 3200
					}	
			}
		
		return countlist;
		
	}

}
