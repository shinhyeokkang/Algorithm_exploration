package baek_17478;

import java.util.Scanner;

public class Recursion {
     static int t=0;
	public static String recursive(int i){ //����Լ�
		
		if(i<1) {
			return (dash(t-i)+"\"����Լ��� ������?\"\n" +
					dash(t-i)+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n" +
					dash(t-i)+"��� �亯�Ͽ���.");
		}
		else {
		return (dash(t-i)+"\"����Լ��� ������?\"\n" + 
				dash(t-i)+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n" + 
				dash(t-i)+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n" + 
				dash(t-i)+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n")+ 
				recursive(i-1) +
				("\n")+dash(t-i)+("��� �亯�Ͽ���.");
		}
	
	}
	
	public static String dash(int i) { // ����� ������
		
		String dddd = "____";
		
		if(i<1) {
			return "";
		}
		
		return dddd+dash(i-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int i=sc.nextInt();
		t = i;
		System.out.print("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n"+ recursive(i));
		//���๮�� ó�������� ����� ������ ����... /r/n�� �����ϸ� /n�� �õ��غ����� ����.
		
	}

}
