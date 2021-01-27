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
		
		for(int i=0;i<n;i++) {//1부터 N열까지 행렬에 숫자 정보 입력
			String row = br.readLine();
			StringTokenizer st = new StringTokenizer(row);
			for(int j=0;j<n;j++) {
				int num = Integer.parseInt(st.nextToken());
				square[i][j] = num; //행렬의 i행 j열에 숫자를 삽입
				
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
		
		if(n==1) {// 사각형이 최소단위인 1일 경우
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
							
							for(int i=0;i<n;i+=n/3) {// 디버깅 노트: 처음엔 i<n을 i<x+n으로 두었다. 이 이중 for문의 의미를 되새겨보자. 위치에 상관없이 9번의 반복을 통해 행렬을 자르는것이 목표이다. 좌표인 x가 들어가면 행렬의 최대범위를 넘겨버린다.
								for (int j=0;j<n;j+=n/3){
							//System.out.println(n/3+ " " + x+i+" "+y+j);
							cutting(square, n/3, x+i, y+j);
								}
							}
	
							return;
						}
					}				
				}
		// 검사를 통과해 사각형이 전부 같은 수로 이루어진 경우,
		if(square[x][y]==1) { // 1일 경우
		countOne++;
		//System.out.println("Blue size: "+ n + " position: "+ x +" "+ y);
		return;
		}
		else if(square[x][y]==0){ //0일 경우
			countZero++;
			//System.out.println("White size: "+ n + " position: "+ x +" "+ y);
			return;
		}
		else {// -1일 경우
			countMinus++;
			return;}
	}
	
	
}