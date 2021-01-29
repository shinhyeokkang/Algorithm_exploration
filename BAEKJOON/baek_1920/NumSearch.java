package baek_1920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumSearch {


	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// N 리스트 받고 정렬
		String s = br.readLine();

		int n = Integer.parseInt(s);
		int[] arr = new int[n];
		String A = br.readLine();
		StringTokenizer st = new StringTokenizer(A);
		for(int i=0;i<n;i++) {// 총 n번의 입력을 받음
			arr[i] = Integer.parseInt(st.nextToken());

		}
		Arrays.sort(arr);
		// M 리스트 받기 
		String sm = br.readLine();
		int m = Integer.parseInt(sm);
		int[] mList = new int[m];
		String B = br.readLine();
		StringTokenizer st2 = new StringTokenizer(B);
		for(int i=0;i<m;i++) {// 총 n번의 입력을 받음
			mList[i] = Integer.parseInt(st2.nextToken());
		}
		
		binary(arr, mList);
		br.close();
		bw.flush();
		bw.close();


	}
	
	static void binary(int[] arr, int[] mList) throws IOException {

		
		for(int i=0;i<mList.length;i++) {// mList 원소를 순서대로 넣는다
			int start = 0; //arr의 시작 index
			int end = arr.length-1;// arr의 마지막 index
			int mid = (start+end)/2;
			int res = -1;
			while(end-start>=0) {
				if(mList[i]==arr[mid]) {
					res = 1;
					break;
				}
				else if(mList[i]<arr[mid]) {
					end = mid-1;
					
				}
				else {
					start = mid+1;
				}
				mid = (start+end)/2; // mid 계산값이 11.5 처럼 소수점 아래값이 나오면, int 이기 때문에 버림한다. (11이 됨)
			}
			if(res!=1) {
				res = 0;
			}
			bw.write(res+"\n");
		}
		
		
		
		
	}
	
	

}
