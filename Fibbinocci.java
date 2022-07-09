
public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum=0;
		int secnum=1;
		int sum=0;
		System.out.println(firstnum);
		for(int i=1;i<10;i++) {
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println(sum);
		}
	}
}
