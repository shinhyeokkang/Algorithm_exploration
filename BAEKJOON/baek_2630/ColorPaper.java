package baek_2630;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ColorPaper {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int countBlue = 0; // cutting() ���� ĭ�� ���� �Ķ����� �簢���� �߰��ϸ� 1 ����
	static int countWhite = 0;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		int[][] square = new int[n][n];
		
		for(int i=0;i<n;i++) {//1���� N������ ��Ŀ� �� ���� �Է�
			String row = br.readLine();
			StringTokenizer st = new StringTokenizer(row);
			for(int j=0;j<n;j++) {
				int num = Integer.parseInt(st.nextToken());
				square[i][j] = num; //����� i�� j���� ���ڸ� ����
				
			}
		}
		
		cutting(square,n,0,0);
		br.close();
		bw.write(countWhite+"\n");
		bw.write(countBlue+"\n");
		bw.flush();
		bw.close();
 
	}
	
	static void cutting(int[][] square, int n, int x, int y) {
		
		if(n==1) {// �簢���� �ּҴ����� 1�� ���
			if(square[x][y]==1) {
				countBlue++;
				//System.out.println("Blue size: "+ n + " position: "+ x +" "+ y);
				return;
			}
			else {
				countWhite++;
				//System.out.println("White size: "+ n + " position: "+ x +" "+ y);
				return;
			}
		}
		
		
				for(int k=x;k<x+n;k++) { // ����� ��Ʈ: ó���� k�� ������ n������ �ξ���. �׷����� 1��и��� ������ ���������� �ݺ����� �������� ���ϴ� ���� �߻�. �׻� ����� �������� ��������.
					for(int l=y;l<y+n;l++) {
						if(square[x][y]!=square[k][l]) {
							cutting(square, n/2, x,y);
							cutting(square, n/2, x+(n/2),y);
							cutting(square, n/2, x,y+(n/2));
							cutting(square, n/2, x+(n/2),y+(n/2));
							return;
						}
					}				
				}
		// �˻縦 ����� �簢���� ���� ���������� �̷���� ���,
		if(square[x][y]==1) { // �Ķ����� ���
		countBlue++;
		//System.out.println("Blue size: "+ n + " position: "+ x +" "+ y);
		return;
		}
		else { // �Ͼ���� ���
			countWhite++;
			//System.out.println("White size: "+ n + " position: "+ x +" "+ y);
			return;
		}
	}
	
	
}