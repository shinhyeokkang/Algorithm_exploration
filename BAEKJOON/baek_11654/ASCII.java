package baek_11654;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ASCII {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		byte[] ascii = s.getBytes();
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//System.out.println(ascii[0]); // 여기선 아스키코드 그대로 숫자가  출력된다.
		//bw.write(ascii[0]); // 아스키코드에 해당하는 문자를 출력 = 원래 입력값으로 돌아가버림
		bw.write(ascii[0]+"\n"); // 하지만 이렇게 개행문자를 추가해 다른 자료형을 출력하게 하면 그대로 Stirng으로 인식, 아스키코드로 출력된다.  
		bw.flush();
		bw.close();

	}

}
