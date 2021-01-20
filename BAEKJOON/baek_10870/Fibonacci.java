package baek_10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);// int로 형변환
		
		int result = fiboListing(n);
		
		System.out.println(result);

	}
	
	public static int fiboListing(int n){

		if(n==0) {
	
			return 0;
		}
		else if(n==1) {
	
			return 1;
			}
		else {
			return fiboListing(n-1) + fiboListing(n-2); // 재귀를 통해 결과값 찾을때까지 반복
		}

	}

}
