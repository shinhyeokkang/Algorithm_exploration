package baek_11720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SumofNum {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int n = Integer.parseInt(s);
		
		String rowOfnum = br.readLine(); 
		br.close();
		
		int[] numList = new int[n];
		for(int i=0;i<n;i++) {
			String snum = rowOfnum.substring(i, i+1);
			int num = Integer.parseInt(snum);
			numList[i] = num;
		}
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum=0;
		for(int j=0;j<numList.length;j++) {
			sum = sum + numList[j];
		}

		bw.write(sum+"\n"); // 하지만 이렇게 개행문자를 추가해 다른 자료형을 출력하게 하면 그대로 String으로 인식, 아스키코드로 출력된다.  
		bw.flush();
		bw.close();

	}

}
