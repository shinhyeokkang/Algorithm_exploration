package baek_10816;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NumCard2 {



	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Map<Integer,Integer> nMap = new HashMap<Integer,Integer>();
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// N ����Ʈ �ް� ����
		String s = br.readLine();

		int n = Integer.parseInt(s);
		String A = br.readLine();
		StringTokenizer st = new StringTokenizer(A);
		for(int i=0;i<n;i++) {// �� n���� �Է��� ����
			addMap(nMap, Integer.parseInt(st.nextToken()));

		}
		Object[] mapkey = nMap.keySet().toArray();
		Arrays.sort(mapkey); // -10 ���� ��� 7���� ũ�� ���ĵ� 

		
		
		// M ����Ʈ �ޱ� 
		String sm = br.readLine();
		int m = Integer.parseInt(sm);
		int[] mList = new int[m];
		String B = br.readLine();
		StringTokenizer st2 = new StringTokenizer(B);
		for(int i=0;i<m;i++) {// �� n���� �Է��� ����
			mList[i] = Integer.parseInt(st2.nextToken());
		}
		// m�� ���ҵ��� �����ϴ���, �����ϸ� � �ִ��� ��ȯ
		numSearch(nMap, mList);
		

		br.close();
		bw.flush();
		bw.close();
	}

	private static void numSearch(Map<Integer, Integer> nMap, int[] mList) throws IOException {
		// TODO Auto-generated method stub
		for(int i=0;i<mList.length;i++) {
			if(nMap.containsKey(mList[i])){
				bw.write(nMap.get(mList[i])+" ");
			}else {
				bw.write(0+" ");
			}
		}
	}

	private static void addMap(Map<Integer, Integer> nMap, int key) {
		// TODO Auto-generated method stub
		if(nMap.containsKey(key)) { // Map�� Ư�� key�� �̹� �����ϸ�,
			nMap.put(key, nMap.get(key)+1);//���� value�� 1�� �����ش�.
		}else {
			nMap.put(key, 1);
		}
		
	}

}
