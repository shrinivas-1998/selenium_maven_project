package java_practice;

public class narrowing_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 100.99;
		int b = (int)a;       // 0.99 data loss during narrowing 
		System.out.println(a);
		System.out.println(b);
	}

}
