package TaskWhile;

public class Num1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		while(n<=10) {
			if(n%2==0) {
				System.out.print(" "+-n);
			}
			else {
				System.out.print(" "+n);
			}
			n++;
		}
	}

}
