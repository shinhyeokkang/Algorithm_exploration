package baek_1065;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hansu {
	static int[] hanlist = new int[1001];
	static int count=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		for(int i=0;i<hanlist.length;i++) {
			han(i);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input);
		
		for(int j=1;j<=n;j++) { // j�� 1���� �����ؼ� 0�� �����ϰ� ���
			if(hanlist[j]==0){//0 ���� ��� 
			count++;
			}
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(count+"\n");
		bw.flush();
		bw.close();

	}
	
	public static void han(int num){
	
		
		String snum = Integer.toString(num);
		
		
		if(snum.length()>2) { // ���ڸ��� �̻��϶���
			String s1 = snum.substring(0,1);
			String s2 = snum.substring(1,2);
			String s3 = snum.substring(2);
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = Integer.parseInt(s3);
			if((a-b)!=(b-c)) { // �� �ڸ����� ���������� �̷궧
				hanlist[num] = 1; // �ش� ���ڸ� �ε����� ������ list �� 1�� ����
			}
		}
	}

}
