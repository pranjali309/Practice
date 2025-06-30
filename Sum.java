package TaskWhile;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int n=0;
		System.out.print(a+" "+b+" ");
		while(n<=6) {
			
			int sum=a+b;
			System.out.print(sum +" ");
			a=b;
			b=sum;
			n++;
			
		}
		
	}

}
