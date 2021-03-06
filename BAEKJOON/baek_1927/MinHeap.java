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
			
			int[] heap = new int[n]; //메모리 누수를 막기위해 크기를 n으로 지정
			
			for(int i=0;i<n;i++) {//1부터 N까지 수 입력 
				String x = br.readLine();
				int num = Integer.parseInt(x);
				if(num==0) {// 입력이 0일 경우 최대값인 index 1에 위치한 숫자출력
					popMin(heap);
				}
				else {// 나머지의 경우 입력값을 heap에 넣고 정렬
					putNum(heap, num);
				}
					 
				}
			
			br.close();
			bw.flush();
			bw.close();
		}

		private static void putNum(int[] heap, int num) {
			// TODO Auto-generated method stub

			
			heap[++heapSize] = num; // heap의 크기를 1 늘리고 그 위치에 num 삽입
			
			for(int i = heapSize;i>1;i/=2) { // 초기값은 현재 인덱스인 heapSize, 인덱스가 1이 되기전까지, 매 반복마다 2로 나눈값(부모노드)으로 변경 
			if(heap[i]<heap[i/2]) { // 새로 넣은 값이 부모노드보다 작을 경우,
				// 부모노드의 값과 현재노드의 값을 뒤바꾼다
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

			if(heapSize==0) {// heap이 빈 배열일 경우
				bw.write(0+"\n");
				return;
			}
			
			bw.write(heap[1]+"\n"); // 힙의 root 노드를 출력
			heap[1] = heap[heapSize];// 가장 마지막 노드의 값을 root 노드에 삽입
			heap[heapSize--] = 0; // 마지막 노드값을 0으로 초기화하고, 배열길이를 1 줄임
			// 두 자식노드중 더 작은 값과 자리를 바꾸는 과정 반복
			for(int i=1;i*2<=heapSize;) { // i는 인덱스, i의 자식노드가 존재할 경우,
				if(heap[i*2+1]!=0) { // 사라져야할 heap[heapSize]=0 이 비교값에 반영되어서 발생하는 오류 방지
				if(heap[i*2]>heap[i]&&heap[i*2+1]>heap[i]) { // 부모노드가 자식노드보다 작을 경우

					break;
				}
		
				else if(heap[i*2]<heap[i*2+1]) { // 왼쪽 자식노드가 더 작을 경우
					swap(heap, i, i*2);
					i = i*2;
					}
				else { // 오른쪽 자식노드가 더 작을 경우
					swap(heap, i, i*2+1);
					i = i*2+1;	
				}
				}else {
					if(heap[i*2]>heap[i]) { // 부모노드가 왼쪽 자식 노드보다 작을 경우

						break;
					}
			
					else { // 왼쪽 자식노드가 더 작을 경우
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
			temp = heap[i]; // 부모노드의 값과 현재노드의 값을 뒤바꾼다
			heap[i] = heap[j];
			heap[j] = temp;
			
		}
		
		

	}
