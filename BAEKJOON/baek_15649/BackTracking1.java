package baek_15649;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackTracking1 {
	static int n;
	static int m;
	static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�Էº�
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String input = bufferedReader.readLine(); // readLine �޼ҵ�� String ���� ������ ����
		StringTokenizer st = new StringTokenizer(input);
		String x = st.nextToken();
		String y = st.nextToken();
		n = Integer.parseInt(x);// int�� ����ȯ
		m = Integer.parseInt(y);
		int[] list = new int[m];
		
		bufferedReader.close();

		//��º�
		backTrack(0, list); // 0�� ���� ��Ʈ��ŷ ����
		bufferedWriter.flush();
		bufferedWriter.close();

	}
	static void backTrack(int row, int[] list) throws IOException{

		
		if(row==m) { // ���� ���������� ����������
			for(int k=0;k<m;k++) {
				bufferedWriter.write(list[k]+" "); //����Ʈ ��ҵ��� ��� 
			}
			bufferedWriter.write("\n");
			list[row-1] = 0; // ��� ���Ŀ� ��ĭ ���� ���ư��� 
		}else {
		for(int j=1;j<=n;j++) { //DFS ����
			if(!hasNum(j, list)) { // j�� �������� �ʴ� ��쿡�� �߰� (����ġ��)
				list[row] = j;
				
				//if �� �Լ� 
				backTrack(row+1, list); // ���� ���� ���� ��Ʈ��ŷ ���� 
				
			}
			list[row] = 0;// �迭 �ʱ�ȭ
		}
		
	}

	}
	
	static boolean hasNum(int j,int[] list) {
		for(int num: list) {
			if(num==j) {
				return true;
			}
		} 
		return false;
	}

}
