package baek_2751;

import java.util.Arrays;
import java.io.*;

public class TimSort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�Էº�
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine(); // readLine �޼ҵ�� String ���� ������ ����
		int n = Integer.parseInt(s);// int�� ����ȯ
		
		Integer[] list= new Integer[n];
		for(int i=0;i<n;i++) {
			String t = bufferedReader.readLine(); // readLine �޼ҵ�� String ���� ������ ����
			int num = Integer.parseInt(t);// int�� ����ȯ
			list[i] = num;
		}
		bufferedReader.close();
		//���ĺ�
		Arrays.sort(list);//tim sort
		//��º�
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int j=0;j<n;j++) {
			bufferedWriter.write(list[j]+"\n");
		}
		bufferedWriter.flush();
		bufferedWriter.close();

	}

}
