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
	static Queue<Integer> qu = new LinkedList<>(); // back�� �����ϱ����� ť�� ������ ���� ��ȸ�Ҽ� �־�� �ϹǷ� Deque����
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String s = br.readLine();
		int n = Integer.parseInt(s);// int�� ����ȯ
		for(int i=1;i<=n;i++) {//1���� N���� ���ڸ� ���ʷ� ť�� ����
			qu.add(i);
			}
			boolean odd = true; //Ȧ������ ������ ��Ģ ����
		while(qu.size()!=1) {// queue�� 1���� ������ ���������� �ݺ� 
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