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
		//�Էº�
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine(); // readLine �޼ҵ�� String ���� ������ ����
		n = Integer.parseInt(s);// int�� ����ȯ
		ArrayList<Integer> list= new ArrayList<Integer>(n);
		
		for(int i=0;i<n;i++) {
			String t = bufferedReader.readLine(); // readLine �޼ҵ�� String ���� ������ ����
			int num = Integer.parseInt(t);// int�� ����ȯ
			list.add(num);
		}

		bufferedReader.close();
		//���ĺ�
		ArrayList<Integer> sortedList = ordering(list);
		
		
		
		
		//��º�
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int j=0;j<sortedList.size();j++) {
			bufferedWriter.write(sortedList.get(j)+"\n");
		}
		bufferedWriter.flush();
		bufferedWriter.close();

	}
	
	public static ArrayList<Integer> ordering(ArrayList<Integer> list) {
		//�����迭 c ����
		ArrayList<Integer> c = new ArrayList<Integer>(10001);// ������ ���ǿ� �޷��ִ� ���� �ִ� 10000�� ������ �ִ� ���
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
		//���İ���
		ArrayList<Integer> sortedList = new ArrayList<Integer>(n);
		for(int j=0;j<n;j++) {
			sortedList.add(0);
		}
		
		for(int s=list.size()-1;s>=0;s--) {
			c.set(list.get(s), c.get(list.get(s))-1); //������ -1 
			sortedList.set(c.get(list.get(s)), list.get(s));//c�� ���ҿ� �ش��ϴ� sortedList�� �ε����� c�� �ε��� ���� ����
		}
	
		return sortedList;
	}

}
