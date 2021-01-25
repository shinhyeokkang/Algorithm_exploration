package baek_18258;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue2 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Deque<Integer> qu = new LinkedList<>(); // back을 구현하기위해 큐의 마지막 값도 조회할수 있어야 하므로 Deque선언
	
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
		int res=-2;
		if(token.hasMoreTokens()) {
			String snum = token.nextToken();
			int num = Integer.parseInt(snum);
			qu.add(num);
			return -2; // push의 경우 출력값이 없어야 하기에 -2를 보내 출력에서 제외
		}
		if(order.equals("pop")) {
			if(qu.isEmpty()) { return -1;}
			else {
			res = qu.poll();
			return res;
			}
		}
		else if(order.equals("size")) {
			res = qu.size();
			return res;
		}
		else if(order.equals("empty")) {
			if(qu.isEmpty()) {
				return 1;
			}else { return 0;}
		}
		else if(order.equals("front")) {
			if(qu.isEmpty()) {return -1;}
			else {
			res = qu.peek();
			return res;
			}
		}
		else if(order.equals("back")) {
			if(qu.isEmpty()) {return -1;}
			else {
				res = qu.peekLast();
				return res;
			}
		}
		else { return -2;} // 입력값이 없을경우 
	}

}