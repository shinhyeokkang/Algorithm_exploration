package baek_10828;

import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Stacker {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Stack<Integer> st = new Stack<>();
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String s = br.readLine();
		int n = Integer.parseInt(s);// int로 형변환

		for(int i=0;i<n;i++) {
			String input = br.readLine();
			int res = stacking(input);
			if(res != -2) {
			bw.write(res+"\n");
			}
			
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	static int stacking(String input) {
		StringTokenizer token = new StringTokenizer(input);
		String order = token.nextToken();
		int res;
		if(token.hasMoreTokens()) {
			String snum = token.nextToken();
			int num = Integer.parseInt(snum);
			st.push(num);
			return -2; // push의 경우 출력값이 없어야 하기에 -2를 보내 출력에서 제외
		}
		if(order.equals("pop")) {
			if(st.empty()) { return -1;}
			else {
			res = st.pop();
			return res;
			}
		}
		else if(order.equals("size")) {
			res = st.size();
			return res;
		}
		else if(order.equals("empty")) {
			if(st.empty()) {
				return 1;
			}else { return 0;}
		}
		else if(order.equals("top")) {
			if(st.empty()) {return -1;}
			else {
			res = st.peek();
			return res;
			}
		}else { return -2;} // 입력값이 없을경우 
	}

}
