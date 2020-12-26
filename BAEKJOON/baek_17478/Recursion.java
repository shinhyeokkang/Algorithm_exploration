package baek_17478;

import java.util.Scanner;

public class Recursion {
     static int t=0;
	public static String recursive(int i){ //재귀함수
		
		if(i<1) {
			return (dash(t-i)+"\"재귀함수가 뭔가요?\"\n" +
					dash(t-i)+"\"재귀함수는 자기 자신을 호출하는 함수라네\"\n" +
					dash(t-i)+"라고 답변하였지.");
		}
		else {
		return (dash(t-i)+"\"재귀함수가 뭔가요?\"\n" + 
				dash(t-i)+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n" + 
				dash(t-i)+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n" + 
				dash(t-i)+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n")+ 
				recursive(i-1) +
				("\n")+dash(t-i)+("라고 답변하였지.");
		}
	
	}
	
	public static String dash(int i) { // 언더바 생성기
		
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
		System.out.print("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n"+ recursive(i));
		//개행문자 처리때문에 고생을 많이한 문제... /r/n이 안통하면 /n을 시도해보도록 하자.
		
	}

}
