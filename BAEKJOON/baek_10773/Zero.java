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
		int k = Integer.parseInt(s);// int�� ����ȯ
		
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
		int stackLength = st.size(); // �ʱ� stack�� ũ�⸦ �����صд�
		for(int j=0;j<stackLength;j++) { // ���⼭ ���� st.size()�� �ִ밪���� �θ� �ݺ����� stack�� ũ�Ⱑ �ٱ⶧���� ������ �߻��Ѵ�.
			sum = sum + st.pop();
		
		}
		br.close();
		bw.write(sum+"\n");
		bw.flush();
		bw.close();


	}

}
