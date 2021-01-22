package baek_5086;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FactorandMultiple {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		
		while(true) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			String sx = st.nextToken();
			String sy = st.nextToken();
			int x = Integer.parseInt(sx);// int로 형변환
			int y = Integer.parseInt(sy);// int로 형변환
			
			if(x==0&&y==0) { 
				break;
			}
			
			if(x > y) {
				int z = x % y;// 나머지
				if(z==0) {
					bw.write("multiple" + "\n");
				}
				else { 
					bw.write("neither \n");
				}
			}
			else {
				int z = y % x; //나머지
				if(z==0) {
					bw.write("factor" + "\n");
				}
				else { 
					bw.write("neither \n");
				}
			}
			
			
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
