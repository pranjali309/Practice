package TaskWhile;

public class CounEven1to25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int count=0;
		while(n<=25) {
			
			if(n%2==0) {
				
				count++;
				
			}
			
			n++;
			
		}
		
		System.out.println(count);
	}

}
