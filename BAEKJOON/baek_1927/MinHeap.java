package baek_1927; 

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	  	public class MinHeap {

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
					popMin(heap);
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
			if(heap[i]<heap[i/2]) { // ���� ���� ���� �θ��庸�� ���� ���,
				// �θ����� ���� �������� ���� �ڹٲ۴�
				swap(heap, i, i/2);
			}
			else {
				break;
				}
			}
//			for(int j=1;j<=heapSize;j++) {
//				System.out.println("PUT! index: "+j + " value: "+ heap[j]);
//			}
			}
		

		private static void popMin(int[] heap) throws IOException {
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
//			for(int j=1;j<=heapSize;j++) {
//				System.out.println("POP! index: "+j + " value: "+ heap[j]);
//			}
			
			}
		

		private static void swap(int[] heap, int i, int j) {
			// TODO Auto-generated method stub
			int temp;
			temp = heap[i]; // �θ����� ���� �������� ���� �ڹٲ۴�
			heap[i] = heap[j];
			heap[j] = temp;
			
		}
		
		

	}
