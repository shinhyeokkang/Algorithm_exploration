package baek_4673;


public class SelfNumber {
	public static void main(String[] args) {
		int[] list = new int[10001]; // 0~10000 까지의 크기를 가지는 배열 생성

		for(int i=1;i<=10001;i++) { //1부터 10000까지 
			list = d(i, list); // 생성자를 가지는 수를 체크 (해당되는 숫자의 인덱스를 가지는 자리를 1로 바꿈)
		}
		for(int j=1;j<list.length;j++) { //1부터
			if(list[j]==0) { // 생성자를 가지지 않는 셀프넘버만 출력
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
		list[next] = 1; // list 에서 존재하는 
		list = d(next,list); // 재귀
		}
		return list;
	}

}
