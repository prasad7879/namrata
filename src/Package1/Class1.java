package Package1;

public class Class1 {
	
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		for(int i=1; i<=20; i++) {
			System.out.println(a); // a=0,1,1,2,3,5
			c=a+b;                 // c=1,2,3,5,8
			a=b;                   // a=1,1,2,3,5
			b=c;                   // b=1,2,3,5,8
			}
		}
	}