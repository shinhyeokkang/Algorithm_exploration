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
		double n = Integer.parseInt(s);// int로 형변환
		br.close();
		
		int count = (int) (Math.pow(2, n) - 1);
		
		bw.write(count+"\n");
		hanoi(n,1,2,3);
		bw.flush();
		bw.close();

	}
	
	static void hanoi(double n, int start, int mid, int to) throws IOException {
		
		if(n==1) {// 이동해야할 원판이 1개일 경우, 그대로 목표지점까지 옮긴다
			bw.write(start + " " + to + "\n");
			return;
		}
		
		//기둥1에서 기둥2로 n-1개의 원판을 옮긴다
		hanoi(n-1,start, to, mid);
		
		//기둥1에서 기둥3으로 가장 큰 1개의 원판을 옮긴다
		bw.write(start + " " + to + "\n");
		
		//기둥2에서 기둥 3으로 n-1개의 원판을 옮긴다
		hanoi(n-1, mid, start, to);

	}

}
