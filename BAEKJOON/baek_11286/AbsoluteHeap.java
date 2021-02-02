package baek_11286;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AbsoluteHeap {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int heapSize=0;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		int[] heap = new int[n]; //�޸� ������ �������� ũ�⸦ n���� ����
		
		for(int i=0;i<n;i++) {//1���� N���� �� �Է� 
			String x = br.readLine();
			int num = Integer.parseInt(x);
			if(num==0) {// �Է��� 0�� ��� �ִ밪�� index 1�� ��ġ�� �������
				popMinabs(heap);
			}
			else {// �������� ��� �Է°��� heap�� �ְ� ����
				putNum(heap, num);
			}
				 
			}
		
		br.close();
		bw.flush();
		bw.close();
	}

	private static void putNum(int[] heap, int num) {
		// TODO Auto-generated method stub

		
		heap[++heapSize] = num; // heap�� ũ�⸦ 1 �ø��� �� ��ġ�� num ����
		
		for(int i = heapSize;i>1;i/=2) { // �ʱⰪ�� ���� �ε����� heapSize, �ε����� 1�� �Ǳ�������, �� �ݺ����� 2�� ������(�θ���)���� ���� 
		if(Math.abs(heap[i])<Math.abs(heap[i/2])) { // ���� ���� ���� ������ �θ��庸�� ���� ���,
			//�θ����� ���� �������� ���� �ڹٲ۴�
			swap(heap, i, i/2);
		}
		else if(Math.abs(heap[i])==Math.abs(heap[i/2])&&heap[i]<heap[i/2]){ // �θ���� ������ ���� ���ڴ� �������
			// �θ����� ���� �������� ���� �ڹٲ۴�
			swap(heap, i, i/2);
		}
		else {
			break;
		}
		}
//		for(int j=1;j<=heapSize;j++) {
//			System.out.println("PUT! index: "+j + " value: "+ heap[j]);
//		}
		}
	

	private static void popMinabs(int[] heap) throws IOException {
		// TODO Auto-generated method stub

		if(heapSize==0) {// heap�� �� �迭�� ���
			bw.write(0+"\n");
			return;
		}
		
		bw.write(heap[1]+"\n"); // ���� root ��带 ���
		heap[1] = heap[heapSize];// ���� ������ ����� ���� root ��忡 ����
		heap[heapSize--] = 0; // ������ ��尪�� 0���� �ʱ�ȭ�ϰ�, �迭���̸� 1 ����
		// �� �ڽĳ���� �� ���� ���� �ڸ��� �ٲٴ� ���� �ݺ�
		for(int i=1;i*2<=heapSize;) { // i�� �ε���, i�� �ڽĳ�尡 ������ ���,
			if(heap[i*2+1]!=0) { // ��������� heap[heapSize]=0 �� �񱳰��� �ݿ��Ǿ �߻��ϴ� ���� ����
			if(Math.abs(heap[i*2])>Math.abs(heap[i])&&Math.abs(heap[i*2+1])>Math.abs(heap[i])) {
				//�з�0) �θ����� ������ �ڽĳ��麸�� ���� ���

				break;
			}

			else if(Math.abs(heap[i*2])<Math.abs(heap[i*2+1])||Math.abs(heap[i*2])==Math.abs(heap[i*2+1])&&heap[i*2]<heap[i*2+1]) {
				//�з�1) ���� �ڽĳ���� ������ ������ ���밪���� �� ���� ��� + �� �ڽĳ���� ���밪�� ���� ���ʸ� �����ϰ��
				// ���ǹ� ���� ���� �ʿ�
				if(Math.abs(heap[i])==Math.abs(heap[i*2])&&heap[i*2]>0) {//�θ�� �ڽĳ�尡 ���밪�� ���� �ڽ��� �����϶� -2, 2, 3 case // �ݷʹ߰�: -2, -1, 1
					break;
				}
				else {
				swap(heap, i, i*2);
				i = i*2;
				}
				}
		
			else if(Math.abs(heap[i*2])>Math.abs(heap[i*2+1])||Math.abs(heap[i*2])==Math.abs(heap[i*2+1])&&heap[i*2]>heap[i*2+1]) {
				//�з�2) ������ �ڽĳ���� ������ ���� ���밪���� �� ���� ��� + �� �ڽĳ���� ���밪�� ���� �����ʸ� �����ϰ��
				// ���ǹ� ���� ���� �ʿ�
				if(Math.abs(heap[i])==Math.abs(heap[i*2+1])&&heap[i*2+1]>0) {//�θ�� �ڽĳ�尡 ���밪�� ���� �ڽ��� �����϶�// -2, 3, 2 case
					break;
				}
				else {
				swap(heap, i, i*2+1);
				i = i*2+1;
				}
				}
			else {
				//�з�3) �� �ڽĳ���� ���� ��ġ�ϴ� ���
				if(heap[i]==heap[i*2]) { // �з�3-1) �θ�, �� �ڽ� ��� ���� ���
					break;
					}
				else if((Math.abs(heap[i*2])==Math.abs(heap[i])&&heap[i]<heap[i*2])) { // �з�3-2) ���񰪵��� ������ �θ� ����, �ڽ��� ����� ��� 
					break;
				}
				else {
					swap(heap, i, i*2);
					i = i*2;
					}
					
			}
			
			// i*2+1 �� 0�� ���̽��� 
			}else {
				if(Math.abs(heap[i*2])>Math.abs(heap[i])||heap[i*2]==heap[i]||Math.abs(heap[i])==Math.abs(heap[i*2])&&heap[i]<heap[i*2]) { 
					// �θ����� ������ ���� �ڽ� ��庸�� ���� ��� + �θ���� �ڽĳ�� ���� ������� + �θ��尡 �ڽİ� ������ ���� ���� �������

					break;
				}
			
				else { // ���� �ڽĳ�尡 �� ���� ���
					swap(heap, i, i*2);
					i = i*2;
					}
				
			}
			}
//		for(int j=1;j<=heapSize;j++) {
//			System.out.println("POP! index: "+j + " value: "+ heap[j]);
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
