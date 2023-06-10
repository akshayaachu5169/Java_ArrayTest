package arrayTest;

public class TwoDimentionalArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][3];
//1st iteration
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;

		// 2nd iteration
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		// 3rd iteration
		a[2][0] = 70;
		a[2][1] = 80;
		a[2][2] = 90;
		//a[2][3]=150;
		// 4th iteration
		a[3][0] = 100;
		a[3][1] = 120;
		a[3][2] = 130;
		// System.out.println(a[1][2]);
        //System.out.println(a[0][1]);
		 //System.out.println(a[2][3]);
		System.out.println("lenght of row:" + a.length);
		System.out.println("lenght of column:" + a[0].length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
	}
}
