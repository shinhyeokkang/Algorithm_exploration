package baek_1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		String x = st.nextToken();
		String y = st.nextToken();
		String z = st.nextToken();
		int a = Integer.parseInt(x);// int로 형변환
		int b = Integer.parseInt(y);
		int c = Integer.parseInt(z);	
		
		int point;
		
		if(c!=b&&!(c==0&&b==0)) {
		point = a/(c-b); // 결과값을 int로 받아 소수점 아래는 강제 버림
		}
		else { point = -1;} // c가 b와 같거나, 둘다 0인 경우 손익분기점 발생 불가
		
		if(point<0) {
			System.out.println(-1);
		}
		else {
			System.out.println(point+1);
		}

	}

}
