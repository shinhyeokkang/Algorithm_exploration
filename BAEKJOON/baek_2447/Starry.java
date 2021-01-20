package baek_2447;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Starry {
	static char[][] arr; 

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int n = Integer.parseInt(s);// int�� ����ȯ
		br.close();
		arr = new char[n][n];
		
		star(0,0,n,false);
		
		for(int i=0;i<n;i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		
	}
	
	static void star(int x, int y, int n, boolean blank) {
		
		if(blank) {
			for(int i=x; i<x+n;i++) {
				for(int j=y;j<y+n;j++) {
					arr[i][j] = ' ';
					
				}
			}
			return;
		}
		if(n==1) {
					arr[x][y] = '*';
					return;
			}
		
		int size = n/3; // �� ����� ����
		int count = 0; // 5��° ����� ��ĭ���� ó���ؾ��ϹǷ�, ������ ����
		for(int k=x;k<x+n;k+=size) {
			for(int l=y;l<y+n;l+=size) {
				count++;
				if(count==5) { // ��� ��ġ�ϰ�쿣 ��ĭó��
					star(k, l, size, true);
				}else { // ������ ��쿣 ���ϴ�� ä��
				star(k, l, size, false);
				}
			}
		}
		
	}
	

}
