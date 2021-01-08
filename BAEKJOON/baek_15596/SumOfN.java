package baek_15596;


public class SumOfN {

	 long sum(int[] a) {
		long sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		return sum;
			
	}

}
