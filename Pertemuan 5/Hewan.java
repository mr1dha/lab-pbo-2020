public class Hewan {
	private String nama;
	private String makanan;

	public Hewan(String nama, String makanan) {
		this.nama = nama;
		this.makanan = makanan;
	}

	public String getNama() {
		return "Nama hewan : "+ this.nama;
	}

	public void makan() {
		System.out.println("Hewan Makan");
	}

	public void suara(){
		System.out.println("Hewan Bersuara");
	}
}