package TaskWhile;

public class EvenOddNumber {
	void EvenOddNumberr(int a) {
		if(a%2==0) {
			System.out.println(" Number are Even : "+a);
		}else if(a %2!=0) {
			System.out.println(" Number are Odd :"+a);
		}else {
			System.out.println("Invalid Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddNumber s1=new EvenOddNumber();
		s1.EvenOddNumberr(24);
	}

}
