package baek_10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);// int로 형변환
		
		int result = facto(n);
		
		System.out.println(result);

	}
	
	static int facto(int n) {
		if(n==0) { return 1;} //f(0) 인 경우 1을 출력
		else { // 그 외엔 n을 곱함
			return facto(n-1)*n;
		}
	}

}
