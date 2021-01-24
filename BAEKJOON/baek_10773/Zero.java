package baek_10773;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Zero {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		String s = br.readLine();
		int k = Integer.parseInt(s);// int로 형변환
		
		for(int i=0;i<k;i++) {
			String input = br.readLine();
			int num = Integer.parseInt(input);
			if(num==0) {
				st.pop();
			}
			else {
				st.push(num);
			}
		}
		
		int sum=0;
		int stackLength = st.size(); // 초기 stack의 크기를 저장해둔다
		for(int j=0;j<stackLength;j++) { // 여기서 만일 st.size()를 최대값으로 두면 반복도중 stack의 크기가 줄기때문에 문제가 발생한다.
			sum = sum + st.pop();
		
		}
		br.close();
		bw.write(sum+"\n");
		bw.flush();
		bw.close();


	}

}
