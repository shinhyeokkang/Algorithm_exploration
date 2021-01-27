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

	static int countBlue = 0; // cutting() 에서 칸이 전부 파랑색인 사각형을 발견하면 1 증가
	static int countWhite = 0;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		int[][] square = new int[n][n];
		
		for(int i=0;i<n;i++) {//1부터 N열까지 행렬에 색 정보 입력
			String row = br.readLine();
			StringTokenizer st = new StringTokenizer(row);
			for(int j=0;j<n;j++) {
				int num = Integer.parseInt(st.nextToken());
				square[i][j] = num; //행렬의 i행 j열에 숫자를 삽입
				
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
		
		if(n==1) {// 사각형이 최소단위인 1일 경우
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
		
		
				for(int k=x;k<x+n;k++) { // 디버깅 노트: 처음엔 k의 범위를 n까지로 두었다. 그랬더니 1사분면을 제외한 나머지에서 반복문에 진입하지 못하는 현상 발생. 항상 상댓값을 기준으로 생각하자.
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
		// 검사를 통과해 사각형이 전부 같은색으로 이루어진 경우,
		if(square[x][y]==1) { // 파란색일 경우
		countBlue++;
		//System.out.println("Blue size: "+ n + " position: "+ x +" "+ y);
		return;
		}
		else { // 하얀색일 경우
			countWhite++;
			//System.out.println("White size: "+ n + " position: "+ x +" "+ y);
			return;
		}
	}
	
	
}