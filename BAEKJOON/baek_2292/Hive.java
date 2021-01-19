package baek_2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//기본 아이디어: 각 통과횟수 구간별로 패턴을 파악해보니 1, 2~7, 8~19 등 구간의 길이가 6씩 증가하는 패턴을 보였다.
		//따라서 1회 통과부터 차례로 시도해보며 점점 구간을 키워 비교하는 방식을 사용했다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int count=0; // 중간에 지나가는 벌집의 갯수

		while(true){
			int standard=1;// 첫번째 벌집은 기본값이므로 1을 가진다
			for(int i=count;i>0;i--) {
				standard=standard+6*i; // 패턴대로 standard를 더해준다
			}
			if(n<=standard) { // 주어진 수 n이 standard보다 작거나 같을 경우
				System.out.println(count+1); // 횟수를 출력하고
				break; // 반복종료
			}
			count++;
		}

	}

}
