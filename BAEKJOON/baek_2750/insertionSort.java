package baek_2750;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] list = new int[n];
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			list[i] = num;
		}
		
		int[] sortlist = insertSort(list);
		for(int k=0; k<sortlist.length;k++) {
			System.out.println(sortlist[k]);
		}
		

	}
	public static int[] insertSort(int[] list) {
		
		int pointer; // 앞의 숫자와 비교할 숫자
		
		for(int i=1; i<list.length;i++) {
			
			pointer = list[i];
			for(int j=i-1;j>=0;j--) { // 비교대상인 앞에 숫자들 위치
			if(pointer<list[j]) {
				list[j+1] = list[j];
				if(j==0) {list[j] = pointer;} // 포인터가 가장 앞쪽에 비교해도 작을때, 맨 앞으로 설정한다
				}
			// 비교 도중 더 작은 값을 만난경우 그 위치에서 멈추고 pointer 삽입
			else {
				list[j+1] = pointer; 
				break; // ***** 중요!! pointer 보다 작은 j를 찾고 난 후 break 를 해서 반복문을 깨지 않으면 이미 정렬된 앞부분까지 비교해서 중복값이 생겨버린다. 
			}
			//System.out.println(Arrays.toString(list));
			}
			
		}
		return list;
		
		
	}

}
