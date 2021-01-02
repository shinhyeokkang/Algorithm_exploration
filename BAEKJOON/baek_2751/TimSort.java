package baek_2751;

import java.util.Arrays;
import java.io.*;

public class TimSort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//입력부
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine(); // readLine 메소드는 String 값만 받을수 있음
		int n = Integer.parseInt(s);// int로 형변환
		
		Integer[] list= new Integer[n];
		for(int i=0;i<n;i++) {
			String t = bufferedReader.readLine(); // readLine 메소드는 String 값만 받을수 있음
			int num = Integer.parseInt(t);// int로 형변환
			list[i] = num;
		}
		bufferedReader.close();
		//정렬부
		Arrays.sort(list);//tim sort
		//출력부
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int j=0;j<n;j++) {
			bufferedWriter.write(list[j]+"\n");
		}
		bufferedWriter.flush();
		bufferedWriter.close();

	}

}
