
public class CodingChallenge {

	public static void main(String[] args) {
		int[][] arr = { { 3, 4, 5, 6 }, { 6, 7, 8, 9 }, { 2, 3, 4, 5 }, { 7, 6, 5, 4 } };

		int sumDiag = 0;

		for (int i = 0; i < arr.length; ++i) {
			sumDiag += arr[i][i];
		}
		System.out.println(sumDiag);

		int sumRevDiag = 0;
		int revDiagPos = arr.length - 1;
		for (int i = 0; i < arr.length; ++i) {
			sumRevDiag += arr[i][revDiagPos--];
		}
		System.out.println(sumRevDiag);
	}

}
