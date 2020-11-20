public class Burung extends Hewan {
	private int panjang_sayap;

	public Burung(String nama, String makanan, int panjang_sayap){
		super(nama, makanan);
		this.panjang_sayap = panjang_sayap;
	}

	public String getNama() {
		return "Burung :  "+ super.getNama();
	}

	public void terbang() {
		System.out.println("Burung "+ super.getNama() +" Terbang");
	}
}