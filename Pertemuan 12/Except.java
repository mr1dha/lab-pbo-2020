import java.util.Scanner;
import java.util.InputMismatchException;

class Except {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		Scanner in = new Scanner(System.in);

		while(true) {
			System.out.print("Masukkan Index : ");

			try {
				int index = in.nextInt();
				System.out.println("Index ke "+index+" = " + arr[index]+"\n");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.println("Index yang anda masukkan Tidak ada!\n");
			}
			catch(InputMismatchException e) {
				System.err.println("Input harus berupa Integer\n");
			}
		}
	}
}