package baek_2798;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] numArray = new int[n];
		
		for(int i=0;i<n;i++) {
			numArray[i] = sc.nextInt();
		}
		int max = brute(n,m,numArray);
		System.out.print(max);
	}
	
	
	public static int brute(int n, int m, int[] numArray) {
		ArrayList<Integer> result= new ArrayList<Integer>();
		ArrayList<String> result2= new ArrayList<String>();
		for(int i=0;i<n;i++) { // 5,6,7,8,9
			for(int j=i+1;j<n;j++) { // 처음 선택 숫자를 제외한 6,7,8,9
				for(int t=j+1;t<n;t++) { // 첫번째, 두번째 선택 숫자를 제외한 7,8,9
					int sum = numArray[i]+numArray[j]+numArray[t];
					result2.add("("+numArray[i]+","+numArray[j]+","+numArray[t]+")");
					if(sum <= m) { // 제한수 m 보다 작거나 같은 합만 저장
						result.add(sum);
					}
					
				}
			}
		}
		
		//System.out.println(result2);
		//System.out.println(result);
		int max = Collections.max(result); //Collection 자료구조에서 최댓값 찾는 코드 
		return max;
	}

}
