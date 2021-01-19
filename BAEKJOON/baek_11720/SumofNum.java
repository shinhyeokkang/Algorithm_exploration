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

		bw.write(sum+"\n"); // ������ �̷��� ���๮�ڸ� �߰��� �ٸ� �ڷ����� ����ϰ� �ϸ� �״�� String���� �ν�, �ƽ�Ű�ڵ�� ��µȴ�.  
		bw.flush();
		bw.close();

	}

}
