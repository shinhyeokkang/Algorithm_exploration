package baek_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fin="";//�ݺ��Ǵ� ���� 2�ڸ� ����
		int count=0; //�ݺ� Ƚ�� ����
		String a; // ���ڸ� ���� ����
		String b; // ���ڸ� ���� ����
		String c; // ���ظ��� ������ String ����
		String origin; //�ݺ����� Ȯ���� ���� �ʱ� ���ڿ� ���� 
		int ai;
		int bi;
		int ci;// ����� ���ο� ���� 
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine(); // readLine �޼ҵ�� String ���� ������ ����
		int n = Integer.parseInt(s);// int�� ����ȯ

		if(n<10) {
			s = "0"+s;
		}
		
		origin = s;
		
		while(!origin.equals(fin)) {
			a = s.substring(0,1);
			b = s.substring(1);
			ai = Integer.parseInt(a);// int�� ����ȯ
			bi = Integer.parseInt(b);// int�� ����ȯ
			ci = ai+bi; //String���� ����ȯ���� �ʰ� String�� ���ϸ�?
			c = Integer.toString(ci);
			if(c.length()>=2) {
			  c = c.substring(1);
			}
			
			s = b+c;
			fin = s;
			count++;
			//System.out.println(s + " " + count);
		}
		
		System.out.println(count);

	}

}
