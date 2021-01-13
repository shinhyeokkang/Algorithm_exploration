package baek_1003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class originalFibo {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int count0=0;
	static int count1=0;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int cnt = Integer.parseInt(s);
		
		for(int i=0;i<cnt;i++) {

			count0=0;
			count1=0;
			String c = br.readLine();
			int ic = Integer.parseInt(c);
			fiboListing(ic);
			
			bw.write(count0+" "+count1+"\n");
		}
		br.close();
		bw.flush();
		bw.close();


	}
	
	public static int fiboListing(int n){

		if(n==0) {
			count0++;
			return 0;
		}
		else if(n==1) {
			count1++;
			return 1;
			}
		else {
			return fiboListing(n-1) + fiboListing(n-2); // 재귀를 통해 결과값 찾을때까지 반복
		}

	}

}
