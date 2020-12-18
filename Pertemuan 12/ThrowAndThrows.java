import java.util.Scanner;

class ThrowAndThrows {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan Umur : ");		
		int umur = in.nextInt();

		try {
			validasi(umur);
		}
		catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println("Try Catch selesai");
		}

	}

	static void validasi(int umur) throws ArithmeticException{
		if (umur < 18 )
			throw new ArithmeticException("Umur tidak Valid!");
	}
}