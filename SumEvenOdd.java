package TaskWhile;

public class SumEvenOdd {
	void SumEvenOdddd(int a,int b) {
		int c=a+b;
		
		if(a%2==0 || b%2==0) {
			System.out.println("Even Number Pair "+c);
		}else if(a%2!=0 || b%2!=0) {
			System.out.println("Odd Number Pair "+c);
		}else {
			System.out.println("Not PAir Of Even Or Odd");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumEvenOdd s1=new SumEvenOdd();
		s1.SumEvenOdddd(24, 30);
	}

}
