package baek_2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�⺻ ���̵��: �� ���Ƚ�� �������� ������ �ľ��غ��� 1, 2~7, 8~19 �� ������ ���̰� 6�� �����ϴ� ������ ������.
		//���� 1ȸ ������� ���ʷ� �õ��غ��� ���� ������ Ű�� ���ϴ� ����� ����ߴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int count=0; // �߰��� �������� ������ ����

		while(true){
			int standard=1;// ù��° ������ �⺻���̹Ƿ� 1�� ������
			for(int i=count;i>0;i--) {
				standard=standard+6*i; // ���ϴ�� standard�� �����ش�
			}
			if(n<=standard) { // �־��� �� n�� standard���� �۰ų� ���� ���
				System.out.println(count+1); // Ƚ���� ����ϰ�
				break; // �ݺ�����
			}
			count++;
		}

	}

}
