package arrayTest;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		a[9] = 60;
		
		// System.out.println(a[5]);default
		//System.out.println(a[12]);ArrayIndexOutOfBoundsException
		System.out.println(a[8]);
		System.out.println("length of a:" + a.length);
	}

}
