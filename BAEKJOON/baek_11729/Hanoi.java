package baek_11729;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hanoi {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String s = br.readLine();
		double n = Integer.parseInt(s);// int�� ����ȯ
		br.close();
		
		int count = (int) (Math.pow(2, n) - 1);
		
		bw.write(count+"\n");
		hanoi(n,1,2,3);
		bw.flush();
		bw.close();

	}
	
	static void hanoi(double n, int start, int mid, int to) throws IOException {
		
		if(n==1) {// �̵��ؾ��� ������ 1���� ���, �״�� ��ǥ�������� �ű��
			bw.write(start + " " + to + "\n");
			return;
		}
		
		//���1���� ���2�� n-1���� ������ �ű��
		hanoi(n-1,start, to, mid);
		
		//���1���� ���3���� ���� ū 1���� ������ �ű��
		bw.write(start + " " + to + "\n");
		
		//���2���� ��� 3���� n-1���� ������ �ű��
		hanoi(n-1, mid, start, to);

	}

}
