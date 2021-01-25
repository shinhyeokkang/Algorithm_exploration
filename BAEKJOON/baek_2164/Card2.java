package baek_2164;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Card2 {


	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Queue<Integer> qu = new LinkedList<>(); // back을 구현하기위해 큐의 마지막 값도 조회할수 있어야 하므로 Deque선언
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String s = br.readLine();
		int n = Integer.parseInt(s);// int로 형변환
		for(int i=1;i<=n;i++) {//1부터 N까지 숫자를 차례로 큐에 삽입
			qu.add(i);
			}
			boolean odd = true; //홀수마다 버리는 규칙 생성
		while(qu.size()!=1) {// queue에 1개의 값만이 남을때까지 반복 
			if(odd) {
				qu.poll();
				
				odd = false;
			}else {
				int pointer = qu.poll();
				qu.add(pointer);
				odd = true;}
			
		}
		int res = qu.poll();
		
		bw.write(res+"\n");
		br.close();
		bw.flush();
		bw.close();
		
	}
	

}