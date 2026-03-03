public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum2D(int[][] x) {
		int y=0;
		for (int i=0;i<x.length;i++){
			for (int j=0; j<x[i].length;j++) {
				y+=x[i][j];
			}
		}
		return y;
	}

	public static int sumRow(int[][] x, int y) {
		int z=0;
		for (int i=0;i<x[y].length;i++) {
			z+=x[y][i];
		}
		return z;
	}

	public static int sumColumn(int[][] x, int y) {
		int z=0;
		for (int i=0;i<x.length; i++) {
			z+=x[i][y];
		}
		return z;
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
