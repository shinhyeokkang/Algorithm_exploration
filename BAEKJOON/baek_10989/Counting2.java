package baek_10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Counting2 {
	
	static int n;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�Էº�
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine(); // readLine �޼ҵ�� String ���� ������ ����
		n = Integer.parseInt(s);// int�� ����ȯ
		int[] c =new int[10001];// ������ ���ǿ� �޷��ִ� ���� �ִ� 10000�� ������ �ִ� array
		// c array �� ó�� ��簪�� 0 ���� �ʱ�ȭ �Ƚ����൵ ������? -> �ȳ���
		
		for(int i=0;i<n;i++) {
			String t = bufferedReader.readLine(); // readLine �޼ҵ�� String ���� ������ ����
			int num = Integer.parseInt(t);// int�� ����ȯ
			c[num]++;//���� array c�� num�� ������ŭ c[num]�� ���� 
			
		}

		bufferedReader.close();
		
		
		//��º�
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int j=1;j<c.length;j++) {// �Է������� �ڿ��� �����̹Ƿ� 1���� ����
			while(c[j]>0) {// ��(�ش� ������ ����)�� 1�̻��� ��쿡��
				bufferedWriter.write(j+"\n"); // �ش� ���� ���
				c[j]--;
			}
			
		}
		bufferedWriter.flush();
		bufferedWriter.close();

	}


}

