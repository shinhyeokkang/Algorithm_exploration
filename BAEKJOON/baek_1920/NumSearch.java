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
		// N ����Ʈ �ް� ����
		String s = br.readLine();

		int n = Integer.parseInt(s);
		int[] arr = new int[n];
		String A = br.readLine();
		StringTokenizer st = new StringTokenizer(A);
		for(int i=0;i<n;i++) {// �� n���� �Է��� ����
			arr[i] = Integer.parseInt(st.nextToken());

		}
		Arrays.sort(arr);
		// M ����Ʈ �ޱ� 
		String sm = br.readLine();
		int m = Integer.parseInt(sm);
		int[] mList = new int[m];
		String B = br.readLine();
		StringTokenizer st2 = new StringTokenizer(B);
		for(int i=0;i<m;i++) {// �� n���� �Է��� ����
			mList[i] = Integer.parseInt(st2.nextToken());
		}
		
		binary(arr, mList);
		br.close();
		bw.flush();
		bw.close();


	}
	
	static void binary(int[] arr, int[] mList) throws IOException {

		
		for(int i=0;i<mList.length;i++) {// mList ���Ҹ� ������� �ִ´�
			int start = 0; //arr�� ���� index
			int end = arr.length-1;// arr�� ������ index
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
				mid = (start+end)/2; // mid ��갪�� 11.5 ó�� �Ҽ��� �Ʒ����� ������, int �̱� ������ �����Ѵ�. (11�� ��)
			}
			if(res!=1) {
				res = 0;
			}
			bw.write(res+"\n");
		}
		
		
		
		
	}
	
	

}
