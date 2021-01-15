package baek_1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Classroom {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int cnt = Integer.parseInt(s);
		int[][] meetings = new int[cnt][2]; 
		
		for(int i=0;i<cnt;i++) {
			
			String c = br.readLine();
			StringTokenizer st = new StringTokenizer(c);
			String x = st.nextToken();
			String y = st.nextToken();
			int start = Integer.parseInt(x);// int�� ����ȯ
			int end = Integer.parseInt(y);
			
			meetings[i][0] = start; // ȸ�� ���۽ð�
			meetings[i][1] = end;// ȸ�� ����ð�

	}
		
		Arrays.sort(meetings, new Comparator<int[]>() { // meetings[i][0] ���� ���ĵ� �ʿ���!
			@Override
			public int compare(int[] t1, int[] t2) {
				if(t1[1]==t2[1]) { // meetings[i][1]�� ���� ���� ��쿡��(ȸ�� ����ð��� ���� ��쿡��)
					return t1[0] - t2[0]; // meetings[i][0] ���� ������������ ���� (ȸ�� ���۽ð��� �̸� ������� ����)
				}
				return t1[1] - t2[1];
			}
		});
//		for(int j=0;j<meetings.length;j++) {
//			System.out.println(meetings[j][0]+" "+meetings[j][1]);
//		}
		
		int result = maxMeeting(meetings);
		System.out.println(result);

}
	static int maxMeeting(int[][] meetings) {
		int firstEnd = meetings[0][1]; // ���� ���� ����Ǵ� ȸ���� ����ð� 
		int count = 1;
		
		for(int i=1;i<meetings.length;i++) { //ó�� ȸ�Ǻ��� ���������� (ó�� �����̵Ǵ� ȸ�Ǵ� �����ϰ�)
			if(meetings[i][0]>=firstEnd) { // ���� �տ� ����� ȸ���� ����ð� ���ĳ� �����ð��� ���۵Ǵ� ȸ�Ƕ��,
				count++; // ȸ�� ������ �߰��ϰ�
				firstEnd = meetings[i][1]; // �� ȸ���� ����ð��� ���ο� �������� �ٲ۴�.
				//System.out.println(meetings[i][0]+" " +meetings[i][1]);
			}
		}
		return count;
	}
	
	
}
