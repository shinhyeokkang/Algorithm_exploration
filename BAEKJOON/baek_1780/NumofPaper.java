package baek_1780;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class NumofPaper {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int countOne = 0; 
	static int countZero = 0;
	static int countMinus = 0;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		int[][] square = new int[n][n];
		
		for(int i=0;i<n;i++) {//1���� N������ ��Ŀ� ���� ���� �Է�
			String row = br.readLine();
			StringTokenizer st = new StringTokenizer(row);
			for(int j=0;j<n;j++) {
				int num = Integer.parseInt(st.nextToken());
				square[i][j] = num; //����� i�� j���� ���ڸ� ����
				
			}
		}
		
		cutting(square,n,0,0);
		br.close();
		bw.write(countMinus+"\n");
		bw.write(countZero+"\n");
		bw.write(countOne+"\n");
		bw.flush();
		bw.close();

	}
	
	static void cutting(int[][] square, int n, int x, int y) {
		
		if(n==1) {// �簢���� �ּҴ����� 1�� ���
			if(square[x][y]==1) {
				countOne++;
				//System.out.println("Blue size: "+ n + " position: "+ x +" "+ y);
				return;
			}
			else if(square[x][y]==0){
				countZero++;
				//System.out.println("White size: "+ n + " position: "+ x +" "+ y);
				return;
			}
			else {
				countMinus++;
				return;
			}
		}
		
		
				for(int k=x;k<x+n;k++) {
					for(int l=y;l<y+n;l++) {
						if(square[x][y]!=square[k][l]) {
							
							for(int i=0;i<n;i+=n/3) {// ����� ��Ʈ: ó���� i<n�� i<x+n���� �ξ���. �� ���� for���� �ǹ̸� �ǻ��ܺ���. ��ġ�� ������� 9���� �ݺ��� ���� ����� �ڸ��°��� ��ǥ�̴�. ��ǥ�� x�� ���� ����� �ִ������ �Ѱܹ�����.
								for (int j=0;j<n;j+=n/3){
							//System.out.println(n/3+ " " + x+i+" "+y+j);
							cutting(square, n/3, x+i, y+j);
								}
							}
	
							return;
						}
					}				
				}
		// �˻縦 ����� �簢���� ���� ���� ���� �̷���� ���,
		if(square[x][y]==1) { // 1�� ���
		countOne++;
		//System.out.println("Blue size: "+ n + " position: "+ x +" "+ y);
		return;
		}
		else if(square[x][y]==0){ //0�� ���
			countZero++;
			//System.out.println("White size: "+ n + " position: "+ x +" "+ y);
			return;
		}
		else {// -1�� ���
			countMinus++;
			return;}
	}
	
	
}