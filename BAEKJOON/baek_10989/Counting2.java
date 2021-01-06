package baek_10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Counting2 {
	
	static int n;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//입력부
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine(); // readLine 메소드는 String 값만 받을수 있음
		n = Integer.parseInt(s);// int로 형변환
		int[] c =new int[10001];// 문제의 조건에 달려있는 수의 최댓값 10000을 담을수 있는 array
		// c array 는 처음 모든값을 0 으로 초기화 안시켜줘도 오류가? -> 안난다
		
		for(int i=0;i<n;i++) {
			String t = bufferedReader.readLine(); // readLine 메소드는 String 값만 받을수 있음
			int num = Integer.parseInt(t);// int로 형변환
			c[num]++;//갯수 array c에 num을 갯수만큼 c[num]에 저장 
			
		}

		bufferedReader.close();
		
		
		//출력부
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int j=1;j<c.length;j++) {// 입력조건이 자연수 범위이므로 1부터 시작
			while(c[j]>0) {// 값(해당 숫자의 갯수)이 1이상일 경우에만
				bufferedWriter.write(j+"\n"); // 해당 숫자 출력
				c[j]--;
			}
			
		}
		bufferedWriter.flush();
		bufferedWriter.close();

	}


}

