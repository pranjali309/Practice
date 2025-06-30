package TaskWhile;

public class CountOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =25;
		int count=0;
		while(n>=1) {
			if(n%2!=0) {
				count ++;
			}
			n--;
			
		}
		System.out.println(count);
	}

}
