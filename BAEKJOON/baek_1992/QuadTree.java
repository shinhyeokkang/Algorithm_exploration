package baek_1992;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class QuadTree {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		int[][] square = new int[n][n];
		
		for(int i=0;i<n;i++) {//1���� N������ ��Ŀ� �� ���� �Է�
			String row = br.readLine();

			for(int j=0;j<n;j++) {
				int num = Integer.parseInt(row.substring(j, j+1));
				square[i][j] = num; //����� i�� j���� ���ڸ� ����
				
			}
		}
		
		cutting(square,n,0,0);
		br.close();
		bw.flush();
		bw.close();

	}
	
	static void cutting(int[][] square, int n, int x, int y) throws IOException {
		
		if(n==1) {// �簢���� �ּҴ����� 1�� ���
			if(square[x][y]==1) {// �簢���� �������� ��� 
				bw.write("1");
				//System.out.println("Blue size: "+ n + " position: "+ x +" "+ y);
				return;
			}
			else {
				bw.write("0");
				//System.out.println("White size: "+ n + " position: "+ x +" "+ y);
				return;
			}
		}
		
		
				for(int k=x;k<x+n;k++) { // ����� ��Ʈ: ó���� k�� ������ n������ �ξ���. �׷����� 1��и��� ������ ���������� �ݺ����� �������� ���ϴ� ���� �߻�. �׻� ����� �������� ��������.
					for(int l=y;l<y+n;l++) {
						if(square[x][y]!=square[k][l]) {
							bw.write("(");
							cutting(square, n/2, x,y); //���� ��
							cutting(square, n/2, x,y+(n/2)); //������ ��
							cutting(square, n/2, x+(n/2),y); //���� �Ʒ�
							cutting(square, n/2, x+(n/2),y+(n/2)); // ������ �Ʒ�
							bw.write(")");
							return;
						}
					}				
				}
		// �˻縦 ����� �簢���� ���� ���������� �̷���� ���,
		if(square[x][y]==1) { // �������� ���
		bw.write("1");
		//System.out.println("Blue size: "+ n + " position: "+ x +" "+ y);
		return;
		}
		else { // �Ͼ���� ���
			bw.write("0");
			//System.out.println("White size: "+ n + " position: "+ x +" "+ y);
			return;
		}
	}
	
	
}