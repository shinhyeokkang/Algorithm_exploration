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
		
		int[] heap = new int[n]; //메모리 누수를 막기위해 크기를 n으로 지정
		
		for(int i=0;i<n;i++) {//1부터 N까지 수 입력 
			String x = br.readLine();
			int num = Integer.parseInt(x);
			if(num==0) {// 입력이 0일 경우 최대값인 index 1에 위치한 숫자출력
				popMinabs(heap);
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
		if(Math.abs(heap[i])<Math.abs(heap[i/2])) { // 새로 넣은 수의 절댓값이 부모노드보다 작을 경우,
			//부모노드의 값과 현재노드의 값을 뒤바꾼다
			swap(heap, i, i/2);
		}
		else if(Math.abs(heap[i])==Math.abs(heap[i/2])&&heap[i]<heap[i/2]){ // 부모노드와 절댓값이 같고 숫자는 작을경우
			// 부모노드의 값과 현재노드의 값을 뒤바꾼다
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
			if(Math.abs(heap[i*2])>Math.abs(heap[i])&&Math.abs(heap[i*2+1])>Math.abs(heap[i])) {
				//분류0) 부모노드의 절댓값이 자식노드들보다 작을 경우

				break;
			}

			else if(Math.abs(heap[i*2])<Math.abs(heap[i*2+1])||Math.abs(heap[i*2])==Math.abs(heap[i*2+1])&&heap[i*2]<heap[i*2+1]) {
				//분류1) 왼쪽 자식노드의 절댓값이 오른쪽 절대값보다 더 작을 경우 + 두 자식노드의 절대값이 같고 왼쪽만 음수일경우
				// 조건문 오류 검증 필요
				if(Math.abs(heap[i])==Math.abs(heap[i*2])&&heap[i*2]>0) {//부모와 자식노드가 절대값은 같고 자식은 음수일때 -2, 2, 3 case // 반례발견: -2, -1, 1
					break;
				}
				else {
				swap(heap, i, i*2);
				i = i*2;
				}
				}
		
			else if(Math.abs(heap[i*2])>Math.abs(heap[i*2+1])||Math.abs(heap[i*2])==Math.abs(heap[i*2+1])&&heap[i*2]>heap[i*2+1]) {
				//분류2) 오른쪽 자식노드의 절댓값이 왼쪽 절대값보다 더 작을 경우 + 두 자식노드의 절대값이 같고 오른쪽만 음수일경우
				// 조건문 오류 검증 필요
				if(Math.abs(heap[i])==Math.abs(heap[i*2+1])&&heap[i*2+1]>0) {//부모와 자식노드가 절대값은 같고 자식은 음수일때// -2, 3, 2 case
					break;
				}
				else {
				swap(heap, i, i*2+1);
				i = i*2+1;
				}
				}
			else {
				//분류3) 두 자식노드의 값이 일치하는 경우
				if(heap[i]==heap[i*2]) { // 분류3-1) 부모, 두 자식 모두 같을 경우
					break;
					}
				else if((Math.abs(heap[i*2])==Math.abs(heap[i])&&heap[i]<heap[i*2])) { // 분류3-2) 절댓값들이 같을때 부모가 음수, 자식이 양수인 경우 
					break;
				}
				else {
					swap(heap, i, i*2);
					i = i*2;
					}
					
			}
			
			// i*2+1 이 0인 케이스들 
			}else {
				if(Math.abs(heap[i*2])>Math.abs(heap[i])||heap[i*2]==heap[i]||Math.abs(heap[i])==Math.abs(heap[i*2])&&heap[i]<heap[i*2]) { 
					// 부모노드의 절댓값이 왼쪽 자식 노드보다 작을 경우 + 부모노드와 자식노드 값이 같을경우 + 부모노드가 자식과 절댓값이 같고 값은 작을경우

					break;
				}
			
				else { // 왼쪽 자식노드가 더 작을 경우
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
		temp = heap[i]; // 부모노드의 값과 현재노드의 값을 뒤바꾼다
		heap[i] = heap[j];
		heap[j] = temp;
		
	}
	
	

}
