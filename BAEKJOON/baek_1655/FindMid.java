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
		int[] heapMin = new int[n]; // 초기값 0으로 하면 안됨!!
		
		for(int j=0; j<n;j++) {
			heapMax[j] = 10001;
			heapMin[j] = 10001;
		}
		
		for(int i=0;i<n;i++) {//1부터 N까지 수 입력 
			String x = br.readLine();
			int num = Integer.parseInt(x);
			if(heapMaxSize<=heapMinSize) { // Max의 크기가 Min보다 작거나 같을때
				putMax(heapMax,num); // Max에 숫자 삽입
				
			}
			else {
				putMin(heapMin,num); // 나머지 경우엔 Min에 삽입 
			}
			if(heapMax[1]>heapMin[1]&&heapMin[1]!=10001) { // Max의 최댓값이 Min의 최솟값보다 클 경우, 둘을 스왑 //  TO DO !!
				// TO DO: 1 0 0 -4 -2 4 8 case일때, 오른쪽에서 -4를 넘기는것 처리
				int tempMax = heapMax[1];
				int tempMin = heapMin[1];

				popMax(heapMax); // Max[1] 을 pop하고
				putMax(heapMax,tempMin); // Min의 최솟값을 put
				popMin(heapMin); // Min[1]을 pop 하고
				putMin(heapMin,tempMax);// Max의 최댓값을 put
				
			}
			
			
			
				 bw.write(heapMax[1]+"\n"); // heapMax의 가장 큰 값이 곧 중간값이 된다
			}
		
		br.close();
		bw.flush();
		bw.close();

	
	}
	private static void putMax(int[] heap, int num) {
		// TODO Auto-generated method stub

		
		heap[++heapMaxSize] = num; // heap의 크기를 1 늘리고 그 위치에 num 삽입
		
		for(int i = heapMaxSize;i>1;i/=2) { // 초기값은 현재 인덱스인 heapSize, 인덱스가 1이 되기전까지, 매 반복마다 2로 나눈값(부모노드)으로 변경 
		if(heap[i]>heap[i/2]) { // 새로 넣은 값이 부모노드보다 클 경우,
			// 부모노드의 값과 현재노드의 값을 뒤바꾼다
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

		
		heap[++heapMinSize] = num; // heap의 크기를 1 늘리고 그 위치에 num 삽입
		
		for(int i = heapMinSize;i>1;i/=2) { // 초기값은 현재 인덱스인 heapSize, 인덱스가 1이 되기전까지, 매 반복마다 2로 나눈값(부모노드)으로 변경 
		if(heap[i]<heap[i/2]) { // 새로 넣은 값이 부모노드보다 작을 경우,
			// 부모노드의 값과 현재노드의 값을 뒤바꾼다
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

		if(heapMaxSize==0) {// heap이 빈 배열일 경우
		
			return;
		}
		
		heap[1] = heap[heapMaxSize];// 가장 마지막 노드의 값을 root 노드에 삽입
		heap[heapMaxSize--] = 10001; // 마지막 노드값을 0으로 초기화하고, 배열길이를 1 줄임
		// 두 자식노드중 더 큰값과 자리를 바꾸는 과정 반복
		for(int i=1;i*2<=heapMaxSize;) { // i는 인덱스, i의 자식노드가 존재할 경우,
			if(heap[i*2+1] != 10001) {
			if(heap[i*2]<heap[i]&&heap[i*2+1]<heap[i]) { // 부모노드가 자식노드보다 클 경우

				break;
			}
			
			else if(heap[i*2]>heap[i*2+1]) { // 왼쪽 자식노드가 더 클 경우
				swap(heap, i, i*2);
				i = i*2;
				}
			else { // 오른쪽 자식노드가 더 클 경우
				swap(heap, i, i*2+1);
				i = i*2+1;	
			}
			}
			else { // 오른쪽 자식 노드가 10001일 경우  
				if(heap[i*2]<=heap[i]) { // 부모노드가 자식노드보다 크거나 같을 경우

					break;
				}
				
				else { // 왼쪽 자식노드가 더 클 경우
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

		if(heapMinSize==0) {// heap이 빈 배열일 경우
			return;
		}
		
		heap[1] = heap[heapMinSize];// 가장 마지막 노드의 값을 root 노드에 삽입
		heap[heapMinSize--] = 10001; // 마지막 노드값을 0으로 초기화하고, 배열길이를 1 줄임
		// 두 자식노드중 더 작은 값과 자리를 바꾸는 과정 반복
		for(int i=1;i*2<=heapMinSize;) { // i는 인덱스, i의 자식노드가 존재할 경우,
			if(heap[i*2+1]!=10001) { // 사라져야할 heap[heapSize]=0 이 비교값에 반영되어서 발생하는 오류 방지
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
//		for(int j=1;j<=heapMinSize;j++) {
//			System.out.println("POP Min! index: "+j + " value: "+ heap[j]);
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


