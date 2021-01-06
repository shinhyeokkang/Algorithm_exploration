package baek_10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class CountingSort {
	
	static int n;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//입력부
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine(); // readLine 메소드는 String 값만 받을수 있음
		n = Integer.parseInt(s);// int로 형변환
		ArrayList<Integer> list= new ArrayList<Integer>(n);
		
		for(int i=0;i<n;i++) {
			String t = bufferedReader.readLine(); // readLine 메소드는 String 값만 받을수 있음
			int num = Integer.parseInt(t);// int로 형변환
			list.add(num);
		}

		bufferedReader.close();
		//정렬부
		ArrayList<Integer> sortedList = ordering(list);
		
		
		
		
		//출력부
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int j=0;j<sortedList.size();j++) {
			bufferedWriter.write(sortedList.get(j)+"\n");
		}
		bufferedWriter.flush();
		bufferedWriter.close();

	}
	
	public static ArrayList<Integer> ordering(ArrayList<Integer> list) {
		//누적배열 c 생성
		ArrayList<Integer> c = new ArrayList<Integer>(10001);// 문제의 조건에 달려있는 수의 최댓값 10000을 담을수 있는 행렬
		int max = Collections.max(list);
		for(int j=0;j<=max;j++) {
			c.add(0);
		}
		for(int i=0;i<n;i++) {
			c.set(list.get(i), c.get(list.get(i))+1);
		}
		for(int k=1;k<c.size();k++) {
			c.set(k, c.get(k-1)+c.get(k));
		}
		//정렬과정
		ArrayList<Integer> sortedList = new ArrayList<Integer>(n);
		for(int j=0;j<n;j++) {
			sortedList.add(0);
		}
		
		for(int s=list.size()-1;s>=0;s--) {
			c.set(list.get(s), c.get(list.get(s))-1); //누적합 -1 
			sortedList.set(c.get(list.get(s)), list.get(s));//c의 원소에 해당하는 sortedList의 인덱스에 c의 인덱스 값을 삽입
		}
	
		return sortedList;
	}

}
