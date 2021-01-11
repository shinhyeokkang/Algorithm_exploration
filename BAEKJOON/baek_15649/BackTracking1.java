package baek_15649;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackTracking1 {
	static int n;
	static int m;
	static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//입력부
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String input = bufferedReader.readLine(); // readLine 메소드는 String 값만 받을수 있음
		StringTokenizer st = new StringTokenizer(input);
		String x = st.nextToken();
		String y = st.nextToken();
		n = Integer.parseInt(x);// int로 형변환
		m = Integer.parseInt(y);
		int[] list = new int[m];
		
		bufferedReader.close();

		//출력부
		backTrack(0, list); // 0열 부터 백트래킹 시작
		bufferedWriter.flush();
		bufferedWriter.close();

	}
	static void backTrack(int row, int[] list) throws IOException{

		
		if(row==m) { // 열이 마지막까지 도달했을때
			for(int k=0;k<m;k++) {
				bufferedWriter.write(list[k]+" "); //리스트 요소들을 출력 
			}
			bufferedWriter.write("\n");
			list[row-1] = 0; // 출력 이후엔 한칸 위로 돌아간다 
		}else {
		for(int j=1;j<=n;j++) { //DFS 시작
			if(!hasNum(j, list)) { // j를 포함하지 않는 경우에만 추가 (가지치기)
				list[row] = j;
				
				//if 평가 함수 
				backTrack(row+1, list); // 다음 열에 대한 백트래킹 시작 
				
			}
			list[row] = 0;// 배열 초기화
		}
		
	}

	}
	
	static boolean hasNum(int j,int[] list) {
		for(int num: list) {
			if(num==j) {
				return true;
			}
		} 
		return false;
	}

}
