package baek_1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		String x = st.nextToken();
		String y = st.nextToken();
		String z = st.nextToken();
		int a = Integer.parseInt(x);// int�� ����ȯ
		int b = Integer.parseInt(y);
		int c = Integer.parseInt(z);	
		
		int point;
		
		if(c!=b&&!(c==0&&b==0)) {
		point = a/(c-b); // ������� int�� �޾� �Ҽ��� �Ʒ��� ���� ����
		}
		else { point = -1;} // c�� b�� ���ų�, �Ѵ� 0�� ��� ���ͺб��� �߻� �Ұ�
		
		if(point<0) {
			System.out.println(-1);
		}
		else {
			System.out.println(point+1);
		}

	}

}
