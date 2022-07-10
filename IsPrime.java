
public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int rem=0;
		int m =n/2;
		for(int i=2;i<m;i++)
		{
			if(n%i==0) {
				System.out.println("its not prime");
				rem=1;
				break;
				
			}
		}
		if(rem==0) {
			System.out.println("Prime");
		}
	}

}
