package baek_10951;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class EOF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 입력부
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = "";
		//input = bufferedReader.readLine(); // readLine 메소드는 String 값만 받을수 있음
		while ((input=bufferedReader.readLine())!=null) {
				//System.out.println(input);
				StringTokenizer st = new StringTokenizer(input);
				String x = st.nextToken();
				String y = st.nextToken();
				int a = Integer.parseInt(x);// int로 형변환
				int b = Integer.parseInt(y);// int로 형변환
				int res = a + b;
				bufferedWriter.write(res + "\n");
			} 
			// readLine 메소드는 String 값만 받을수 있음

		
		bufferedReader.close();
		// 출력부
		bufferedWriter.flush();
		bufferedWriter.close();

	}

}
