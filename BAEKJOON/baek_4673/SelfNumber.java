package baek_4673;


public class SelfNumber {
	public static void main(String[] args) {
		int[] list = new int[10001]; // 0~10000 ������ ũ�⸦ ������ �迭 ����

		for(int i=1;i<=10001;i++) { //1���� 10000���� 
			list = d(i, list); // �����ڸ� ������ ���� üũ (�ش�Ǵ� ������ �ε����� ������ �ڸ��� 1�� �ٲ�)
		}
		for(int j=1;j<list.length;j++) { //1����
			if(list[j]==0) { // �����ڸ� ������ �ʴ� �����ѹ��� ���
				System.out.println(j); 
			}
		}
	}
	
	public static int[] d(int n, int[] list) {
		int next=n;
		String s = Integer.toString(n);
		
		for(int i=0;i<s.length();i++) {
		String sub = s.substring(i, i+1);
		next = next + Integer.parseInt(sub);
		}
		if(next<list.length) {
		list[next] = 1; // list ���� �����ϴ� 
		list = d(next,list); // ���
		}
		return list;
	}

}
