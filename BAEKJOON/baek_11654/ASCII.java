package baek_11654;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ASCII {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		byte[] ascii = s.getBytes();
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//System.out.println(ascii[0]); // ���⼱ �ƽ�Ű�ڵ� �״�� ���ڰ�  ��µȴ�.
		//bw.write(ascii[0]); // �ƽ�Ű�ڵ忡 �ش��ϴ� ���ڸ� ��� = ���� �Է°����� ���ư�����
		bw.write(ascii[0]+"\n"); // ������ �̷��� ���๮�ڸ� �߰��� �ٸ� �ڷ����� ����ϰ� �ϸ� �״�� Stirng���� �ν�, �ƽ�Ű�ڵ�� ��µȴ�.  
		bw.flush();
		bw.close();

	}

}
