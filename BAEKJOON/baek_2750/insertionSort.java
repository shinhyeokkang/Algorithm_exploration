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
		
		int pointer; // ���� ���ڿ� ���� ����
		
		for(int i=1; i<list.length;i++) {
			
			pointer = list[i];
			for(int j=i-1;j>=0;j--) { // �񱳴���� �տ� ���ڵ� ��ġ
			if(pointer<list[j]) {
				list[j+1] = list[j];
				if(j==0) {list[j] = pointer;} // �����Ͱ� ���� ���ʿ� ���ص� ������, �� ������ �����Ѵ�
				}
			// �� ���� �� ���� ���� ������� �� ��ġ���� ���߰� pointer ����
			else {
				list[j+1] = pointer; 
				break; // ***** �߿�!! pointer ���� ���� j�� ã�� �� �� break �� �ؼ� �ݺ����� ���� ������ �̹� ���ĵ� �պκб��� ���ؼ� �ߺ����� ���ܹ�����. 
			}
			//System.out.println(Arrays.toString(list));
			}
			
		}
		return list;
		
		
	}

}
