package baek_1037;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Factor {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sn = br.readLine();
		int n = Integer.parseInt(sn);
		
		String list = br.readLine();
		StringTokenizer st= new StringTokenizer(list);

		ArrayList<Integer> numList = new ArrayList<Integer>(st.countTokens()); // 토큰 갯수만큼의 크기를 가지는 ArrayList 생성
		
		for(int i=0;i<n;i++) {
			numList.add(Integer.parseInt(st.nextToken()));
		}
		int max = Collections.max(numList);
		int min = Collections.min(numList);
		
		br.close();
		bw.write(max*min + "\n");
		bw.flush();
		bw.close();
	

	}

}
