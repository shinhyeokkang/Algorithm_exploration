package baek_10952;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class While {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�Էº�
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a=1;
		int b=1;
		while(a>0&&b<10) {
			String s = bufferedReader.readLine(); // readLine �޼ҵ�� String ���� ������ ����
			StringTokenizer st = new StringTokenizer(s);
			String x = st.nextToken();
			String y = st.nextToken();
			a = Integer.parseInt(x);// int�� ����ȯ
			b = Integer.parseInt(y);// int�� ����ȯ
			if(a==0&&b==0) {break;}
			int res = a + b;
			bufferedWriter.write(res+"\n");
			
		}
		bufferedReader.close();
		//��º�
		bufferedWriter.flush();
		bufferedWriter.close();

	}

}
