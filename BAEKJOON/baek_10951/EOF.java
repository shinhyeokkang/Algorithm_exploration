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
		// �Էº�
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = "";
		//input = bufferedReader.readLine(); // readLine �޼ҵ�� String ���� ������ ����
		while ((input=bufferedReader.readLine())!=null) {
				//System.out.println(input);
				StringTokenizer st = new StringTokenizer(input);
				String x = st.nextToken();
				String y = st.nextToken();
				int a = Integer.parseInt(x);// int�� ����ȯ
				int b = Integer.parseInt(y);// int�� ����ȯ
				int res = a + b;
				bufferedWriter.write(res + "\n");
			} 
			// readLine �޼ҵ�� String ���� ������ ����

		
		bufferedReader.close();
		// ��º�
		bufferedWriter.flush();
		bufferedWriter.close();

	}

}
