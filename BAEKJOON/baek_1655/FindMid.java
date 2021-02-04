package baek_1655;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class FindMid {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int heapMaxSize=0;
	static int heapMinSize=0;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		int[] heapMax = new int[n]; 
		int[] heapMin = new int[n]; // �ʱⰪ 0���� �ϸ� �ȵ�!!
		
		for(int j=0; j<n;j++) {
			heapMax[j] = 10001;
			heapMin[j] = 10001;
		}
		
		for(int i=0;i<n;i++) {//1���� N���� �� �Է� 
			String x = br.readLine();
			int num = Integer.parseInt(x);
			if(heapMaxSize<=heapMinSize) { // Max�� ũ�Ⱑ Min���� �۰ų� ������
				putMax(heapMax,num); // Max�� ���� ����
				
			}
			else {
				putMin(heapMin,num); // ������ ��쿣 Min�� ���� 
			}
			if(heapMax[1]>heapMin[1]&&heapMin[1]!=10001) { // Max�� �ִ��� Min�� �ּڰ����� Ŭ ���, ���� ���� //  TO DO !!
				// TO DO: 1 0 0 -4 -2 4 8 case�϶�, �����ʿ��� -4�� �ѱ�°� ó��
				int tempMax = heapMax[1];
				int tempMin = heapMin[1];

				popMax(heapMax); // Max[1] �� pop�ϰ�
				putMax(heapMax,tempMin); // Min�� �ּڰ��� put
				popMin(heapMin); // Min[1]�� pop �ϰ�
				putMin(heapMin,tempMax);// Max�� �ִ��� put
				
			}
			
			
			
				 bw.write(heapMax[1]+"\n"); // heapMax�� ���� ū ���� �� �߰����� �ȴ�
			}
		
		br.close();
		bw.flush();
		bw.close();

	
	}
	private static void putMax(int[] heap, int num) {
		// TODO Auto-generated method stub

		
		heap[++heapMaxSize] = num; // heap�� ũ�⸦ 1 �ø��� �� ��ġ�� num ����
		
		for(int i = heapMaxSize;i>1;i/=2) { // �ʱⰪ�� ���� �ε����� heapSize, �ε����� 1�� �Ǳ�������, �� �ݺ����� 2�� ������(�θ���)���� ���� 
		if(heap[i]>heap[i/2]) { // ���� ���� ���� �θ��庸�� Ŭ ���,
			// �θ����� ���� �������� ���� �ڹٲ۴�
			swap(heap, i, i/2);
		}
		else {
			break;
			}
		}
//		for(int j=1;j<=heapMaxSize;j++) {
//			System.out.println("PUT Max! index: "+j + " value: "+ heap[j]);
//		}
		}
	
	private static void putMin(int[] heap, int num) {
		// TODO Auto-generated method stub

		
		heap[++heapMinSize] = num; // heap�� ũ�⸦ 1 �ø��� �� ��ġ�� num ����
		
		for(int i = heapMinSize;i>1;i/=2) { // �ʱⰪ�� ���� �ε����� heapSize, �ε����� 1�� �Ǳ�������, �� �ݺ����� 2�� ������(�θ���)���� ���� 
		if(heap[i]<heap[i/2]) { // ���� ���� ���� �θ��庸�� ���� ���,
			// �θ����� ���� �������� ���� �ڹٲ۴�
			swap(heap, i, i/2);
		}
		else {
			break;
			}
		}
//		for(int j=1;j<=heapMinSize;j++) {
//			System.out.println("PUT Min! index: "+j + " value: "+ heap[j]);
//		}
		}
	private static void popMax(int[] heap) throws IOException {
		// TODO Auto-generated method stub

		if(heapMaxSize==0) {// heap�� �� �迭�� ���
		
			return;
		}
		
		heap[1] = heap[heapMaxSize];// ���� ������ ����� ���� root ��忡 ����
		heap[heapMaxSize--] = 10001; // ������ ��尪�� 0���� �ʱ�ȭ�ϰ�, �迭���̸� 1 ����
		// �� �ڽĳ���� �� ū���� �ڸ��� �ٲٴ� ���� �ݺ�
		for(int i=1;i*2<=heapMaxSize;) { // i�� �ε���, i�� �ڽĳ�尡 ������ ���,
			if(heap[i*2+1] != 10001) {
			if(heap[i*2]<heap[i]&&heap[i*2+1]<heap[i]) { // �θ��尡 �ڽĳ�庸�� Ŭ ���

				break;
			}
			
			else if(heap[i*2]>heap[i*2+1]) { // ���� �ڽĳ�尡 �� Ŭ ���
				swap(heap, i, i*2);
				i = i*2;
				}
			else { // ������ �ڽĳ�尡 �� Ŭ ���
				swap(heap, i, i*2+1);
				i = i*2+1;	
			}
			}
			else { // ������ �ڽ� ��尡 10001�� ���  
				if(heap[i*2]<=heap[i]) { // �θ��尡 �ڽĳ�庸�� ũ�ų� ���� ���

					break;
				}
				
				else { // ���� �ڽĳ�尡 �� Ŭ ���
					swap(heap, i, i*2);
					i = i*2;
					}
			}
			}
//		for(int j=1;j<=heapMaxSize;j++) {
//			System.out.println("POP Max! index: "+j + " value: "+ heap[j]);
//		}
		
		}
	
	private static void popMin(int[] heap) {
		// TODO Auto-generated method stub

		if(heapMinSize==0) {// heap�� �� �迭�� ���
			return;
		}
		
		heap[1] = heap[heapMinSize];// ���� ������ ����� ���� root ��忡 ����
		heap[heapMinSize--] = 10001; // ������ ��尪�� 0���� �ʱ�ȭ�ϰ�, �迭���̸� 1 ����
		// �� �ڽĳ���� �� ���� ���� �ڸ��� �ٲٴ� ���� �ݺ�
		for(int i=1;i*2<=heapMinSize;) { // i�� �ε���, i�� �ڽĳ�尡 ������ ���,
			if(heap[i*2+1]!=10001) { // ��������� heap[heapSize]=0 �� �񱳰��� �ݿ��Ǿ �߻��ϴ� ���� ����
			if(heap[i*2]>heap[i]&&heap[i*2+1]>heap[i]) { // �θ��尡 �ڽĳ�庸�� ���� ���

				break;
			}
	
			else if(heap[i*2]<heap[i*2+1]) { // ���� �ڽĳ�尡 �� ���� ���
				swap(heap, i, i*2);
				i = i*2;
				}
			else { // ������ �ڽĳ�尡 �� ���� ���
				swap(heap, i, i*2+1);
				i = i*2+1;	
			}
			}else {
				if(heap[i*2]>heap[i]) { // �θ��尡 ���� �ڽ� ��庸�� ���� ���

					break;
				}
		
				else { // ���� �ڽĳ�尡 �� ���� ���
					swap(heap, i, i*2);
					i = i*2;
					}
				
			}
			}
//		for(int j=1;j<=heapMinSize;j++) {
//			System.out.println("POP Min! index: "+j + " value: "+ heap[j]);
//		}
		
		}
	
	private static void swap(int[] heap, int i, int j) {
		// TODO Auto-generated method stub
		int temp;
		temp = heap[i]; // �θ����� ���� �������� ���� �ڹٲ۴�
		heap[i] = heap[j];
		heap[j] = temp;
		
	}
	
	
	
	}


