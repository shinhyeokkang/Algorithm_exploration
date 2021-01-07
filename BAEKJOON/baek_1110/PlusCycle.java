package baek_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fin="";//반복되는 문자 2자리 저장
		int count=0; //반복 횟수 저장
		String a; // 앞자리 문자 저장
		String b; // 뒷자리 문자 저장
		String c; // 더해만든 숫자의 String 버전
		String origin; //반복여부 확인을 위해 초기 문자열 저장 
		int ai;
		int bi;
		int ci;// 저장된 새로운 숫자 
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine(); // readLine 메소드는 String 값만 받을수 있음
		int n = Integer.parseInt(s);// int로 형변환

		if(n<10) {
			s = "0"+s;
		}
		
		origin = s;
		
		while(!origin.equals(fin)) {
			a = s.substring(0,1);
			b = s.substring(1);
			ai = Integer.parseInt(a);// int로 형변환
			bi = Integer.parseInt(b);// int로 형변환
			ci = ai+bi; //String으로 형변환하지 않고 String과 더하면?
			c = Integer.toString(ci);
			if(c.length()>=2) {
			  c = c.substring(1);
			}
			
			s = b+c;
			fin = s;
			count++;
			//System.out.println(s + " " + count);
		}
		
		System.out.println(count);

	}

}
