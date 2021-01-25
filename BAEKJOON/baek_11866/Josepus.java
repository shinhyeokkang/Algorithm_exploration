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
	static Queue<Integer> qu = new LinkedList<>(); // back�� �����ϱ����� ť�� ������ ���� ��ȸ�Ҽ� �־�� �ϹǷ� Deque����
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		for(int i=1;i<=n;i++) {//1���� N���� ���ڸ� ���ʷ� ť�� ����
			qu.add(i);
			}
		bw.write("<");
		int count=0;// �ϸ��� ī��Ʈ�� k��° �Ͽ� ��������� ã�µ� ���
		int pointer;
		
		while(qu.size()!=1) {// queue�� 1���� ������ ���������� �ݺ� 
			pointer = qu.poll();
			count++;
			if(count==k) {// k��° ���϶�, poll�� ���ڸ� �ٽ� �������� �ʴ´�(�����Ѵ�)
				bw.write(pointer+", ");
				count=0; // count�� �ʱ�ȭ�Ѵ�
			}
			else { // k��° ���� �ƴѰ�쿣 
				qu.add(pointer); // ���� ���ڸ� �ٽ� queue�� �־��ش�
			}
		}

		
		bw.write(qu.poll()+">");
		br.close();
		bw.flush();
		bw.close();
		
	}
	

}