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
			int start = Integer.parseInt(x);// int로 형변환
			int end = Integer.parseInt(y);
			
			meetings[i][0] = start; // 회의 시작시각
			meetings[i][1] = end;// 회의 종료시각

	}
		
		Arrays.sort(meetings, new Comparator<int[]>() { // meetings[i][0] 간의 정렬도 필요함!
			@Override
			public int compare(int[] t1, int[] t2) {
				if(t1[1]==t2[1]) { // meetings[i][1]이 서로 같을 경우에는(회의 종료시각이 같을 경우에는)
					return t1[0] - t2[0]; // meetings[i][0] 기준 오름차순으로 정렬 (회의 시작시간이 이른 순서대로 정렬)
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
		int firstEnd = meetings[0][1]; // 가장 먼저 종료되는 회의의 종료시각 
		int count = 1;
		
		for(int i=1;i<meetings.length;i++) { //처음 회의부터 마지막까지 (처음 기준이되는 회의는 제외하고)
			if(meetings[i][0]>=firstEnd) { // 만약 앞에 종료된 회의의 종료시각 이후나 같은시각에 시작되는 회의라면,
				count++; // 회의 갯수에 추가하고
				firstEnd = meetings[i][1]; // 이 회의의 종료시각을 새로운 기준으로 바꾼다.
				//System.out.println(meetings[i][0]+" " +meetings[i][1]);
			}
		}
		return count;
	}
	
	
}
