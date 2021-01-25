package baek_11866;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josepus {


	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Queue<Integer> qu = new LinkedList<>(); // back을 구현하기위해 큐의 마지막 값도 조회할수 있어야 하므로 Deque선언
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		for(int i=1;i<=n;i++) {//1부터 N까지 숫자를 차례로 큐에 삽입
			qu.add(i);
			}
		bw.write("<");
		int count=0;// 턴마다 카운트해 k번째 턴에 죽을사람을 찾는데 사용
		int pointer;
		
		while(qu.size()!=1) {// queue에 1개의 값만이 남을때까지 반복 
			pointer = qu.poll();
			count++;
			if(count==k) {// k번째 턴일때, poll한 숫자를 다시 더해주지 않는다(제거한다)
				bw.write(pointer+", ");
				count=0; // count를 초기화한다
			}
			else { // k번째 턴이 아닌경우엔 
				qu.add(pointer); // 빼낸 숫자를 다시 queue에 넣어준다
			}
		}

		
		bw.write(qu.poll()+">");
		br.close();
		bw.flush();
		bw.close();
		
	}
	

}