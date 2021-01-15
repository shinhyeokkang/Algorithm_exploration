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
		int n = Integer.parseInt(x);// int로 형변환
		int k = Integer.parseInt(y);
		
		int[] coinlist = new int[n]; // 각 동전 단위 저장

		for(int i=0;i<n;i++) { // 동전 단위 입력
			String coin = br.readLine();
			coinlist[i] = Integer.parseInt(coin); // 배열에 동전 단위 오름차순으로 삽입
			}
		br.close();
		int[] countlist = greedy(k,coinlist);
	
		//StringBuilder sb =new StringBuilder();
		
		int sum = 0;
		for(int j=0;j<n;j++) {
			sum = sum + countlist[j];
			
			//sb.append(coinlist[j]+"원권: "+countlist[j]+"\n");
		}
		System.out.println(sum); 
		
	}
	public static int[] greedy(int k, int[] coinlist) {
		int[] countlist = new int[coinlist.length]; // 동전 단위 별 선택 갯수 저장
		
		int left = k; // 아직 돌려주지 못한 돈
		
			for(int i=coinlist.length-1;i>=0;i--) { // 큰 코인부터 가장 작은 코인까지 
					while(coinlist[i]<=left&&left>0) { // ex) 1000원권이 4200원보다 작을때 
						countlist[i]++; //1000원권 카운트 +1
						left = left - coinlist[i]; // 4200 - 1000 = 3200
					}	
			}
		
		return countlist;
		
	}

}
