package TaskWhile;

public class SumEven1To50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int sum=0;
		while(n<=50) {
			if(n%2==0) {
				sum=sum+n;
				
			}
			n++;
		}
		System.out.println(sum);
	}

}
